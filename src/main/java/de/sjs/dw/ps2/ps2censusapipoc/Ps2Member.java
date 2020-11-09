package de.sjs.dw.ps2.ps2censusapipoc;

public class Ps2Member implements HasForumsMemberInformation{
    private String forumsName;
    private String forumsMemberPageUrl;
    private String forumsMemberId;

    @Override
    public void setForumsName(String forumsName) {
        this.forumsName = forumsName;
    }

    @Override
    public String getForumsName() {
        return forumsName;
    }

    @Override
    public void setForumsMemberPageUrl(String forumsMemberPageUrl) {
        this.forumsMemberPageUrl = forumsMemberPageUrl;
    }

    @Override
    public String getForumsMemberPageUrl() {
        return forumsMemberPageUrl;
    }

    @Override
    public void setForumsMemberId(String forumsMemberId) {
        this.forumsMemberId = forumsMemberId;
    }

    @Override
    public String getForumsMemberId() {
        return forumsMemberId;
    }
}
