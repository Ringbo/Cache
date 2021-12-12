diff --git a/plugins/git4idea/src/git4idea/status/GitChangeProvider.java b/plugins/git4idea/src/git4idea/status/GitChangeProvider.java
index e9260d8..8c735af 100644
--- a/plugins/git4idea/src/git4idea/status/GitChangeProvider.java
+++ b/plugins/git4idea/src/git4idea/status/GitChangeProvider.java
@@ -177,7 +177,7 @@
         if (beforePath != null) {
           myProcessedPaths.add(beforePath);
         }
-        final FilePath afterPath = ChangesUtil.getBeforePath(change);
+        final FilePath afterPath = ChangesUtil.getAfterPath(change);
         if (afterPath != null) {
           myProcessedPaths.add(afterPath);
         }
