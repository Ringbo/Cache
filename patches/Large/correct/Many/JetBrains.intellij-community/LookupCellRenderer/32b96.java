diff --git a/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupCellRenderer.java b/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupCellRenderer.java
index a3d3900..e35b3ba 100644
--- a/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupCellRenderer.java
+++ b/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupCellRenderer.java
@@ -203,7 +203,7 @@
       Color proposedBackground = ((LookupValueWithUIHint)o).getColorHint();
 
       if (proposedBackground == null) {
-        proposedBackground = BACKGROUND_COLOR;
+        proposedBackground = background;
       }
 
       sampleBackground = proposedBackground;
