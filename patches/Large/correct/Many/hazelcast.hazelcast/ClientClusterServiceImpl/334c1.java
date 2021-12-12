diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
index 23490af..f9915a2 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
@@ -250,7 +250,7 @@
     private void _sendAndHandle(ConnectionFactory connectionFactory, Object obj, ResponseHandler handler) throws IOException {
         ResponseStream stream = null;
         while (stream == null) {
-            if (active){
+            if (!active){
                 throw new HazelcastInstanceNotActiveException();
             }
             Connection conn = null;
