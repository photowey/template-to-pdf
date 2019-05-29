package com.photowey.pdf.template.printer.handler;

import com.photowey.pdf.template.printer.config.ITextContext;
import com.lowagie.text.DocumentException;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * @author WcJun
 * @date 2019/05/29
 */
public interface ITextHandler {
    /**
     * 打印PDF
     *
     * @param context 配置上下文
     * @param params  模板参数
     * @param out     输出流
     * @throws IOException
     * @throws DocumentException
     */
    void toPDF(ITextContext context, Map<String, ?> params, OutputStream out) throws IOException, DocumentException;
}
