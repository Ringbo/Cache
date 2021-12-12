diff --git a/modules/core/src/main/java/org/apache/ignite/stream/StreamTransformer.java b/modules/core/src/main/java/org/apache/ignite/stream/StreamTransformer.java
index f0f41bf..4435c0a 100644
--- a/modules/core/src/main/java/org/apache/ignite/stream/StreamTransformer.java
+++ b/modules/core/src/main/java/org/apache/ignite/stream/StreamTransformer.java
@@ -37,7 +37,7 @@
     /** {@inheritDoc} */
     @Override public void receive(IgniteCache<K, V> cache, Collection<Map.Entry<K, V>> entries) throws IgniteException {
         for (Map.Entry<K, V> entry : entries)
-            cache.invoke(entry.getKey(), this);
+            cache.invoke(entry.getKey(), this, entry.getValue());
     }
 
     /**
