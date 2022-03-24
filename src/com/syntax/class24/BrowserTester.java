package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        GoogleChrome chrome = new GoogleChrome();
        Browser [] browsers = { new GoogleChrome(), new Firefox(), new Safari(), new IE()};

        for (Browser b:browsers ) {
            b.openBrowser();
            b.loadPage("www.google.come");
            b.testThePage();
            b.closeBrowser();
        }

    }

// BrowserTester[] browser={new GoogleChrome, new FireFox(), new Safari(), new IE()};
}
//Cat eats
//Cat sleeps a lot
//kitten1 eats milk
//kitten1 sleeps a lot
//kitten2 eats snacks
//kitten2 sleeps a lot
//kitten3 eats everything
//kitten3 sleeps a lot


//Without Using Reverse Function:
//String toReverse="Hello World";
//// 1 way using charAt();
//String reversed="";
//for (int i=toReverse.length()-1; i>=0; i--) {
//reversed=reversed+toReverse.charAt(i); }