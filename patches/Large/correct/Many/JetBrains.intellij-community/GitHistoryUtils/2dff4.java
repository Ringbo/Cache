diff --git a/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java b/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java
index 58e0a48..e086f98 100644
--- a/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java
+++ b/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java
@@ -165,7 +165,7 @@
       @Override
       public void onLineAvailable(String line, Key outputType) {
         final LowLevelRevisionDetails result = accumulator.acceptLine(line);
-        if (result != null) {
+        if (result != null && !result.missesRequiredFields()) {
           resultAdapter.consume(result);
         }
       }
@@ -180,7 +180,7 @@
       public void processTerminated(int exitCode) {
         super.processTerminated(exitCode);
         final LowLevelRevisionDetails result = accumulator.processLast();
-        if (result != null) {
+        if (result != null && !result.missesRequiredFields()) {
           resultAdapter.consume(result);
         }
         for (VcsException e : accumulator.exceptions) {
