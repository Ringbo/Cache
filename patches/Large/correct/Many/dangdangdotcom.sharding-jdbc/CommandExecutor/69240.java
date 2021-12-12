diff --git a/sharding-proxy/src/main/java/io/shardingsphere/shardingproxy/frontend/mysql/CommandExecutor.java b/sharding-proxy/src/main/java/io/shardingsphere/shardingproxy/frontend/mysql/CommandExecutor.java
index 7508926..0ad6aa4 100644
--- a/sharding-proxy/src/main/java/io/shardingsphere/shardingproxy/frontend/mysql/CommandExecutor.java
+++ b/sharding-proxy/src/main/java/io/shardingsphere/shardingproxy/frontend/mysql/CommandExecutor.java
@@ -98,9 +98,9 @@
         currentSequenceId = headPacketsCount;
         while (queryCommandPacket.next()) {
             while (!context.channel().isWritable() && context.channel().isActive()) {
-                synchronized (io.shardingsphere.shardingproxy.frontend.mysql.CommandExecutor.this) {
+                synchronized (frontendHandler) {
                     try {
-                        io.shardingsphere.shardingproxy.frontend.mysql.CommandExecutor.this.wait();
+                        frontendHandler.wait();
                     } catch (final InterruptedException ignored) {
                     }
                 }
