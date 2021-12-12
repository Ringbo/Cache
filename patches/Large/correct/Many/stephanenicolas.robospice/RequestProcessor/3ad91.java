diff --git a/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java b/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java
index b32e119..8b6c153 100644
--- a/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java
+++ b/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java
@@ -276,7 +276,7 @@
                 printRequestProcessingDuration(startTime, request);
                 return;
             } catch (final SpiceException e) {
-                Ln.d("An exception occured during service execution :" + e.getMessage(), e);
+                Ln.d("An exception occured during service execution :" + e.getMessage());
                 if (failOnCacheError) {
                     handleRetry(request, e);
                     printRequestProcessingDuration(startTime, request);
