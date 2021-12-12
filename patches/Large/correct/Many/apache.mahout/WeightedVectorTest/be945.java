diff --git a/math/src/test/java/org/apache/mahout/math/WeightedVectorTest.java b/math/src/test/java/org/apache/mahout/math/WeightedVectorTest.java
index 433fb4d..2963fa0 100644
--- a/math/src/test/java/org/apache/mahout/math/WeightedVectorTest.java
+++ b/math/src/test/java/org/apache/mahout/math/WeightedVectorTest.java
@@ -78,7 +78,7 @@
 
   @Override
   public void testSize() {
-    assertEquals("size", 3, getTestVector().getNumNondefaultElements());
+    assertEquals("size", 3, getTestVector().getNumNonZeroElements());
   }
 
   @Override
