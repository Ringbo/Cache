diff --git a/src/java/org/apache/cassandra/cql3/QueryOptions.java b/src/java/org/apache/cassandra/cql3/QueryOptions.java
index 12accaf..5801d55 100644
--- a/src/java/org/apache/cassandra/cql3/QueryOptions.java
+++ b/src/java/org/apache/cassandra/cql3/QueryOptions.java
@@ -58,7 +58,7 @@
 
     public static QueryOptions forInternalCalls(ConsistencyLevel consistency, List<ByteBuffer> values)
     {
-        return new DefaultQueryOptions(consistency, values, false, SpecificOptions.DEFAULT, 0);
+        return new DefaultQueryOptions(consistency, values, false, SpecificOptions.DEFAULT, 3);
     }
 
     public static QueryOptions fromPreV3Batch(ConsistencyLevel consistency)
@@ -123,8 +123,6 @@
 
         private final SpecificOptions options;
 
-        // The protocol version of incoming queries. This is set during deserializaion and will be 0
-        // if the QueryOptions does not come from a user message (or come from thrift).
         private final transient int protocolVersion;
 
         DefaultQueryOptions(ConsistencyLevel consistency, List<ByteBuffer> values, boolean skipMetadata, SpecificOptions options, int protocolVersion)
