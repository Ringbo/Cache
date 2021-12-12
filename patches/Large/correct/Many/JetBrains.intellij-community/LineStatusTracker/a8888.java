diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTracker.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTracker.java
index 1f299e5..658bd07 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTracker.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/ex/LineStatusTracker.java
@@ -202,7 +202,7 @@
 
   private static TextAttributes getAttributesFor(Range range) {
     EditorColorsScheme globalScheme = EditorColorsManager.getInstance().getGlobalScheme();
-    Color color = ColorUtil.shift(globalScheme.getAttributes(getEditorColorNameFor(range)).getBackgroundColor(), 0.8);
+    Color color = globalScheme.getAttributes(getEditorColorNameFor(range)).getErrorStripeColor();
     TextAttributes textAttributes = new TextAttributes(null, color, null, EffectType.BOXED, Font.PLAIN);
     textAttributes.setErrorStripeColor(color);
     return textAttributes;
@@ -210,7 +210,7 @@
 
   private static void paintGutterFragment(Editor editor, Graphics g, Rectangle r, TextAttributesKey diffAttributeKey) {
     EditorGutterComponentEx gutter = ((EditorEx)editor).getGutterComponentEx();
-    g.setColor(editor.getColorsScheme().getAttributes(diffAttributeKey).getBackgroundColor());
+    g.setColor(editor.getColorsScheme().getAttributes(diffAttributeKey).getErrorStripeColor());
     int endX = gutter.getWhitespaceSeparatorOffset();
     int x = r.x + r.width - 2;
     int width = endX - x;
