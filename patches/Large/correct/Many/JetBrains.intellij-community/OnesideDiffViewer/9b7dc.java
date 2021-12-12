diff --git a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
index ab08e26..1138a74 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
@@ -772,7 +772,7 @@
   @Override
   public JComponent getPreferredFocusedComponent() {
     if (!myPanel.isGoodContent()) return null;
-    return myEditor.getComponent();
+    return myEditor.getContentComponent();
   }
 
   @NotNull
