diff --git a/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java b/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java
index 1687f8e..0d9f23b 100644
--- a/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java
+++ b/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java
@@ -221,7 +221,7 @@
                                           final boolean hasBeenExpanded,
                                           final boolean isLeaf) {
     if (!shouldPaintLines()) return;
-    if (!UIUtil.isUnderAquaBasedLookAndFeel() || !UIUtil.isUnderDarcula()) {
+    if (!UIUtil.isUnderAquaBasedLookAndFeel() && !UIUtil.isUnderDarcula()) {
       if (UIUtil.isUnderAlloyIDEALookAndFeel()) {
         invertLineColor = tree.getSelectionModel().isRowSelected(row) && tree.hasFocus();
       }
