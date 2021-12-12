diff --git a/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java b/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
index c94de3a..f278275 100644
--- a/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
+++ b/PreviewImpl/src/org/gephi/preview/PreviewGraphFactory.java
@@ -265,7 +265,7 @@
         org.gephi.graph.api.TextData sourceEdgeTextData = sourceEdgeData.getTextData();
 
         String label = sourceEdgeData.getLabel();
-        if (sourceEdgeTextData != null && sourceEdgeTextData.getText() != null && sourceEdgeTextData.getText().isEmpty() && sourceEdgeTextData.isVisible()) {
+        if (sourceEdgeTextData != null && sourceEdgeTextData.getText() != null && !sourceEdgeTextData.getText().isEmpty() && sourceEdgeTextData.isVisible()) {
             label = sourceEdgeTextData.getText();
         } else if (sourceEdgeTextData != null && !sourceEdgeTextData.isVisible()) {
             label = null;
@@ -302,7 +302,7 @@
         org.gephi.graph.api.TextData sourceEdgeTextData = sourceEdgeData.getTextData();
 
         String label = sourceEdgeData.getLabel();
-        if (sourceEdgeTextData != null && sourceEdgeTextData.getText() != null && sourceEdgeTextData.getText().isEmpty() && sourceEdgeTextData.isVisible()) {
+        if (sourceEdgeTextData != null && sourceEdgeTextData.getText() != null && !sourceEdgeTextData.getText().isEmpty() && sourceEdgeTextData.isVisible()) {
             label = sourceEdgeTextData.getText();
         } else if (sourceEdgeTextData != null && !sourceEdgeTextData.isVisible()) {
             label = null;
@@ -339,7 +339,7 @@
         org.gephi.graph.api.TextData sourceEdgeTextData = sourceEdgeData.getTextData();
 
         String label = sourceEdgeData.getLabel();
-        if (sourceEdgeTextData != null && sourceEdgeTextData.getText() != null && sourceEdgeTextData.getText().isEmpty() && sourceEdgeTextData.isVisible()) {
+        if (sourceEdgeTextData != null && sourceEdgeTextData.getText() != null && !sourceEdgeTextData.getText().isEmpty() && sourceEdgeTextData.isVisible()) {
             label = sourceEdgeTextData.getText();
         } else if (sourceEdgeTextData != null && !sourceEdgeTextData.isVisible()) {
             label = null;
