diff --git a/hazelcast/src/main/java/com/hazelcast/impl/concurrentmap/PutAllCallable.java b/hazelcast/src/main/java/com/hazelcast/impl/concurrentmap/PutAllCallable.java
index a3721ca..2e921f0 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/concurrentmap/PutAllCallable.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/concurrentmap/PutAllCallable.java
@@ -63,7 +63,7 @@
             for (KeyValue keyValue : pairs.getKeyValues()) {
                 Object value = (cmap.getMapIndexService().hasIndexedAttributes()) ?
                         keyValue.getValue() : keyValue.getValueData();
-                map.set(keyValue.getKeyData(), value, 0, TimeUnit.SECONDS);
+                map.set(keyValue.getKeyData(), value);
             }
         }
         return Boolean.TRUE;
