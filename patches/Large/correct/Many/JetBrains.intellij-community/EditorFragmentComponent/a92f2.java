diff --git a/platform/platform-impl/src/com/intellij/codeInsight/hint/EditorFragmentComponent.java b/platform/platform-impl/src/com/intellij/codeInsight/hint/EditorFragmentComponent.java
index 36011c2..2d6b32a 100644
--- a/platform/platform-impl/src/com/intellij/codeInsight/hint/EditorFragmentComponent.java
+++ b/platform/platform-impl/src/com/intellij/codeInsight/hint/EditorFragmentComponent.java
@@ -147,7 +147,7 @@
     final Color borderColor = editor.getColorsScheme().getColor(EditorColors.SELECTED_TEARLINE_COLOR);
 
     Border outsideBorder = JBUI.Borders.customLine(borderColor, LINE_BORDER_THICKNESS);
-    Border insideBorder = JBUI.Borders.emptyBottom(EMPTY_BORDER_THICKNESS);
+    Border insideBorder = JBUI.Borders.empty(EMPTY_BORDER_THICKNESS, EMPTY_BORDER_THICKNESS);
     setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));
   }
 
