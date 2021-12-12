diff --git a/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/MasterLevelDBStoreTest.java b/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/MasterLevelDBStoreTest.java
index 645da02..9e13a24 100644
--- a/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/MasterLevelDBStoreTest.java
+++ b/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/MasterLevelDBStoreTest.java
@@ -95,7 +95,7 @@
     public void stop() throws Exception {
         if (store.isStarted()) {
             store.stop();
-            FileUtils.deleteDirectory(store.directory());
+            FileUtils.deleteQuietly(store.directory());
         }
     }
 }
