diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
index b06ae5d..ce41156 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
@@ -145,7 +145,7 @@
       AbstractVcs vcs = root.getVcs();
       VirtualFile path = root.getPath();
       if (vcs == null || path == null) {
-        LOG.error("Skipping invalid VCS root: " + root);
+        LOG.debug("Skipping invalid VCS root: " + root);
         continue;
       }
 
