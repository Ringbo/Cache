diff --git a/platform/diff-impl/src/com/intellij/diff/tools/dir/DirDiffTool.java b/platform/diff-impl/src/com/intellij/diff/tools/dir/DirDiffTool.java
index 8e52612..48ab915 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/dir/DirDiffTool.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/dir/DirDiffTool.java
@@ -27,12 +27,12 @@
   @NotNull
   @Override
   public DiffViewer createComponent(@NotNull DiffContext context, @NotNull DiffRequest request) {
-    return new DifDiffViewer(context, (ContentDiffRequest)request);
+    return new DirDiffViewer(context, (ContentDiffRequest)request);
   }
 
   @Override
   public boolean canShow(@NotNull DiffContext context, @NotNull DiffRequest request) {
-    return DifDiffViewer.canShowRequest(context, request);
+    return DirDiffViewer.canShowRequest(context, request);
   }
 
   @NotNull
