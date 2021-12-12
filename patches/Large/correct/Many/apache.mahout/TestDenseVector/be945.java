diff --git a/math/src/test/java/org/apache/mahout/math/TestDenseVector.java b/math/src/test/java/org/apache/mahout/math/TestDenseVector.java
index 0bb5318..41bec80 100644
--- a/math/src/test/java/org/apache/mahout/math/TestDenseVector.java
+++ b/math/src/test/java/org/apache/mahout/math/TestDenseVector.java
@@ -28,7 +28,7 @@
 
   @Override
   public void testSize() {
-    assertEquals("size", 3, getTestVector().getNumNondefaultElements());
+    assertEquals("size", 3, getTestVector().getNumNonZeroElements());
   }
 
   @Override
