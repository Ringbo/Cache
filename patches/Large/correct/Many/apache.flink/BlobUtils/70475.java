diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java b/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java
index 136df09..aeaa602 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java
@@ -124,7 +124,7 @@
 	private static File getCacheDirectory(File storageDir) {
 		final File cacheDirectory = new File(storageDir, "cache");
 
-		if (!cacheDirectory.exists() && !cacheDirectory.mkdirs()) {
+		if (!cacheDirectory.mkdirs() && !cacheDirectory.exists()) {
 			throw new RuntimeException("Could not create cache directory '" + cacheDirectory.getAbsolutePath() + "'.");
 		}
 
