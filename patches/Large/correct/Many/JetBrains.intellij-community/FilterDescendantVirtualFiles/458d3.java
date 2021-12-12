diff --git a/vcs-api/src/com/intellij/openapi/vcs/FilterDescendantVirtualFiles.java b/vcs-api/src/com/intellij/openapi/vcs/FilterDescendantVirtualFiles.java
index 7ba4197..812def8 100644
--- a/vcs-api/src/com/intellij/openapi/vcs/FilterDescendantVirtualFiles.java
+++ b/vcs-api/src/com/intellij/openapi/vcs/FilterDescendantVirtualFiles.java
@@ -18,7 +18,7 @@
       final VirtualFile child = in.get(i);
       for (int j = i; j >= 0; --j) {
         final VirtualFile parent = in.get(j);
-        if (VfsUtil.isAncestor(parent, child, true)) {
+        if (VfsUtil.isAncestor(parent, child, false)) {
           in.remove(i);
           -- i;
           break;
