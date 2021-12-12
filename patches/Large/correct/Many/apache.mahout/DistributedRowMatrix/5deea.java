diff --git a/core/src/main/java/org/apache/mahout/math/hadoop/DistributedRowMatrix.java b/core/src/main/java/org/apache/mahout/math/hadoop/DistributedRowMatrix.java
index b3213d9..4d970fa 100644
--- a/core/src/main/java/org/apache/mahout/math/hadoop/DistributedRowMatrix.java
+++ b/core/src/main/java/org/apache/mahout/math/hadoop/DistributedRowMatrix.java
@@ -142,7 +142,7 @@
     Path outPath = new Path(outputTmpBasePath.getParent(), "productWith");
     JobConf conf = MatrixMultiplicationJob.createMatrixMultiplyJobConf(rowPath, other.rowPath, outPath, other.numCols);
     JobClient.runJob(conf);
-    DistributedRowMatrix out = new DistributedRowMatrix(outPath, outputTmpPath, numRows, other.numCols());
+    DistributedRowMatrix out = new DistributedRowMatrix(outPath, outputTmpPath, numCols, other.numCols());
     out.configure(conf);
     return out;
   }
