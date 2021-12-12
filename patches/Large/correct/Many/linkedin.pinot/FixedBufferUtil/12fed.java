diff --git a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/FixedBufferUtil.java b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/FixedBufferUtil.java
index 77ce840..e088e27 100644
--- a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/FixedBufferUtil.java
+++ b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/FixedBufferUtil.java
@@ -73,7 +73,7 @@
     int dimensionBufferSize = dimensionKeys.size() * config.getDimensions().size() * Integer.SIZE / 8;
     File dimensionDir = new File(outputDir, StarTreeConstants.DIMENSION_STORE);
     File dimensionFile = new File(dimensionDir, nodeId);
-    if (LOG.isDebugEnabled())
+    if (LOGGER.isDebugEnabled())
     {
       LOGGER.debug("Dimension buffer for node {}: bytes={}, numKeys={}, numDimensions={}, file={}",
                nodeId, dimensionBufferSize, dimensionKeys.size(), config.getDimensions().size(), dimensionFile);
