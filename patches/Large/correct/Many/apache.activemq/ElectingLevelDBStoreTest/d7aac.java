diff --git a/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ElectingLevelDBStoreTest.java b/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ElectingLevelDBStoreTest.java
index c8a7df4..7c9273c 100644
--- a/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ElectingLevelDBStoreTest.java
+++ b/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ElectingLevelDBStoreTest.java
@@ -214,7 +214,7 @@
     private ElectingLevelDBStore createStoreNode() {
         ElectingLevelDBStore store = new ElectingLevelDBStore();
         store.setSecurityToken("foo");
-        store.setLogSize(1023 * 200);
+        store.setLogSize(1024 * 200);
         store.setReplicas(2);
         store.setZkAddress("localhost:" + connector.getLocalPort());
         store.setZkPath("/broker-stores");
