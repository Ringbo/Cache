diff --git a/hazelcast/src/main/java/com/hazelcast/core/MapStore.java b/hazelcast/src/main/java/com/hazelcast/core/MapStore.java
index bf2de23..48993c6 100644
--- a/hazelcast/src/main/java/com/hazelcast/core/MapStore.java
+++ b/hazelcast/src/main/java/com/hazelcast/core/MapStore.java
@@ -36,14 +36,14 @@
  * Store implementation can be called synchronously (write-through)
  * or asynchronously (write-behind) depending on the configuration.
  */
-public interface MapStore {
+public interface MapStore<K, V> {
     /**
      * Stores the key-value pair.
      *
      * @param key   key of the entry to store
      * @param value value of the entry to store
      */
-    void store(Object key, Object value);
+    void store(K key, V value);
 
     /**
      * Stores multiple entries. Implementation of this method can optimize the
@@ -51,19 +51,19 @@
      *
      * @param map map of entries to store
      */
-    void storeAll(Map map);
+    void storeAll(Map<K, V> map);
 
     /**
      * Deletes the entry with a given key from the store.
      *
      * @param key key to delete from the store.
      */
-    void delete(Object key);
+    void delete(K key);
 
     /**
      * Deletes multiple entries from the store.
      *
      * @param keys keys of the entries to delete.
      */
-    void deleteAll(Collection keys);
+    void deleteAll(Collection<K> keys);
 }
\ No newline at end of file
