package com.quarkdown.core.ast.quarkdown.block.toc

import com.quarkdown.core.ast.InlineContent
import com.quarkdown.core.ast.Node
import com.quarkdown.core.visitor.node.NodeVisitor

/**
 * When this node is rendered, the heading of the current table of contents is displayed.
 * @param title title of the table of contents. If empty, no title is displayed.
 * If `null`, the default localized title is used.
 */
class TableOfContentsHeading(
    val title: InlineContent? = null,
) : Node {
    override fun <T> accept(visitor: NodeVisitor<T>): T = visitor.visit(this)
}
