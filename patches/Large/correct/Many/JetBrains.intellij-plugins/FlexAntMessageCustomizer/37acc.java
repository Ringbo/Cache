diff --git a/flex/src/com/intellij/lang/javascript/flex/FlexAntMessageCustomizer.java b/flex/src/com/intellij/lang/javascript/flex/FlexAntMessageCustomizer.java
index 69084f5..af41a95 100644
--- a/flex/src/com/intellij/lang/javascript/flex/FlexAntMessageCustomizer.java
+++ b/flex/src/com/intellij/lang/javascript/flex/FlexAntMessageCustomizer.java
@@ -48,7 +48,7 @@
               int column = 1;
               final int colIndex = infoAndPosition.indexOf(COL_MARKER, lineCloseBraceIndex);
               if (colIndex > 0 && colIndex < infoAndPosition.length() - COL_MARKER.length() - 1) {
-                final String colString = infoAndPosition.substring(colIndex + COL_MARKER.length(), infoAndPosition.length());
+                final String colString = infoAndPosition.substring(colIndex + COL_MARKER.length());
                 column = Integer.parseInt(colString);
               }
 
