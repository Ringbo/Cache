diff --git a/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java b/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java
index 752084d..27d388b 100644
--- a/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java
+++ b/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java
@@ -18,7 +18,7 @@
  */
 public class WatcherF {
 
-    public static void main(String[] args) {
+    public static void main(String[] args) throws Throwable {
         System.setProperty("es.http.cors.enabled", "true");
         System.setProperty("es.script.inline", "on");
         System.setProperty("es.shield.enabled", "false");
