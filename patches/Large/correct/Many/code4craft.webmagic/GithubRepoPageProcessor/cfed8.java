diff --git a/webmagic-core/src/main/java/us/codecraft/webmagic/processor/example/GithubRepoPageProcessor.java b/webmagic-core/src/main/java/us/codecraft/webmagic/processor/example/GithubRepoPageProcessor.java
index e475148..0ca3b7f 100644
--- a/webmagic-core/src/main/java/us/codecraft/webmagic/processor/example/GithubRepoPageProcessor.java
+++ b/webmagic-core/src/main/java/us/codecraft/webmagic/processor/example/GithubRepoPageProcessor.java
@@ -11,11 +11,11 @@
  */
 public class GithubRepoPageProcessor implements PageProcessor {
 
-    private Site site = Site.me().setRetryTimes(3).setSleepTime(0);
+    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
 
     @Override
     public void process(Page page) {
-        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-])").all());
+        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-]+)").all());
         page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-])").all());
         page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
         page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
