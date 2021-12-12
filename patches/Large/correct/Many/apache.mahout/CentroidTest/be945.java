diff --git a/math/src/test/java/org/apache/mahout/math/CentroidTest.java b/math/src/test/java/org/apache/mahout/math/CentroidTest.java
index 3e7afb6..07b13dd 100644
--- a/math/src/test/java/org/apache/mahout/math/CentroidTest.java
+++ b/math/src/test/java/org/apache/mahout/math/CentroidTest.java
@@ -62,7 +62,7 @@
 
   @Override
   public void testSize() {
-    assertEquals("size", 3, getTestVector().getNumNondefaultElements());
+    assertEquals("size", 3, getTestVector().getNumNonZeroElements());
   }
 
   @Override
