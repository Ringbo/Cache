diff --git a/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlQueryExecutor.java b/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlQueryExecutor.java
index 2285329..3a79ad2 100644
--- a/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlQueryExecutor.java
+++ b/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlQueryExecutor.java
@@ -24,9 +24,9 @@
 
     private SocketChannel channel;
 
-    public MysqlQueryExecutor(MysqlConnector connector){
+    public MysqlQueryExecutor(MysqlConnector connector) throws IOException{
         if (!connector.isConnected()) {
-            throw new RuntimeException("should execute connector.connect() first");
+            throw new IOException("should execute connector.connect() first");
         }
 
         this.channel = connector.getChannel();
