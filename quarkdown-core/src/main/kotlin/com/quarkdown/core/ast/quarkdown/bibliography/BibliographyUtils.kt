package com.quarkdown.core.ast.quarkdown.bibliography

import com.quarkdown.core.ast.InlineContent
import com.quarkdown.core.ast.Node
import com.quarkdown.core.ast.base.block.Heading
import com.quarkdown.core.ast.dsl.buildInline
import com.quarkdown.core.context.Context
import com.quarkdown.core.context.localization.localizeOrNull

/**
 * Creates the heading for the Bibliography.
 * @param title title of the bibliography. If `null`, the default localized title is used.
 * @param isDecorative whether the heading is decorative (see [Heading.isDecorative]).
 * @returns a [Heading] node.
 */
fun createBibliographyHeading(
    title: InlineContent?,
    isDecorative: Boolean = false,
    context: Context,
): Node {
    val localizedTitle = context.localizeOrNull(key = "bibliography")

    return Heading(
        depth = 1,
        text = title ?: buildInline { localizedTitle?.let { text(it) } },
        isDecorative = isDecorative,
    )
}
