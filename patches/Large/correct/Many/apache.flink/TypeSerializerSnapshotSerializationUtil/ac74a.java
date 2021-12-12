diff --git a/flink-core/src/main/java/org/apache/flink/api/common/typeutils/TypeSerializerSnapshotSerializationUtil.java b/flink-core/src/main/java/org/apache/flink/api/common/typeutils/TypeSerializerSnapshotSerializationUtil.java
index 110b2ab..0bcff93 100644
--- a/flink-core/src/main/java/org/apache/flink/api/common/typeutils/TypeSerializerSnapshotSerializationUtil.java
+++ b/flink-core/src/main/java/org/apache/flink/api/common/typeutils/TypeSerializerSnapshotSerializationUtil.java
@@ -149,7 +149,7 @@
 			Class<? extends TypeSerializerSnapshot> serializerConfigSnapshotClass;
 			try {
 				serializerConfigSnapshotClass = (Class<? extends TypeSerializerSnapshot>)
-					Class.forName(serializerConfigClassname, true, userCodeClassLoader);
+					Class.forName(serializerConfigClassname, false, userCodeClassLoader);
 			} catch (ClassNotFoundException e) {
 				throw new IOException(
 					"Could not find requested TypeSerializerConfigSnapshot class "
