diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/VcsLogColorManagerImpl.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/VcsLogColorManagerImpl.java
index decc60c..28b58ac 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/VcsLogColorManagerImpl.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/VcsLogColorManagerImpl.java
@@ -38,7 +38,7 @@
     });
     myRoots2Colors = ContainerUtil.newHashMap();
     int i = 0;
-    for (VirtualFile root : roots) {
+    for (VirtualFile root : myRoots) {
       Color color;
       if (i >= ROOT_COLORS.length) {
         color = getDefaultRootColor();
