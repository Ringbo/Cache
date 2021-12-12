diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/jita/conf/Configuration.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/jita/conf/Configuration.java
index a593704..cac8677 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/jita/conf/Configuration.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/jita/conf/Configuration.java
@@ -119,7 +119,7 @@
 
     @Getter private List<Integer> bannedDevices = new ArrayList<>();
 
-    @Getter private int maximumGridSize = 768;
+    @Getter private int maximumGridSize = 512;
 
     @Getter private int maximumBlockSize = 256;
 
@@ -361,7 +361,7 @@
      * @return
      */
     public Configuration setMaximumGridSize(int gridDim) {
-        if (gridDim <= 0 || gridDim > 512)
+        if (gridDim <= 0 || gridDim > 768)
             throw new IllegalStateException("Please keep gridDim in range [8...512]");
 
         this.maximumGridSize = gridDim;
