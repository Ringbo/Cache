diff --git a/math/src/test/java/org/apache/mahout/math/QRDecompositionTest.java b/math/src/test/java/org/apache/mahout/math/QRDecompositionTest.java
index 13aac91..5840d81 100644
--- a/math/src/test/java/org/apache/mahout/math/QRDecompositionTest.java
+++ b/math/src/test/java/org/apache/mahout/math/QRDecompositionTest.java
@@ -114,7 +114,7 @@
   public void fullRankWide() {
     Matrix x = matrix().transpose();
     QRDecomposition qr = new QRDecomposition(x);
-    assertFalse(qr.hasFullRank());
+    assertTrue(qr.hasFullRank());
     Matrix rActual = qr.getR();
 
     Matrix rRef = reshape(new double[]{
