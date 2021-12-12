diff --git a/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java b/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java
index c0af137..1687f8e 100644
--- a/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java
+++ b/platform/util/src/com/intellij/util/ui/tree/WideSelectionTreeUI.java
@@ -231,7 +231,7 @@
   }
 
   private boolean shouldPaintLines() {
-    return myForceDontPaintLines || "None".equals(tree.getClientProperty("JTree.lineStyle"));
+    return myForceDontPaintLines || !"None".equals(tree.getClientProperty("JTree.lineStyle"));
   }
 
   @Override
@@ -241,7 +241,7 @@
 
   @Override
   protected void paintVerticalPartOfLeg(final Graphics g, final Rectangle clipBounds, final Insets insets, final TreePath path) {
-    if (!UIUtil.isUnderAquaBasedLookAndFeel() && !UIUtil.isUnderDarcula() && !myForceDontPaintLines) {
+    if (!UIUtil.isUnderAquaBasedLookAndFeel() && !UIUtil.isUnderDarcula() && shouldPaintLines()) {
       invertLineColor = UIUtil.isUnderAlloyIDEALookAndFeel() && tree.hasFocus() && tree.getSelectionModel().isPathSelected(path);
       super.paintVerticalPartOfLeg(g, clipBounds, insets, path);
       invertLineColor = false;
@@ -250,7 +250,7 @@
 
   @Override
   protected void paintVerticalLine(Graphics g, JComponent c, int x, int top, int bottom) {
-    if (myForceDontPaintLines) return;
+    if (!shouldPaintLines()) return;
     if (tree.hasFocus() && UIUtil.isUnderAlloyIDEALookAndFeel()) {
       int y0, y1 = top;
       while (y1 < bottom) {
