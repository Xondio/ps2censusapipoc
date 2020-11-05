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

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class HtmlParserServiceTest {

    @Autowired
    HtmlParserService htmlParserService;

    Document document;

    @BeforeAll
    public void beforeAll() throws IOException {
        document = htmlParserService.parseDWHQMemberSearch();
    }

    @Test
    public void parseDWHQMainPageTest() throws IOException {
        Document doc = htmlParserService.parseDWHQMainPage();

        System.out.println(doc.toString());

        assertNotNull(doc);
    }


    @Test
    public void parseDWHQMemberSearch() throws IOException {
        Document doc = htmlParserService.parseDWHQMemberSearch();

        System.out.println(doc.toString());

        assertNotNull(doc);
    }


    @Test
    public void findSearchMainElementTest() throws IOException {
        Element element = htmlParserService.extractSearchResultsFromPage(document);

        System.out.println(element.toString());

        assertNotNull(element);
        assertFalse(element.children().isEmpty());
    }

    @Test
    public void findStreamItemContainerTest() throws IOException {
        Element element = htmlParserService.extractSearchResultsFromPage(document);

        Elements streamItem_container = htmlParserService.findStreamItemContainers(element);

        assertNotNull(streamItem_container);
        assertFalse(streamItem_container.isEmpty());
        assertEquals(24, streamItem_container.size());
    }

    @Test
    public void getMemberIdFromStreamItemContainerTest() throws IOException {
        Element element = htmlParserService.extractSearchResultsFromPage(document);

        Elements streamItem_container = htmlParserService.findStreamItemContainers(element);

        Element el = streamItem_container.get(0);
        String str = htmlParserService.getMemberIdFromStreamItemContainer(el);

        assertTrue(isNumeric(str));
    }


    @Test
    public void getMemberNameFromStreamItemContainerTest() throws IOException {
        Element element = htmlParserService.extractSearchResultsFromPage(document);
        Elements streamItem_container = htmlParserService.findStreamItemContainers(element);

        Element el = streamItem_container.get(0);

        String str = htmlParserService.getMemberNameFromStreamItemContainer(el);

        assertNotNull(str);
        assertFalse(isNumeric(str));
    }

    @Test
    public void getMemberProfileUrlFromStreamItemContainerTest() throws IOException {
        Element element = htmlParserService.extractSearchResultsFromPage(document);
        Elements streamItem_container = htmlParserService.findStreamItemContainers(element);

        Element el = streamItem_container.get(0);

        String str = htmlParserService.getMemberProfileUrlFromStreamItemContainer(el);

        assertNotNull(str);
        assertFalse(isNumeric(str));
        assertTrue(str.startsWith("http"));
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