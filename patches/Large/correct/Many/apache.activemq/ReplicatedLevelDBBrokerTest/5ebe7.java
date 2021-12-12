diff --git a/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ReplicatedLevelDBBrokerTest.java b/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ReplicatedLevelDBBrokerTest.java
index 3514930..4aeebfd 100644
--- a/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ReplicatedLevelDBBrokerTest.java
+++ b/activemq-leveldb-store/src/test/java/org/apache/activemq/leveldb/test/ReplicatedLevelDBBrokerTest.java
@@ -447,7 +447,7 @@
         store.setContainer(id);
         store.setReplicas(3);
         store.setZkAddress("localhost:" + connector.getLocalPort());
-        store.setZkSessionTmeout("15s");
+        store.setZkSessionTimeout("15s");
         store.setHostname("localhost");
         store.setBind("tcp://0.0.0.0:0");
         return store;
