diff --git a/java/org/apache/catalina/valves/CrawlerSessionManagerValve.java b/java/org/apache/catalina/valves/CrawlerSessionManagerValve.java
index e59240a..e4fc4b5 100644
--- a/java/org/apache/catalina/valves/CrawlerSessionManagerValve.java
+++ b/java/org/apache/catalina/valves/CrawlerSessionManagerValve.java
@@ -155,7 +155,7 @@
     public void backgroundProcess() {
         super.backgroundProcess();
         
-        long expireTime = System.currentTimeMillis() +
+        long expireTime = System.currentTimeMillis() -
                 (sessionInactiveInterval + 60) * 1000;
 
         Iterator<Entry<String,SessionInfo>> iter =
@@ -164,7 +164,7 @@
         // Remove any sessions in the cache that have expired. 
         while (iter.hasNext()) {
             Entry<String,SessionInfo> entry = iter.next();
-            if (entry.getValue().getLastAccessed() > expireTime) {
+            if (entry.getValue().getLastAccessed() < expireTime) {
                 iter.remove();
             }
         }
