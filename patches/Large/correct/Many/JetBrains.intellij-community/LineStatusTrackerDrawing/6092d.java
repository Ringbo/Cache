diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java
index eb5a165..031d0c4 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTrackerDrawing.java
@@ -59,7 +59,7 @@
   }
 
   static TextAttributes getAttributesFor(final Range range) {
-    final Color stripeColor = getDiffColor(range);
+    final Color stripeColor = getDiffColor(range, false);
     final TextAttributes textAttributes = new TextAttributes(null, stripeColor, null, EffectType.BOXED, Font.PLAIN);
     textAttributes.setErrorStripeColor(stripeColor);
     return textAttributes;
@@ -117,7 +117,7 @@
   public static LineMarkerRenderer createRenderer(final Range range, final LineStatusTracker tracker) {
     return new ActiveGutterRenderer() {
       public void paint(final Editor editor, final Graphics g, final Rectangle r) {
-        paintGutterFragment(editor, g, r, getDiffColor(range));
+        paintGutterFragment(editor, g, r, getDiffColor(range, true));
       }
 
       public void doAction(final Editor editor, final MouseEvent e) {
@@ -258,15 +258,17 @@
     });
   }
 
-  private static Color getDiffColor(Range range) {
+  private static Color getDiffColor(Range range, boolean gutter) {
     final EditorColorsScheme globalScheme = EditorColorsManager.getInstance().getGlobalScheme();
     switch (range.getType()) {
       case Range.INSERTED:
-        return globalScheme.getColor(EditorColors.ADDED_LINES_COLOR);
+        return gutter ? globalScheme.getColor(EditorColors.ADDED_LINES_COLOR)
+                      : globalScheme.getAttributes(DiffColors.DIFF_INSERTED).getErrorStripeColor();
       case Range.DELETED:
-        return globalScheme.getAttributes(DiffColors.DIFF_DELETED).getEffectColor();
+        return globalScheme.getAttributes(DiffColors.DIFF_DELETED).getErrorStripeColor();
       case Range.MODIFIED:
-        return globalScheme.getColor(EditorColors.MODIFIED_LINES_COLOR);
+        return gutter ? globalScheme.getColor(EditorColors.MODIFIED_LINES_COLOR)
+                      : globalScheme.getAttributes(DiffColors.DIFF_MODIFIED).getErrorStripeColor();
       default:
         assert false;
         return null;
