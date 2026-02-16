package com.quarkdown.core.ast.quarkdown.bibliography

import com.quarkdown.core.ast.InlineContent
import com.quarkdown.core.ast.Node
import com.quarkdown.core.visitor.node.NodeVisitor

/**
 * When this node is rendered, the heading of the current bibliography is displayed.
 * @param title title of the bibliography. If `null`, the default localized title is used.
 * @param isDecorative whether the heading is decorative.
 */
class BibliographyHeading(
    val title: InlineContent? = null,
    var isDecorative: Boolean = false,
) : Node {
    override fun <T> accept(visitor: NodeVisitor<T>): T = visitor.visit(this)
}
