diff --git a/webmagic-core/src/test/java/us/codecraft/webmagic/selector/TextContentSelectorTest.java b/webmagic-core/src/test/java/us/codecraft/webmagic/selector/TextContentSelectorTest.java
index a7a294a..f501824 100644
--- a/webmagic-core/src/test/java/us/codecraft/webmagic/selector/TextContentSelectorTest.java
+++ b/webmagic-core/src/test/java/us/codecraft/webmagic/selector/TextContentSelectorTest.java
@@ -28,7 +28,7 @@
     public void testDownload() {
         String s = new HttpClientDownloader().download("http://blog.codecraft.us/blog/2013/08/18/ti-yan-dao-liao-open-sourcede-mei-li/", "utf-8")
                 .smartContent().text().toString();
-        Assert.assertNotNull(text);
+        Assert.assertNotNull(s);
     }
 
 }
