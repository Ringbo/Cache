diff --git a/platform/platform-impl/src/com/intellij/internal/statistic/eventLog/FeatureUsageEventFileAppender.java b/platform/platform-impl/src/com/intellij/internal/statistic/eventLog/FeatureUsageEventFileAppender.java
index 78f6b7c..6982cda 100644
--- a/platform/platform-impl/src/com/intellij/internal/statistic/eventLog/FeatureUsageEventFileAppender.java
+++ b/platform/platform-impl/src/com/intellij/internal/statistic/eventLog/FeatureUsageEventFileAppender.java
@@ -74,7 +74,7 @@
     nextRollover = getQuietWriter().getCount() + maxFileSize;
     try {
       final File file = nextFile(myLogDirectory);
-      setFile(file.getName(), false, bufferedIO, bufferSize);
+      setFile(file.getPath(), false, bufferedIO, bufferSize);
       nextRollover = 0;
     }
     catch (InterruptedIOException e) {
