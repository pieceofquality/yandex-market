


package ru.yandex.market.selenium.tests;

import org.testng.annotations.Test;

public class SearchedProductsTests extends TestBase {


//1. Открыть браузер и развернуть на весь экран.
//2. Зайти на yandex.ru.
//3. Перейти в яндекс маркет
//4. Выбрать раздел Электроника
//5. Выбрать раздел Телевизоры
//6. Зайти в расширенный поиск
//7. Задать параметр поиска от 20000 рублей.
//8. Выбрать производителей Samsung и LG
//9. Нажать кнопку Применить.
//10. Проверить, что элементов на странице 10.
//11. Запомнить первый элемент в списке.
//12. В поисковую строку ввести запомненное значение.
//13. Найти и проверить, что наименование товара соответствует запомненному значению.
    @Test
    public void testTVPanels(){
        app.getNavigationHelper().goToMarket();
        app.getNavigationHelper().goToElectronics();
        app.getNavigationHelper().goToTVPanels();
        app.getMarketHelper().defineFromPrice("20000");
        app.getMarketHelper().defineBrand("LG");
        app.getMarketHelper().defineBrand("Samsung");
        app.getMarketHelper().applyFilters();
        app.getMarketHelper().checkProductCardsAmount(12);
        String prod = app.getMarketHelper().firstProduct();
        app.getMarketHelper().searchProduct(prod);
        app.getMarketHelper().checkProductCardTitle(prod);
    }


//1. Открыть браузер и развернуть на весь экран.
//2. Зайти на yandex.ru.
//3. Перейти в яндекс маркет
//4. Выбрать раздел Электроника
//5. Выбрать раздел Наушники
//6. Зайти в расширенный поиск
//7. Задать параметр поиска от 5000 рублей.
//8. Выбрать производителя Beats
//9. Нажать кнопку Применить.
//11. Запомнить первый элемент в списке.
//12. В поисковую строку ввести запомненное значение.
//13. Найти и проверить, что наименование товара соответствует запомненному значению.

    @Test
    public void testEarphones(){
        app.getNavigationHelper().goToMarket();
        app.getNavigationHelper().goToElectronics();
        app.getNavigationHelper().goToEarphones();
        app.getMarketHelper().defineFromPrice("5000");
        app.getMarketHelper().defineBrand("Beats");
        app.getMarketHelper().applyFilters();
        String prod = app.getMarketHelper().firstProduct();
        app.getMarketHelper().searchProduct(prod);
        app.getMarketHelper().checkProductCardTitle(prod);
    }


    @Test
    public void testDraftMail() {

    }


}
