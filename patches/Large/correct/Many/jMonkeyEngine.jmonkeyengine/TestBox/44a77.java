diff --git a/engine/src/test/jme3test/model/shape/TestBox.java b/engine/src/test/jme3test/model/shape/TestBox.java
index cc4a033..19d26b5 100644
--- a/engine/src/test/jme3test/model/shape/TestBox.java
+++ b/engine/src/test/jme3test/model/shape/TestBox.java
@@ -47,7 +47,7 @@
 
     @Override
     public void simpleInitApp() {
-        Box b = new Box(Vector3f.ZERO, 1, 1, 1);
+        Box b = new Box(1, 1, 1);
         Geometry geom = new Geometry("Box", b);
         Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
         mat.setTexture("ColorMap", assetManager.loadTexture("Interface/Logo/Monkey.jpg"));
