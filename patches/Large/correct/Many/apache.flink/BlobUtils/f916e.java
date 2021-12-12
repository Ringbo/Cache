diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java b/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java
index 99237a3..830269d 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/blob/BlobUtils.java
@@ -108,7 +108,7 @@
 	static File getIncomingDirectory(File storageDir) {
 		final File incomingDir = new File(storageDir, "incoming");
 
-		if (!incomingDir.exists() && !incomingDir.mkdirs()) {
+		if (!incomingDir.mkdirs() && !incomingDir.exists()) {
 			throw new RuntimeException("Cannot create directory for incoming files " + incomingDir.getAbsolutePath());
 		}
 
