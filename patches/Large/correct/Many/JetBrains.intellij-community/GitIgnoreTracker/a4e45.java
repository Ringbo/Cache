diff --git a/plugins/git4idea/src/git4idea/vfs/GitIgnoreTracker.java b/plugins/git4idea/src/git4idea/vfs/GitIgnoreTracker.java
index 801666e..38cb8c9 100644
--- a/plugins/git4idea/src/git4idea/vfs/GitIgnoreTracker.java
+++ b/plugins/git4idea/src/git4idea/vfs/GitIgnoreTracker.java
@@ -234,7 +234,7 @@
     VirtualFile meta = root.findChild(GIT_FOLDER);
     if (meta != null) {
       final VirtualFile localExclude = root.findFileByRelativePath(LOCAL_EXCLUDE);
-      if (localExclude != null) {
+      if (localExclude != null && localExclude.isValid()) {
         localExclude.getTimeStamp();
       }
       return root;
