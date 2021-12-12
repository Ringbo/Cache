diff --git a/math/src/main/java/org/apache/mahout/math/VectorView.java b/math/src/main/java/org/apache/mahout/math/VectorView.java
index e53031a..30f8ace 100644
--- a/math/src/main/java/org/apache/mahout/math/VectorView.java
+++ b/math/src/main/java/org/apache/mahout/math/VectorView.java
@@ -107,7 +107,7 @@
     private Element el;
 
     private NonZeroIterator() {
-      it = vector.iterator();
+      it = vector.iterateNonZero();
       buffer();
     }
 
