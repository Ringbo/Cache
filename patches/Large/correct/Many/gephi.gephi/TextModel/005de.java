diff --git a/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java b/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java
index 8af1225..53bee10 100644
--- a/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java
+++ b/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java
@@ -231,13 +231,13 @@
         String nodeFontName = nodeFontE.getAttribute("name");
         int nodeFontSize = Integer.parseInt(nodeFontE.getAttribute("size"));
         int nodeFontStyle = Integer.parseInt(nodeFontE.getAttribute("style"));
-        nodeFont = new Font(nodeFontName, nodeFontSize, nodeFontStyle);
+        nodeFont = new Font(nodeFontName, nodeFontStyle, nodeFontSize);
 
         Element edgeFontE = (Element) textModelElement.getElementsByTagName("edgefont").item(0);
         String edgeFontName = edgeFontE.getAttribute("name");
         int edgeFontSize = Integer.parseInt(edgeFontE.getAttribute("size"));
         int edgeFontStyle = Integer.parseInt(edgeFontE.getAttribute("style"));
-        edgeFont = new Font(edgeFontName, edgeFontSize, edgeFontStyle);
+        edgeFont = new Font(edgeFontName, edgeFontStyle, edgeFontSize);
 
         //Color
         Element nodeColorE = (Element) textModelElement.getElementsByTagName("nodecolor").item(0);
