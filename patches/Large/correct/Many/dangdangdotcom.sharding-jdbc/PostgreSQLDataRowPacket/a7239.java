diff --git a/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/transport/postgresql/packet/command/query/text/PostgreSQLDataRowPacket.java b/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/transport/postgresql/packet/command/query/text/PostgreSQLDataRowPacket.java
index 74eaf21..da634bf 100644
--- a/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/transport/postgresql/packet/command/query/text/PostgreSQLDataRowPacket.java
+++ b/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/transport/postgresql/packet/command/query/text/PostgreSQLDataRowPacket.java
@@ -46,7 +46,7 @@
                 payload.writeInt1('\0');
             } else {
                 if (each instanceof byte[]) {
-                    payload.writeBytesLenenc((byte[]) each);
+                    payload.writeBytes((byte[]) each);
                 } else {
                     String columnData = each.toString();
                     payload.writeInt4(columnData.length());
