package com.photowey.pdf.template.printer.engine;

import com.photowey.pdf.template.printer.enums.TemplateWriteEnum;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * 模板引擎抽象类
 *
 * @author WcJun
 * @date 2019/05/29
 */
public abstract class AbstractTemplateEngine {

    public static final String UTF8 = Charset.forName("UTF-8").name();

    public Map<String, ?> params;

    /**
     * 将模板转化成为字符串
     *
     * @param templatePath      模板文件路径
     * @param templatePath      模板文件名称
     * @param templateWriteEnum 生成模板的方式 字符串 | 模板
     * @return 字符串化的模版内容
     * @throws IOException IO异常
     * @author WcJun
     * @date 2019/05/29
     */
    public abstract String write(String templatePath, String templateName, TemplateWriteEnum templateWriteEnum) throws Exception;
}
