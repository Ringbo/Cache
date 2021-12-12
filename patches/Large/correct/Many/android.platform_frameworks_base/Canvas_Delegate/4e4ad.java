diff --git a/tools/layoutlib/bridge/src/android/graphics/Canvas_Delegate.java b/tools/layoutlib/bridge/src/android/graphics/Canvas_Delegate.java
index 49c1e4b..e7ae185 100644
--- a/tools/layoutlib/bridge/src/android/graphics/Canvas_Delegate.java
+++ b/tools/layoutlib/bridge/src/android/graphics/Canvas_Delegate.java
@@ -443,7 +443,7 @@
         AffineTransform matrixTx = matrixDelegate.getAffineTransform();
 
         // combine them so that the given matrix is applied after.
-        currentTx.preConcatenate(matrixTx);
+        currentTx.concatenate(matrixTx);
 
         // give it to the graphics2D as a new matrix replacing all previous transform
         snapshot.setTransform(currentTx);
