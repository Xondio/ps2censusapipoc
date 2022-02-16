package de.sjs.dw.ps2.db.entities.traits;

public interface HasForumsMemberInformation {

    void setForumsName(String name);
    String getForumsName();

    void setForumsMemberPageUrl(String forumsMemberPageUrl);
    String getForumsMemberPageUrl();

    void setForumsMemberId(String forumsMemberId);
    String getForumsMemberId();
}
