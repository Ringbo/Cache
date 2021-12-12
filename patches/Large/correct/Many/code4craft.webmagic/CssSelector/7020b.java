diff --git a/webmagic-core/src/main/java/us/codecraft/webmagic/selector/CssSelector.java b/webmagic-core/src/main/java/us/codecraft/webmagic/selector/CssSelector.java
index 10dfb62..90a9d1d 100644
--- a/webmagic-core/src/main/java/us/codecraft/webmagic/selector/CssSelector.java
+++ b/webmagic-core/src/main/java/us/codecraft/webmagic/selector/CssSelector.java
@@ -27,7 +27,7 @@
     public String select(String text) {
         Document doc = Jsoup.parse(text);
         Elements elements = doc.select(selectorText);
-        if (CollectionUtils.isNotEmpty(elements)) {
+        if (CollectionUtils.isEmpty(elements)) {
             return null;
         }
         return elements.get(0).outerHtml();
