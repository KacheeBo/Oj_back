package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 20:34
 * describe:
 * 编译语言表
 */
public class CompilerLanguage implements Serializable
{
    private Integer languageId;
    private String languageName;

    public CompilerLanguage()
    {
    }

    public CompilerLanguage(Integer languageId, String languageName)
    {
        this.languageId = languageId;
        this.languageName = languageName;
    }

    public Integer getLanguageId()
    {
        return languageId;
    }

    public void setLanguageId(Integer languageId)
    {
        this.languageId = languageId;
    }

    public String getLanguageName()
    {
        return languageName;
    }

    public void setLanguageName(String languageName)
    {
        this.languageName = languageName;
    }

    @Override
    public String toString()
    {
        return "CompilerLanguage{" +
                "languageId=" + languageId +
                ", languageName='" + languageName + '\'' +
                '}';
    }
}