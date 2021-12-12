diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointV1Serializer.java b/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointV1Serializer.java
index 8de29a6..fcdc2ca 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointV1Serializer.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointV1Serializer.java
@@ -138,7 +138,7 @@
 					serializedValue = new SerializedValue<>(null);
 				} else {
 					byte[] serializedData = new byte[length];
-					dis.read(serializedData, 0, length);
+					dis.readFully(serializedData, 0, length);
 					serializedValue = SerializedValue.fromBytes(serializedData);
 				}
 
@@ -165,7 +165,7 @@
 					serializedValue = new SerializedValue<>(null);
 				} else {
 					byte[] serializedData = new byte[length];
-					dis.read(serializedData, 0, length);
+					dis.readFully(serializedData, 0, length);
 					serializedValue = SerializedValue.fromBytes(serializedData);
 				}
 
