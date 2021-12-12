diff --git a/agent/src/test/java/com/navercorp/pinpoint/plugin/cassandra/CassandraTestHelper.java b/agent/src/test/java/com/navercorp/pinpoint/plugin/cassandra/CassandraTestHelper.java
index bea097f..b609d2d 100644
--- a/agent/src/test/java/com/navercorp/pinpoint/plugin/cassandra/CassandraTestHelper.java
+++ b/agent/src/test/java/com/navercorp/pinpoint/plugin/cassandra/CassandraTestHelper.java
@@ -47,7 +47,7 @@
     }
 
     public static String getHost() {
-        return DatabaseDescriptor.getListenAddress().getHostName();
+        return DatabaseDescriptor.getListenAddress().getHostAddress();
     }
 
     public static int getNativeTransportPort() {
