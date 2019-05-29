package com.photowey.pdf.template.printer.config;

/**
 * IText 配置
 *
 * @author WcJun
 * @date 2019/05/29
 */
public class ITextContext {
    /**
     * 模板路径
     */
    private String templatePath;
    /**
     * 模板名称
     */
    private String templateFileName;
    /**
     * 字体路径
     */
    private String fontPath;
    /**
     * 字体名称
     */
    private String fontName;

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public String getTemplateFileName() {
        return templateFileName;
    }

    public void setTemplateFileName(String templateFileName) {
        this.templateFileName = templateFileName;
    }

    public String getFontPath() {
        return fontPath;
    }

    public void setFontPath(String fontPath) {
        this.fontPath = fontPath;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }
}
