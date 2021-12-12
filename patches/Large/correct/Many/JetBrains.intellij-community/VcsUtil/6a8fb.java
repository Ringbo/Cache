diff --git a/platform/vcs-api/src/com/intellij/vcsUtil/VcsUtil.java b/platform/vcs-api/src/com/intellij/vcsUtil/VcsUtil.java
index 2f14c33..f606bf5 100644
--- a/platform/vcs-api/src/com/intellij/vcsUtil/VcsUtil.java
+++ b/platform/vcs-api/src/com/intellij/vcsUtil/VcsUtil.java
@@ -64,9 +64,9 @@
 
   private static int computeLoadedFileSize() {
     int result = (int)PersistentFSConstants.FILE_LENGTH_TO_CACHE_THRESHOLD;
-    final String userLimitKb = System.getProperty(MAX_VCS_LOADED_SIZE_KB);
+    String userLimitKb = System.getProperty(MAX_VCS_LOADED_SIZE_KB);
     try {
-      return userLimitKb != null ? Math.min(Integer.parseInt(userLimitKb) * 1024, result) : result;
+      return userLimitKb != null ? Integer.parseInt(userLimitKb) * 1024 : result;
     }
     catch (NumberFormatException ignored) {
       return result;
