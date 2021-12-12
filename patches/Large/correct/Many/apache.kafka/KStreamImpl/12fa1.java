diff --git a/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java b/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java
index ca2e944..52b1c7b 100644
--- a/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java
+++ b/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java
@@ -537,14 +537,14 @@
     }
 
     @Override
-    public <K1, V1> KGroupedStream<K1, V1> groupBy(KeyValueMapper<K, V, K1> selector) {
+    public <K1> KGroupedStream<K1, V> groupBy(KeyValueMapper<K, V, K1> selector) {
         return groupBy(selector, null, null);
     }
 
     @Override
-    public <K1, V1> KGroupedStream<K1, V1> groupBy(KeyValueMapper<K, V, K1> selector,
+    public <K1> KGroupedStream<K1, V> groupBy(KeyValueMapper<K, V, K1> selector,
                                                    Serde<K1> keySerde,
-                                                   Serde<V1> valSerde) {
+                                                   Serde<V> valSerde) {
 
         String selectName = internalSelectKey(selector);
         return new KGroupedStreamImpl<>(topology,
