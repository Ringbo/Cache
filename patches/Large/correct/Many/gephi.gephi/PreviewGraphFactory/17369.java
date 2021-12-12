diff --git a/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java b/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
index bab8752..c94de3a 100644
--- a/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
+++ b/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
@@ -200,7 +200,7 @@
         String label = sourceNodeData.getLabel();
         if (sourceNodeTextData != null && sourceNodeTextData.getText() != null && !sourceNodeTextData.getText().isEmpty() && sourceNodeTextData.isVisible()) {
             label = sourceNodeTextData.getText();
-        } else if(sourceNodeData!=null && !sourceNodeTextData.isVisible()) {
+        } else if (sourceNodeTextData != null && !sourceNodeTextData.isVisible()) {
             label = null;
         }
 
