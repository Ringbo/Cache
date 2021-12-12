diff --git a/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
index a0e150f..550a23e 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
@@ -1021,11 +1021,11 @@
         Map<?, ?> property = exchange.getProperty(Exchange.AGGREGATION_STRATEGY, Map.class);
         Map<Object, AggregationStrategy> map = CastUtils.cast(property);
         if (map == null) {
-            map = new HashMap<Object, AggregationStrategy>();
+            map = new ConcurrentHashMap<Object, AggregationStrategy>();
         } else {
             // it is not safe to use the map directly as the exchange doesn't have the deep copy of it's properties
             // we just create a new copy if we need to change the map
-            map = new HashMap<Object, AggregationStrategy>(map);
+            map = new ConcurrentHashMap<Object, AggregationStrategy>(map);
         }
         // store the strategy using this processor as the key
         // (so we can store multiple strategies on the same exchange)
