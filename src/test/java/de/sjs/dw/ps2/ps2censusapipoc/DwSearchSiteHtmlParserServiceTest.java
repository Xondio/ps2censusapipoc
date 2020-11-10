package de.sjs.dw.ps2.ps2censusapipoc;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class DwSearchSiteHtmlParserServiceTest {

    @Autowired
    DwSeachrSiteHtmlParserService dwSeachrSiteHtmlParserService;

    Document document;

    @BeforeAll
    public void beforeAll() throws IOException {
        document = dwSeachrSiteHtmlParserService.parseDWHQMemberSearch();
    }

    @Test
    public void parseDWHQMainPageTest() throws IOException {
        Document doc = dwSeachrSiteHtmlParserService.parseDWHQMainPage();

        System.out.println(doc.toString());

        assertNotNull(doc);
    }


    @Test
    public void parseDWHQMemberSearch() throws IOException {
        Document doc = dwSeachrSiteHtmlParserService.parseDWHQMemberSearch();

        System.out.println(doc.toString());

        assertNotNull(doc);
    }

    @Test
    void parsePage5_OfMemberSearch_andThenPage6() throws IOException {
        Document doc = dwSeachrSiteHtmlParserService.parseDWHQMemberSearch(5);

        assertNotNull(doc);
        Document doc2 = dwSeachrSiteHtmlParserService.parseDWHQMemberSearch(6);

        assertNotNull(doc2);

        assertNotEquals(doc.toString(),doc2.toString());

    }

    @Test
    public void findSearchMainElementTest() throws IOException {
        Element element = dwSeachrSiteHtmlParserService.extractSearchResultsFromPage(document);

        System.out.println(element.toString());

        assertNotNull(element);
        assertFalse(element.children().isEmpty());
    }

    @Test
    public void findStreamItemContainerTest() throws IOException {
        Element element = dwSeachrSiteHtmlParserService.extractSearchResultsFromPage(document);

        Elements streamItem_container = dwSeachrSiteHtmlParserService.findStreamItemContainers(element);

        assertNotNull(streamItem_container);
        assertFalse(streamItem_container.isEmpty());
        assertEquals(24, streamItem_container.size());
    }

    @Test
    public void getMemberIdFromStreamItemContainerTest() throws IOException {
        Element element = dwSeachrSiteHtmlParserService.extractSearchResultsFromPage(document);

        Elements streamItem_container = dwSeachrSiteHtmlParserService.findStreamItemContainers(element);

        Element el = streamItem_container.get(0);
        String str = dwSeachrSiteHtmlParserService.getMemberIdFromStreamItemContainer(el);

        assertTrue(isNumeric(str));
    }


    @Test
    public void getMemberNameFromStreamItemContainerTest() throws IOException {
        Element element = dwSeachrSiteHtmlParserService.extractSearchResultsFromPage(document);
        Elements streamItem_container = dwSeachrSiteHtmlParserService.findStreamItemContainers(element);

        Element el = streamItem_container.get(0);

        String str = dwSeachrSiteHtmlParserService.getMemberNameFromStreamItemContainer(el);

        assertNotNull(str);
        assertFalse(isNumeric(str));
    }

    @Test
    public void getMemberProfileUrlFromStreamItemContainerTest() throws IOException {
        Element element = dwSeachrSiteHtmlParserService.extractSearchResultsFromPage(document);
        Elements streamItem_container = dwSeachrSiteHtmlParserService.findStreamItemContainers(element);

        Element el = streamItem_container.get(0);

        String str = dwSeachrSiteHtmlParserService.getMemberProfileUrlFromStreamItemContainer(el);

        assertNotNull(str);
        assertFalse(isNumeric(str));
        assertTrue(str.startsWith("http"));
    }

    @Test
    void getMaxPageCountFromFirstSearchSiteTest() {
        Integer maxPageCount = dwSeachrSiteHtmlParserService.getMaxPageCount(document);

        assertNotNull(maxPageCount);
        assertEquals(19, maxPageCount);
    }

    @Test
    void getAllElementsFromSite1ToSiteMax() throws IOException {
        Elements memberElements = dwSeachrSiteHtmlParserService.getAllMemberInformationElements();

        assertNotNull(memberElements);
        assertTrue(memberElements.size() > 24);
    }

    @Test
    void getAllHasForumsMemberInformationFromAllSearchPages() throws IOException {
        List<HasForumsMemberInformation> memberInformationObjects = dwSeachrSiteHtmlParserService.
                getAllHasForumsMemberInformationObjects(Ps2Member::new);

        assertNotNull(memberInformationObjects);
        assertFalse(memberInformationObjects.isEmpty());
        assertTrue(memberInformationObjects.size() > 24);

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


}