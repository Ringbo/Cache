diff --git a/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlUpdateExecutor.java b/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlUpdateExecutor.java
index 0b6c11c..f2f072c 100644
--- a/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlUpdateExecutor.java
+++ b/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/MysqlUpdateExecutor.java
@@ -23,9 +23,9 @@
 
     private SocketChannel       channel;
 
-    public MysqlUpdateExecutor(MysqlConnector connector){
+    public MysqlUpdateExecutor(MysqlConnector connector) throws IOException{
         if (!connector.isConnected()) {
-            throw new RuntimeException("should execute connector.connect() first");
+            throw new IOException("should execute connector.connect() first");
         }
 
         this.channel = connector.getChannel();
