diff --git a/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBStore.java b/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBStore.java
index d9670b3..4109ebf 100644
--- a/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBStore.java
+++ b/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBStore.java
@@ -212,7 +212,7 @@
         try {
             if (ttl == TTL_NOT_USED) {
                 dir.getParentFile().mkdirs();
-                return RocksDB.open(options, dir.toString());
+                return RocksDB.open(options, dir.getAbsolutePath());
             } else {
                 throw new UnsupportedOperationException("Change log is not supported for store " + this.name + " since it is TTL based.");
                 // TODO: support TTL with change log?
