        package com.syntax.class24;

        public class Browser {
            // selenium is a library that contains code that is already written by someone else to help you test

            void openBrowser () {
                System.out.println("Opening the browser ");
            }
            void loadPage (String websiteLink) {
                System.out.println("loading the website " + websiteLink);
        }
        void testThePage () {
            System.out.println("Testing the page");
        }
        void closeBrowser () {
            System.out.println("closing the browser");
        }
        }
    class GoogleChrome extends Browser{
        void openBrowser () {
            System.out.println("Opening the Google Chrome browser");
        }
        void loadPage (String websiteLink) {
            System.out.println("loading the website " + websiteLink + " in Google Chrome");
        }
        void testThePage () {
            System.out.println("Testing the page in Google Chrome");
        }
        void closeBrowser () {
            System.out.println("closing the Google chrome browser");
        }
    }

        class Firefox extends Browser{
            void openBrowser () {
                System.out.println("Opening the Firefox browser");
            }
            void loadPage (String websiteLink) {
                System.out.println("loading the website " + websiteLink + " in Firefox");
            }
            void testThePage () {
                System.out.println("Testing the page in Firefox");
            }
            void closeBrowser () {
                System.out.println("closing the Firefox browser");
            }
        }
        class Safari extends Browser{
            void openBrowser () {
                System.out.println("Opening the Safari browser");
            }
            void loadPage (String websiteLink) {
                System.out.println("loading the website " + websiteLink + " in Safari");
            }
            void testThePage () {
                System.out.println("Testing the page in Safari");
            }
            void closeBrowser () {
                System.out.println("closing the Safari browser");
            }
        }
        class IE extends Browser{
            void openBrowser () {
                System.out.println("Opening the IE browser");
            }
            void loadPage (String websiteLink) {
                System.out.println("loading the website " + websiteLink + " in IE");
            }
            void testThePage () {
                System.out.println("Testing the page in IE");
            }
            void closeBrowser () {
                System.out.println("closing the IE browser");
            }
        }