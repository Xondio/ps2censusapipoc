package de.sjs.dw.ps2.ps2censusapipoc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HtmlParserService {


    public Document parseDWHQMainPage() throws IOException {
        String url = "http://druckwelle-hq.de";

        return Jsoup.connect(url).get();
    }

    public Document parseDWHQMemberSearch() throws IOException {
        String urlCoreMembers = "https://druckwelle-hq.de/search/?&type=core_members&page=5&joinedDate=any&group[13]=1";

        return Jsoup.connect(urlCoreMembers).get();
    }

    public Element extractSearchResultsFromPage(Document doc){
        return doc.getElementById("elSearch_main");

    }

    public Elements findStreamItemContainers(Element element) {
        return element.getElementsByClass("ipsStreamItem_container");
    }

    public String getMemberIdFromStreamItemContainer(Element el) {
        Elements elementDataFollowIds = el.getElementsByAttribute("data-followid");

        return elementDataFollowIds.get(0).attr("data-followid");
    }

    public String getMemberNameFromStreamItemContainer(Element el) {
        Elements ipsList_reset = el.getElementsByClass("ipsStreamItem_title");
        Element a = ipsList_reset.get(0);

        return a.text();
    }

    public String getMemberProfileUrlFromStreamItemContainer(Element el) {
        Elements ipsList_reset = el.getElementsByClass("ipsStreamItem_title");
        Element a = ipsList_reset.get(0);

        return a.children().get(0).attr("href");
    }
}
