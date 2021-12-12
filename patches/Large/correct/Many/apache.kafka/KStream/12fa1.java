diff --git a/streams/src/main/java/org/apache/kafka/streams/kstream/KStream.java b/streams/src/main/java/org/apache/kafka/streams/kstream/KStream.java
index ae743b1..3ac0284 100644
--- a/streams/src/main/java/org/apache/kafka/streams/kstream/KStream.java
+++ b/streams/src/main/java/org/apache/kafka/streams/kstream/KStream.java
@@ -491,11 +491,10 @@
      *
      * @param selector      select the grouping key and value to be aggregated
      * @param <K1>          the key type of the {@link KGroupedStream}
-     * @param <V1>          the value type of the {@link KGroupedStream}
      *
      * @return a {@link KGroupedStream} that contains the the grouped records of the original {@link KStream}
      */
-    <K1, V1> KGroupedStream<K1, V1> groupBy(KeyValueMapper<K, V, K1> selector);
+    <K1> KGroupedStream<K1, V> groupBy(KeyValueMapper<K, V, K1> selector);
 
     /**
      * Group the records of this {@link KStream} using the provided {@link KeyValueMapper}.
@@ -507,13 +506,12 @@
      * @param valSerde    value serdes for materializing this stream,
      *                      if not specified the default serdes defined in the configs will be used
      * @param <K1>          the key type of the {@link KGroupedStream}
-     * @param <V1>          the value type of the {@link KGroupedStream}
      *
      * @return a {@link KGroupedStream} that contains the the grouped records of the original {@link KStream}
      */
-    <K1, V1> KGroupedStream<K1, V1> groupBy(KeyValueMapper<K, V, K1> selector,
+    <K1> KGroupedStream<K1, V> groupBy(KeyValueMapper<K, V, K1> selector,
                                             Serde<K1> keySerde,
-                                            Serde<V1> valSerde);
+                                            Serde<V> valSerde);
 
     /**
      * Group the records with the same key into a {@link KGroupedStream} while preserving the
