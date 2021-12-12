diff --git a/processing/src/main/java/io/druid/segment/LoggingProgressIndicator.java b/processing/src/main/java/io/druid/segment/LoggingProgressIndicator.java
index e86716e..39b1bcb 100644
--- a/processing/src/main/java/io/druid/segment/LoggingProgressIndicator.java
+++ b/processing/src/main/java/io/druid/segment/LoggingProgressIndicator.java
@@ -76,7 +76,7 @@
   @Override
   public void progressSection(String section, String message)
   {
-    Stopwatch sectionWatch = sections.remove(section);
+    Stopwatch sectionWatch = sections.get(section);
     if (sectionWatch == null) {
       throw new ISE("[%s]: Cannot progress tracker for [%s]. Nothing started.", progressName, section);
     }
