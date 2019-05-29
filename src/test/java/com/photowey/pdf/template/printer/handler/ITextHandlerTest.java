package com.photowey.pdf.template.printer.handler;

import com.lowagie.text.DocumentException;

import java.io.IOException;

/**
 * ITextHandlerTest
 *
 * @Created by WcJun
 * @date 2019/05/29
 */
public class ITextHandlerTest {

    public void toPDF() throws IOException, DocumentException {
        /*String classPath = getClass().getResource("/").getPath();
        ITextContext context = ITextContext.builder()
                .templatePath("/templates")
                .templateFileName("photowey.ftl")
                .fontPath("/templates/font/")
                .fontName("simsun.ttc")
                .build();

        // 设置 填充模板的上下文数据
        Map<String, Object> params = new HashMap<>();
        params.put("title", "标题");
        ...

        ITextHandler handler = new ITextHandlerImpl();
        FileOutputStream out = new FileOutputStream(new File("D://photowey.pdf"));
        handler.toPDF(context, params, out);*/

    }
}