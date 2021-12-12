diff --git a/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java b/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java
index afb2d9a..51b85c0 100644
--- a/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java
+++ b/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java
@@ -89,7 +89,7 @@
         octree.initArchitecture();
     }
 
-    public void updateSelection(GL2 gl, GLU glu) {
+    public synchronized void updateSelection(GL2 gl, GLU glu) {
         if (vizConfig.isSelectionEnable() && currentSelectionArea != null && currentSelectionArea.isEnabled()) {
             float[] mp = Arrays.copyOf(graphIO.getMousePosition(), 2);
             float[] cent = currentSelectionArea.getSelectionAreaCenter();
@@ -102,7 +102,7 @@
     }
 
     @Override
-    public boolean updateWorld() {
+    public synchronized boolean updateWorld() {
         boolean repositioned = octree.repositionNodes();
         boolean updated = dataBridge.updateWorld();
 
@@ -142,7 +142,7 @@
     }
 
     @Override
-    public void display(GL2 gl, GLU glu) {
+    public synchronized void display(GL2 gl, GLU glu) {
         markTime++;
 
         VizModel vizModel = VizController.getInstance().getVizModel();
@@ -299,7 +299,7 @@
     }
 
     @Override
-    public void mouseClick() {
+    public synchronized void mouseClick() {
         if (vizConfig.isSelectionEnable() && rectangleSelection && !customSelection) {
             Rectangle rectangle = (Rectangle) currentSelectionArea;
             //rectangle.setBlocking(false);
@@ -367,7 +367,7 @@
     }
 
     @Override
-    public void mouseMove() {
+    public synchronized void mouseMove() {
         //Selection
         if (vizConfig.isSelectionEnable() && rectangleSelection) {
             Rectangle rectangle = (Rectangle) currentSelectionArea;
@@ -447,7 +447,7 @@
     }
 
     @Override
-    public void updateLOD() {
+    public synchronized void updateLOD() {
         Iterator<NodeModel> iterator = octree.getNodeIterator();
         for (; iterator.hasNext();) {
             NodeModel obj = iterator.next();
@@ -456,7 +456,7 @@
     }
 
     @Override
-    public List<NodeModel> getSelectedNodes() {
+    public synchronized List<NodeModel> getSelectedNodes() {
         List<NodeModel> selected = new ArrayList<>();
         for (Iterator<NodeModel> itr = octree.getNodeIterator(); itr.hasNext();) {
             NodeModel nodeModel = itr.next();
@@ -468,7 +468,7 @@
     }
 
     @Override
-    public List<EdgeModel> getSelectedEdges() {
+    public synchronized List<EdgeModel> getSelectedEdges() {
         List<EdgeModel> selected = new ArrayList<>();
         for (Iterator<EdgeModel> itr = octree.getEdgeIterator(); itr.hasNext();) {
             EdgeModel edgeModel = itr.next();
@@ -480,7 +480,7 @@
     }
 
     @Override
-    public List<Node> getSelectedUnderlyingNodes() {
+    public synchronized List<Node> getSelectedUnderlyingNodes() {
         List<Node> selected = new ArrayList<>();
         for (Iterator<NodeModel> itr = octree.getNodeIterator(); itr.hasNext();) {
             NodeModel nodeModel = itr.next();
@@ -492,7 +492,7 @@
     }
 
     @Override
-    public List<Edge> getSelectedUnderlyingEdges() {
+    public synchronized List<Edge> getSelectedUnderlyingEdges() {
         List<Edge> selected = new ArrayList<>();
         for (Iterator<EdgeModel> itr = octree.getEdgeIterator(); itr.hasNext();) {
             EdgeModel edgeModel = itr.next();
@@ -545,7 +545,7 @@
     }
 
     @Override
-    public void resetSelection() {
+    public synchronized void resetSelection() {
         resetNodesSelection();
         resetEdgesSelection();
         
