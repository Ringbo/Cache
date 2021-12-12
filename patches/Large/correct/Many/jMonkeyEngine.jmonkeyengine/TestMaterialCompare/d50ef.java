diff --git a/engine/src/test/jme3test/material/TestMaterialCompare.java b/engine/src/test/jme3test/material/TestMaterialCompare.java
index 57b33cb..a2a73ab 100644
--- a/engine/src/test/jme3test/material/TestMaterialCompare.java
+++ b/engine/src/test/jme3test/material/TestMaterialCompare.java
@@ -86,7 +86,7 @@
     }
 
     private void testMats(Material mat1, Material mat2, boolean expected) {
-        if (mat2.isEqual(mat1)) {
+        if (mat2.equals(mat1)) {
             System.out.print(mat1.getName() + " equals " + mat2.getName());
             if(expected){
                 System.out.println(" success");
