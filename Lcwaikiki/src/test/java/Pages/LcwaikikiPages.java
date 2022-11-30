package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LcwaikikiPages {
    
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.cssSelector(".cookieseal-banner-body button:nth-child(3)");
    static By search = By.id("search-form__input-field__search-input");
    static By searchButton = By.cssSelector("[type='button']");
    static By checkPantolon = By.cssSelector(".desktop-filter-area__content .filter:nth-of-type(1) .filter-option:nth-of-type(4) .filter-option__text");
    static By firstProduct = By.cssSelector("[title='Skinny Fit Erkek Jean Pantolon'] .product-image__slider-button-container");
    static By size = By.cssSelector("div#option-size > a:nth-of-type(5)");
    static By boy = By.cssSelector("div#option-height > a:nth-of-type(2)");
    static By gotoSepet = By.cssSelector(".header-section div:nth-child(3) > div:nth-child(2) .cart-action__btn--bg-green");
    static By addCart = By.id("pd_add_to_cart");
    static By checkSepet = By.cssSelector(".rd-cart-item-image");
    static By cleanSepet = By.id("Cart_ProductDelete_1059140426");
    static By clean = By.id("Cart_ProductDelete_1059140426");
    static By checkCleanSepet = By.cssSelector(".cart-empty-title");




    public LcwaikikiPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }


    public static void Homepage() {
    }

    public static void AcceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearchButton() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"Erkek Pantolon");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterErkekPantolon() {
        elementHelper.checkVisible(checkPantolon);
    }

    public static void firtsProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(size);
        elementHelper.click(boy);
        elementHelper.click(addCart);
        elementHelper.click(gotoSepet);
    }
    public static void checkCartPage() {
        elementHelper.checkVisible(checkSepet);
    }

    public static void cleanTheSepet() {
        elementHelper.click(cleanSepet);
        elementHelper.click(clean);
        elementHelper.checkVisible(checkCleanSepet);
    }
}
