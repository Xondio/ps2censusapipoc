package de.sjs.dw.ps2.ps2censusapipoc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DwSeachrSiteHtmlParserService {
    private static String SEARCH_URL = "https://druckwelle-hq.de/search/?&type=core_members&page=1&joinedDate=any&group[13]=1";

    public Document parseDWHQMainPage() throws IOException {
        String url = "http://druckwelle-hq.de";

        return Jsoup.connect(url).get();
    }

    public Document parseDWHQMemberSearch() throws IOException {
        return parseDWHQMemberSearch(1);
    }

    public Document parseDWHQMemberSearch(int i) throws IOException {
        String urlCoreMembers = "https://druckwelle-hq.de/search/?&type=core_members&joinedDate=any&group[13]=1";

        return Jsoup.connect(urlCoreMembers).data("page",String.valueOf(i)).get();
    }


    protected Element extractSearchResultsFromPage(Document doc){
        return doc.getElementById("elSearch_main");

    }

    protected Elements findStreamItemContainers(Element element) {
        return element.getElementsByClass("ipsStreamItem_container");
    }

    protected String getMemberIdFromStreamItemContainer(Element el) {
        Elements elementDataFollowIds = el.getElementsByAttribute("data-followid");

        return elementDataFollowIds.get(0).attr("data-followid");
    }

    protected String getMemberNameFromStreamItemContainer(Element el) {
        Elements ipsList_reset = el.getElementsByClass("ipsStreamItem_title");
        Element a = ipsList_reset.get(0);

        return a.text();
    }

    protected String getMemberProfileUrlFromStreamItemContainer(Element el) {
        Elements ipsList_reset = el.getElementsByClass("ipsStreamItem_title");
        Element a = ipsList_reset.get(0);

        return a.children().get(0).attr("href");
    }

    protected Integer getMaxPageCount(Document document) {
        Elements elementsByClass = document.getElementsByClass("ipsPagination_last");
        String resultStr = getFirstNotNullDataPageAttributeFromIpsPagination_lastElements(elementsByClass);

        if (resultStr != null)
            return Integer.parseInt(resultStr);

        return null;
    }

    protected String getFirstNotNullDataPageAttributeFromIpsPagination_lastElements(Elements elementsByClass) {
        for (Element e : elementsByClass) {
            String result = e.attr("data-page");
            if (null != result && !result.isBlank())
                return result;
            result = getFirstNotNullDataPageAttributeFromIpsPagination_lastElements(e.children());
            if (null != result && !result.isBlank())
                return result;
        }

        return null;
    }


    public Elements getAllMemberInformationElements() throws IOException {
        Document docSite1 = parseDWHQMemberSearch();
        Integer maxPageCount = getMaxPageCount(docSite1);
        Element element = extractSearchResultsFromPage(docSite1);
        Elements streamItemContainersFromSite = findStreamItemContainers(element);
        for (int i = 1; i < maxPageCount; i++) {
            streamItemContainersFromSite.addAll(getMemberInformationElementsFormPage(i));
        }

        return streamItemContainersFromSite;
    }

    private Elements getMemberInformationElementsFormPage(int pageNumber) throws IOException {
        Document doc = parseDWHQMemberSearch(pageNumber);
        Element elem = extractSearchResultsFromPage(doc);
        return findStreamItemContainers(elem);
    }

    public void getAllHasForumsMemberInformationObjects() throws IOException {
        Elements informationElements = getAllMemberInformationElements();
        for (Element elem :
                informationElements) {
            String memberName = getMemberNameFromStreamItemContainer(elem);
            // TODO get rest of those Fields
        }

    }
}
