diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/BalanceMinibatches.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/BalanceMinibatches.java
index cd3d573..9ece26e 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/BalanceMinibatches.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/BalanceMinibatches.java
@@ -38,7 +38,7 @@
         if (!rootDir.exists())
             rootDir.mkdirs();
         if (!rootSaveDir.exists())
-            rootDir.mkdirs();
+            rootSaveDir.mkdirs();
 
         if (paths == null)
             paths = Maps.newHashMap();
