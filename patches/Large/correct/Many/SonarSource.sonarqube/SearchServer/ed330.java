diff --git a/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java b/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java
index d63abe3..353331a 100644
--- a/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java
+++ b/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java
@@ -145,7 +145,7 @@
 
   @Override
   public boolean isReady() {
-    return node.client().admin().cluster().prepareHealth()
+    return node != null && node.client().admin().cluster().prepareHealth()
       .setWaitForYellowStatus()
       .setTimeout(TimeValue.timeValueSeconds(3L))
       .get()
@@ -248,7 +248,7 @@
   }
 
   @Override
-  public synchronized void stop() {
+  public void stop() {
     if (node != null && !node.isClosed()) {
       node.close();
     }
