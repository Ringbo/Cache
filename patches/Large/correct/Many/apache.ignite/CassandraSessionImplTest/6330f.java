diff --git a/modules/cassandra/store/src/test/java/org/apache/ignite/tests/CassandraSessionImplTest.java b/modules/cassandra/store/src/test/java/org/apache/ignite/tests/CassandraSessionImplTest.java
index 538cf53..9546d46 100644
--- a/modules/cassandra/store/src/test/java/org/apache/ignite/tests/CassandraSessionImplTest.java
+++ b/modules/cassandra/store/src/test/java/org/apache/ignite/tests/CassandraSessionImplTest.java
@@ -84,7 +84,7 @@
         verify(cluster, times(2)).connect();
         verify(session1, times(1)).prepare(any(String.class));
         verify(session2, times(1)).prepare(any(String.class));
-        assertEquals(9, batchExecutionAssistant.processedCount());
+        assertEquals(10, batchExecutionAssistant.processedCount());
     }
 
     private static PreparedStatement mockPreparedStatement() {
