package com.photowey.pdf.template.printer.handler;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;
import com.photowey.pdf.template.printer.config.ITextContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * ITextHandlerAdaptor
 *
 * @author WcJun
 * @date 2019/05/29
 */
public abstract class ITextHandlerAdaptor implements ITextHandler {

    /**
     * 将 模板字符串 转换为 PDF
     *
     * @param context     配置上下文
     * @param templateStr 模板字符串
     * @param out         输出流
     * @throws DocumentException
     * @throws IOException
     * @author WcJun
     * @date 2019/05/29
     * @see {@link com.photowey.pdf.template.printer.config.ITextContext}
     * @see {@link com.photowey.pdf.template.printer.handler.ITextHandlerTest#toPDF()}
     */
    public void toPDF(ITextContext context, String templateStr, OutputStream out) throws DocumentException, IOException {
        ITextRenderer renderer = new ITextRenderer();
        renderer.getFontResolver()
                .addFont(
                        context.getFontPath() + context.getFontName(),
                        BaseFont.IDENTITY_H,
                        BaseFont.NOT_EMBEDDED
                );
        renderer.setDocumentFromString(templateStr);
        renderer.layout();

        renderer.createPDF(out, false);
        renderer.finishPDF();
        out.flush();
        out.close();
    }

}
