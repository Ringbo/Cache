diff --git a/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java b/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java
index 860d5c3..add2f6d 100644
--- a/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java
+++ b/server/sonar-search/src/main/java/org/sonar/search/SearchServer.java
@@ -160,7 +160,7 @@
 
   @Override
   public boolean isReady() {
-    return node.client().admin().cluster().prepareHealth()
+    return node != null && node.client().admin().cluster().prepareHealth()
       .setWaitForYellowStatus()
       .setTimeout(TimeValue.timeValueSeconds(3L))
       .get()
@@ -207,7 +207,7 @@
   }
 
   @Override
-  public synchronized void stop() {
+  public void stop() {
     if (node != null && !node.isClosed()) {
       node.close();
     }
