diff --git a/src/components/org/apache/jmeter/visualizers/SearchTextExtension.java b/src/components/org/apache/jmeter/visualizers/SearchTextExtension.java
index 7d0a2ed..5df03dc 100644
--- a/src/components/org/apache/jmeter/visualizers/SearchTextExtension.java
+++ b/src/components/org/apache/jmeter/visualizers/SearchTextExtension.java
@@ -272,7 +272,7 @@
     private static class JEditorPaneSearchProvider implements ISearchTextExtensionProvider {
 
         private static volatile int LAST_POSITION_DEFAULT = 0;
-        private static final Color HILIT_COLOR = Color.LIGHT_GRAY;
+        private static final Color HIGHLIGHT_COLOR = Color.GREEN;
         private JEditorPane results;
         private Highlighter selection;
         private Highlighter.HighlightPainter painter;
@@ -283,7 +283,7 @@
             
             // prepare highlighter to show text find with search command
             selection = new DefaultHighlighter();
-            painter = new DefaultHighlighter.DefaultHighlightPainter(HILIT_COLOR);
+            painter = new DefaultHighlighter.DefaultHighlightPainter(HIGHLIGHT_COLOR);
             results.setHighlighter(selection);
         }
 
