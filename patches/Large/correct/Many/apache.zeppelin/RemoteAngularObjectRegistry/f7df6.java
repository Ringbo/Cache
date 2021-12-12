diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/remote/RemoteAngularObjectRegistry.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/remote/RemoteAngularObjectRegistry.java
index 7458ce5..8a79ef1 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/remote/RemoteAngularObjectRegistry.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/remote/RemoteAngularObjectRegistry.java
@@ -62,7 +62,7 @@
                                                  final String paragraphId) {
 
     RemoteInterpreterProcess remoteInterpreterProcess = getRemoteInterpreterProcess();
-    if (!remoteInterpreterProcess.isRunning()) {
+    if (null == remoteInterpreterProcess || !remoteInterpreterProcess.isRunning()) {
       return super.add(name, o, noteId, paragraphId, true);
     }
 
