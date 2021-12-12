diff --git a/src/main/java/edu/uci/ics/crawler4j/crawler/WebCrawler.java b/src/main/java/edu/uci/ics/crawler4j/crawler/WebCrawler.java
index e2239be..46435f5 100644
--- a/src/main/java/edu/uci/ics/crawler4j/crawler/WebCrawler.java
+++ b/src/main/java/edu/uci/ics/crawler4j/crawler/WebCrawler.java
@@ -302,15 +302,20 @@
   }
 
   /**
-   * Determine whether links in the given page should be added to the queue for crawling.
+   * Determine whether links found at the given URL should be added to the queue for crawling.
    * By default this method returns true always, but classes that extend WebCrawler can
    * override it in order to implement particular policies about which pages should be
    * mined for outgoing links and which should not.
    *
-   * @param page the page currently being visited
+   * If links from the URL are not being followed, then we are not operating as
+   * a web crawler and need not check robots.txt before fetching the single URL.
+   * (see definition at http://www.robotstxt.org/faq/what.html).  Thus URLs that
+   * return false from this method will not be subject to robots.txt filtering.
+   *
+   * @param url the URL of the page under consideration
    * @return true if outgoing links from this page should be added to the queue.
    */
-  protected boolean shouldFollowLinksInPage(Page page) {
+  protected boolean shouldFollowLinksIn(WebURL url) {
     return true;
   }
 
@@ -368,7 +373,7 @@
             webURL.setDocid(-1);
             webURL.setAnchor(curURL.getAnchor());
             if (shouldVisit(page, webURL)) {
-              if (robotstxtServer.allows(webURL)) {
+              if (!shouldFollowLinksIn(webURL) || robotstxtServer.allows(webURL)) {
                 webURL.setDocid(docIdServer.getNewDocID(movedToUrl));
                 frontier.schedule(webURL);
               } else {
@@ -401,7 +406,7 @@
 
         parser.parse(page, curURL.getURL());
 
-        if (shouldFollowLinksInPage(page)) {
+        if (shouldFollowLinksIn(page.getWebURL())) {
           ParseData parseData = page.getParseData();
           List<WebURL> toSchedule = new ArrayList<>();
           int maxCrawlDepth = myController.getConfig().getMaxDepthOfCrawling();
@@ -418,7 +423,7 @@
               webURL.setDepth((short) (curURL.getDepth() + 1));
               if ((maxCrawlDepth == -1) || (curURL.getDepth() < maxCrawlDepth)) {
                 if (shouldVisit(page, webURL)) {
-                  if (robotstxtServer.allows(webURL)) {
+                  if (!shouldFollowLinksIn(webURL) || robotstxtServer.allows(webURL)) {
                     webURL.setDocid(docIdServer.getNewDocID(webURL.getURL()));
                     toSchedule.add(webURL);
                   } else {
