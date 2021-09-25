package com.github.pxzxj;

import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.extension.BlockMacroProcessor;
import org.asciidoctor.extension.Name;

import java.util.Map;

@Name("bilibili")
public class BilibiliVideoProcessor extends BlockMacroProcessor {

    private final String CONTENT = "<div class=\"videoblock\"><div class=\"content\">\n" +
            "  <iframe width=\"600\" height=\"500\" src=\"//player.bilibili.com/player.html?bvid=target&high_quality=1&page=1\"  border=\"0\" frameborder=\"no\" framespacing=\"0\" scrolling=\"no\" allowfullscreen=\"true\"></iframe>\n" +
            "</div></div>";

    public Object process(StructuralNode parent, String target, Map<String, Object> attributes) {
        return createBlock(parent, "pass", CONTENT.replace("target", target));
    }

}
