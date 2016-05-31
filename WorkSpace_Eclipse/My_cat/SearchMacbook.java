package market.yandex.ru;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import MarketPages.HomePage;
import MarketPages.ResultPage;

public class SearchMacbook extends BasicTestCase {
	
	private HomePage homePage = PageFactory.initElements(getWebDriver(), HomePage.class);
    private ResultPage resultPage;
    private static final Logger log = Logger.getLogger(SearchMacbook.class);

    @Test
    public void testUntitled() throws Exception {

        homePage.open();
        	System.out.println("Маркет открыт!");
        	log.info("Маркет открыт!");
        resultPage = homePage.searchProcess(MacBook);
        	System.out.println("Поиск запущен!");
        	log.info("Поиск запущен!");      
        Assert.assertTrue(resultPage.forwardToSort(), "!!!К РЕЗУЛЬТАТАМ ПОИСКА НЕ ПЕРЕШЛИ!!!");
        	System.out.println("Страница результатов открыта!");
        	log.info("Страница результатов открыта!");
        resultPage.sortWithPrice();
        	System.out.println("Сортировка с суммой произведена!");
        	log.info("Сортировка с суммой произведена!");
        if (resultPage.cifri() <= 70000){				//	работает через раз!!
        	System.out.println("Ценник низкий!! =))");
        } else {
        	System.out.println("Слишком дорого!! =((");
        	}
    }
}