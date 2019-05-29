package com.photowey.pdf.template.printer.engine;

import com.photowey.pdf.template.printer.enums.TemplateWriteEnum;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

/**
 * FreeMarkerTemplateEngine
 *
 * @author WcJun
 * @date 2019/05/29
 */
public class FreeMarkerTemplateEngine extends AbstractTemplateEngine {

    public FreeMarkerTemplateEngine(Map<String, ?> params) {
        this.params = params;
    }

    public String renderString(String templateStr, Map<String, ?> context) {
        try {
            StringWriter writer = new StringWriter();
            Template t = new Template("name", new StringReader(templateStr), new Configuration());
            t.process(context, writer);
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("Render String exception", e);
        }
    }

    public String renderTemplate(Template template, Object context) {
        try {
            StringWriter writer = new StringWriter();
            template.process(context, writer);
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("Render Template exception", e);
        }
    }

    public Configuration buildConfiguration(String templatePath) {
        // 创建一个FreeMarker实例, 负责管理FreeMarker模板的Configuration实例
        Configuration cfg = new Configuration();
        // 指定FreeMarker模板文件的位置
        cfg.setClassForTemplateLoading(getClass(), templatePath);


        return cfg;
    }

    @Override
    public String write(String templatePath, String templateName, TemplateWriteEnum templateWriteEnum) throws IOException {
        String templateStr = "";
        switch (templateWriteEnum) {
            // # renderString()
            case STRING:
                break;
            // # renderTemplate()
            case TEMPLATE:
                Configuration cfg = this.buildConfiguration(templatePath);
                Template template = cfg.getTemplate(templateName);
                templateStr = this.renderTemplate(template, this.params);
                break;
            default:
                break;
        }

        return templateStr;
    }
}
