diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/util/MetricInstrumentedStore.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/util/MetricInstrumentedStore.java
index fa8f555..63eee99 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/util/MetricInstrumentedStore.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/util/MetricInstrumentedStore.java
@@ -165,7 +165,7 @@
                 public KeyIterator call() throws StorageException {
                     KeyIterator ki = backend.getKeys(query, txh);
                     if (null != p) {
-                        return MetricInstrumentedIterator.of(ki, p + "." + M_ITERATOR);
+                        return MetricInstrumentedIterator.of(ki, p + "." + M_GET_KEYS + "." + M_ITERATOR);
                     } else {
                         return ki;
                     }
@@ -182,7 +182,7 @@
                 public KeyIterator call() throws StorageException {
                     KeyIterator ki = backend.getKeys(query, txh);
                     if (null != p) {
-                        return MetricInstrumentedIterator.of(ki, p + "." + M_ITERATOR);
+                        return MetricInstrumentedIterator.of(ki, p + "." + M_GET_KEYS + "." + M_ITERATOR);
                     } else {
                         return ki;
                     }
