diff --git a/zeppelin-interpreter/src/main/java/com/nflabs/zeppelin/interpreter/remote/RemoteInterpreter.java b/zeppelin-interpreter/src/main/java/com/nflabs/zeppelin/interpreter/remote/RemoteInterpreter.java
index 7d98a48..240e861 100644
--- a/zeppelin-interpreter/src/main/java/com/nflabs/zeppelin/interpreter/remote/RemoteInterpreter.java
+++ b/zeppelin-interpreter/src/main/java/com/nflabs/zeppelin/interpreter/remote/RemoteInterpreter.java
@@ -281,7 +281,7 @@
     }
 
     try {
-      return client.completion(buf, buf, cursor);
+      return client.completion(className, buf, cursor);
     } catch (TException e) {
       throw new InterpreterException(e);
     } finally {
