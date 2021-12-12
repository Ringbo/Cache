diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/partition/consumer/RemoteInputChannel.java b/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/partition/consumer/RemoteInputChannel.java
index 990166f..0f70d44 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/partition/consumer/RemoteInputChannel.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/partition/consumer/RemoteInputChannel.java
@@ -338,7 +338,7 @@
 	}
 
 	@VisibleForTesting
-	public boolean isWaitingForFloatingBuffers() {
+	boolean isWaitingForFloatingBuffers() {
 		return isWaitingForFloatingBuffers;
 	}
 
