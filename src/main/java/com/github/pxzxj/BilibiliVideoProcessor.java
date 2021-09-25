package com.github.pxzxj;

import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.extension.BlockMacroProcessor;
import org.asciidoctor.extension.Name;

import java.util.Map;

@Name("bilibili")
public class BilibiliVideoProcessor extends BlockMacroProcessor {

    private final String CONTENT = "<div style=\"position: relative; padding: 30%;\">\n" +
            "  <iframe src=\"//player.bilibili.com/player.html?bvid=target&high_quality=1&page=1\" style=\"border-width: 0; position: absolute; width: 100%; height: 100%; top: 0; left: 0;\" allowfullscreen></iframe>\n" +
            "</div>";

    public Object process(StructuralNode parent, String target, Map<String, Object> attributes) {
        return createBlock(parent, "pass", CONTENT.replace("target", target));
    }

}
