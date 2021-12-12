diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSetting.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSetting.java
index 3b42752..93481be 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSetting.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSetting.java
@@ -645,7 +645,7 @@
       createLauncher();
     }
     InterpreterLaunchContext launchContext = new
-        InterpreterLaunchContext(getJavaProperties(), option, interpreterRunner, id, name);
+        InterpreterLaunchContext(getJavaProperties(), option, interpreterRunner, id, group);
     RemoteInterpreterProcess process = (RemoteInterpreterProcess) launcher.launch(launchContext);
     process.setRemoteInterpreterEventPoller(
         new RemoteInterpreterEventPoller(remoteInterpreterProcessListener, appEventListener));
