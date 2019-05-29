package com.photowey.pdf.template.printer.handler;

import com.lowagie.text.DocumentException;
import com.photowey.pdf.template.printer.config.ITextContext;
import com.photowey.pdf.template.printer.engine.FreeMarkerTemplateEngine;
import com.photowey.pdf.template.printer.enums.TemplateWriteEnum;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * IText 处理器
 *
 * @author WcJun
 * @date 2019/05/29
 */
public class ITextHandlerImpl extends ITextHandlerAdaptor {

    /**
     * 将 模板字符串 转换为 PDF
     *
     * @param context 配置上下文
     * @param params  填充模板上下文的参数
     * @param out     输出流
     * @throws DocumentException
     * @throws IOException
     * @author WcJun
     * @date 2019/05/29
     * @see {@link com.photowey.pdf.template.printer.config.ITextContext}
     * @see {@link com.photowey.pdf.template.printer.handler.ITextHandlerTest#toPDF()}
     */
    @Override
    public void toPDF(ITextContext context, Map<String, ?> params, OutputStream out) throws IOException, DocumentException {
        // 生成 模板引擎
        FreeMarkerTemplateEngine templateEngine = new FreeMarkerTemplateEngine(params);
        // 将模板转换为 字符串
        String templateStr = templateEngine.write(context.getTemplatePath(), context.getTemplateFileName(), TemplateWriteEnum.TEMPLATE);
        // 转换 PDF
        this.toPDF(context, templateStr, out);
    }
}
