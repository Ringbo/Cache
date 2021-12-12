diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/ArrowPainter.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/ArrowPainter.java
index 38b0007..bbbd71f 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/ArrowPainter.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/ArrowPainter.java
@@ -55,7 +55,7 @@
    * @param stop    ending <code>'x'</code> position to use during drawing
    */
   public void paint(Graphics g, int y, int start, int stop) {
-    stop -= myWidthProvider.compute() / 2;
+    stop -= myWidthProvider.compute() / 4;
     Color oldColor = g.getColor();
     g.setColor(myColorHolder.getColor());
     final int height = myHeightProvider.compute();
