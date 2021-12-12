diff --git a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
index 5683368..6f2308e 100644
--- a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
+++ b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
@@ -190,16 +190,18 @@
    * @param millis the time in milliseconds
    */
   private void displayTiming(long millis) {
+    // TODO: if the intent is user-display: this should use SimpleDateFormat 
+    // or similar instead of homemade formatting.
     long hours = millis / 3600000;
     long minutes = (millis / 60000) % 60;
     long seconds = (millis / 1000) % 60;
     long milliseconds = millis % 1000;
     if (hours>0) {
-      System.out.println(String.format("Time taken: %02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds));
+      System.out.println(String.format(Locale.getDefault(), "Time taken: %02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds));
     } else if (minutes>0) {
-      System.out.println(String.format("Time taken: %02d:%02d.%03d", minutes, seconds, milliseconds));
+      System.out.println(String.format(Locale.getDefault(), "Time taken: %02d:%02d.%03d", minutes, seconds, milliseconds));
     } else {
-      System.out.println(String.format("Time taken: %d.%03ds", seconds, milliseconds));
+      System.out.println(String.format(Locale.getDefault(), "Time taken: %d.%03ds", seconds, milliseconds));
     }
  }
 
