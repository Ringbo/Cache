diff --git a/src/java/org/apache/cassandra/cql/QueryProcessor.java b/src/java/org/apache/cassandra/cql/QueryProcessor.java
index a7b3086..8c78f13 100644
--- a/src/java/org/apache/cassandra/cql/QueryProcessor.java
+++ b/src/java/org/apache/cassandra/cql/QueryProcessor.java
@@ -83,7 +83,7 @@
 
         try
         {
-            rows = StorageProxy.readProtocol(commands, select.getConsistencyLevel());
+            rows = StorageProxy.read(commands, select.getConsistencyLevel());
         }
         catch (TimeoutException e)
         {
