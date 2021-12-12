diff --git a/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookSocket.java b/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookSocket.java
index 5d68bf5..f491ed7 100644
--- a/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookSocket.java
+++ b/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookSocket.java
@@ -65,7 +65,7 @@
     return protocol;
   }
 
-  public void send(String serializeMessage) throws IOException {
+  public synchronized void send(String serializeMessage) throws IOException {
     connection.getRemote().sendString(serializeMessage);
   }
 
