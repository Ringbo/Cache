diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/query/netty/message/KvStateRequestSerializer.java b/flink-runtime/src/main/java/org/apache/flink/runtime/query/netty/message/KvStateRequestSerializer.java
index f0cc94a..68f06e3 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/query/netty/message/KvStateRequestSerializer.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/query/netty/message/KvStateRequestSerializer.java
@@ -224,7 +224,7 @@
 		// Get the message type
 		int msgType = buf.readInt();
 		KvStateRequestType[] values = KvStateRequestType.values();
-		if (msgType >= 0 && msgType <= values.length) {
+		if (msgType >= 0 && msgType < values.length) {
 			return values[msgType];
 		} else {
 			throw new IllegalArgumentException("Illegal message type with index " + msgType);
