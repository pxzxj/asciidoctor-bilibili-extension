package com.github.pxzxj;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.extension.JavaExtensionRegistry;
import org.asciidoctor.jruby.extension.spi.ExtensionRegistry;

public class BilibiliExtensionRegistry implements ExtensionRegistry {
    public void register(Asciidoctor asciidoctor) {
        JavaExtensionRegistry extensionRegistry = asciidoctor.javaExtensionRegistry();
        extensionRegistry.blockMacro(new BilibiliVideoProcessor());
    }
}
