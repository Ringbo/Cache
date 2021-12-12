diff --git a/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java b/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java
index b372004..f4c1acd 100644
--- a/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java
+++ b/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java
@@ -77,7 +77,7 @@
     private UiInspector myUiInspector;
     private JComponent myComponent;
     private boolean myHighlighted = false;
-    private static HighlightComponent myHighlightComponent;
+    private HighlightComponent myHighlightComponent;
 
     private InspectorWindow(@NotNull final JComponent component, UiInspector uiInspector) throws HeadlessException {
       myComponent = component;
@@ -162,7 +162,7 @@
       myComponent = null;
     }
 
-    private static void highlight(final Component c, final boolean clear) {
+    private void highlight(final Component c, final boolean clear) {
       if (c != null) {
         final JRootPane rootPane = SwingUtilities.getRootPane(c);
         if (rootPane != null) {
