diff --git a/test/unit/org/apache/cassandra/db/KeyCacheTest.java b/test/unit/org/apache/cassandra/db/KeyCacheTest.java
index 739bac3..7d054e8 100644
--- a/test/unit/org/apache/cassandra/db/KeyCacheTest.java
+++ b/test/unit/org/apache/cassandra/db/KeyCacheTest.java
@@ -92,7 +92,7 @@
 
         // load the cache from disk.  unregister the old mbean so we can recreate a new CFS object.
         // but don't invalidate() the old CFS, which would nuke the data we want to try to load
-        store.invalidate(); // unregistering old MBean to test how key cache will be loaded
+        store.unregisterMBean();
         ColumnFamilyStore newStore = ColumnFamilyStore.createColumnFamilyStore(Table.open(TABLE1), COLUMN_FAMILY3);
         assertEquals(100, newStore.getKeyCacheSize());
 
