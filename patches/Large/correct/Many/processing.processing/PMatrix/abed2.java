diff --git a/core/PMatrix.java b/core/PMatrix.java
index 9347e7d..6784ef3 100755
--- a/core/PMatrix.java
+++ b/core/PMatrix.java
@@ -379,7 +379,7 @@
     if (inverseCopy == null) {
       inverseCopy = new PMatrix();
     }
-    inverseCopy.apply(n00, n01, n02, n03,
+    inverseCopy.set(n00, n01, n02, n03,
                       n10, n11, n12, n13,
                       n20, n21, n22, n23,
                       n30, n31, n32, n33);
