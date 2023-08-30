package com.mysite.spring_study;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {

    public String markdown(String markdonw) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdonw);
        HtmlRenderer renderer = HtmlRenderer.builder().build();

        return renderer.render(document);
    }

}
