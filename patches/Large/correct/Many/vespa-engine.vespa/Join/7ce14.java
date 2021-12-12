diff --git a/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/tensorflow/importer/operations/Join.java b/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/tensorflow/importer/operations/Join.java
index ae30c28..0f98335 100644
--- a/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/tensorflow/importer/operations/Join.java
+++ b/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/tensorflow/importer/operations/Join.java
@@ -59,7 +59,7 @@
             TensorType.Dimension aDim = a.dimensions().get(i);
             long size = aDim.size().orElse(-1L);
 
-            if (i - sizeDifference > 0) {
+            if (i - sizeDifference >= 0) {
                 TensorType.Dimension bDim = b.dimensions().get(i - sizeDifference);
                 size = Math.max(size, bDim.size().orElse(-1L));
             }
