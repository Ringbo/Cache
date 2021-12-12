diff --git a/zeppelin-server/src/test/java/org/apache/zeppelin/WebDriverManager.java b/zeppelin-server/src/test/java/org/apache/zeppelin/WebDriverManager.java
index 41bd1b0..e8cc4cc 100644
--- a/zeppelin-server/src/test/java/org/apache/zeppelin/WebDriverManager.java
+++ b/zeppelin-server/src/test/java/org/apache/zeppelin/WebDriverManager.java
@@ -122,7 +122,7 @@
     while (System.currentTimeMillis() - start < 60 * 1000) {
       // wait for page load
       try {
-        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
+        (new WebDriverWait(driver, 30)).until(new ExpectedCondition<Boolean>() {
           @Override
           public Boolean apply(WebDriver d) {
             return d.findElement(By.xpath("//i[@tooltip='WebSocket Connected']"))
