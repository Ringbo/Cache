diff --git a/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java b/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
index 9ef404d..41122b7 100644
--- a/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
+++ b/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
@@ -167,7 +167,7 @@
         org.gephi.graph.api.TextData sourceNodeTextData = sourceNodeData.getTextData();
 
         String label = sourceNodeData.getLabel();
-        if (sourceNodeTextData != null && sourceNodeTextData.getText() != null && sourceNodeTextData.getText().isEmpty()) {
+        if (sourceNodeTextData != null && sourceNodeTextData.getText() != null && !sourceNodeTextData.getText().isEmpty()) {
             label = sourceNodeTextData.getText();
         }
 
