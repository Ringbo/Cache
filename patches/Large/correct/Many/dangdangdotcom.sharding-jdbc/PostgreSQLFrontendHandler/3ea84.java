diff --git a/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxy/frontend/postgresql/PostgreSQLFrontendHandler.java b/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxy/frontend/postgresql/PostgreSQLFrontendHandler.java
index b182b1f..73ad129 100644
--- a/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxy/frontend/postgresql/PostgreSQLFrontendHandler.java
+++ b/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxy/frontend/postgresql/PostgreSQLFrontendHandler.java
@@ -78,7 +78,7 @@
     
     @Override
     protected void executeCommand(final ChannelHandlerContext context, final ByteBuf message) {
-        CommandExecutorSelector.getExecutor(getBackendConnection().getTransactionType(), context.channel().id()).execute(new CommandExecutor(context, message, this));
+        CommandExecutorSelector.getExecutor(getBackendConnection().getTransactionType(), context.channel().id()).execute(new PostgreSQLCommandExecutor(context, message, this));
     }
     
     @Override
