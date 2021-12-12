diff --git a/plugins/tasks/tasks-core/src/com/intellij/tasks/bugzilla/BugzillaRepository.java b/plugins/tasks/tasks-core/src/com/intellij/tasks/bugzilla/BugzillaRepository.java
index af3df55..86a511b 100644
--- a/plugins/tasks/tasks-core/src/com/intellij/tasks/bugzilla/BugzillaRepository.java
+++ b/plugins/tasks/tasks-core/src/com/intellij/tasks/bugzilla/BugzillaRepository.java
@@ -346,7 +346,8 @@
         return  (T)new XmlRpcClient(getUrl()).execute(new XmlRpcRequest(myMethodName, parameters), myTransport);
       }
       catch (XmlRpcClientException e) {
-        if (e.getMessage().contains("Error decoding XML-RPC response")) {
+        // Unfortunately there is no standard error code to identify this kind of error in portable way
+        if (e.getMessage().equals("Error decoding XML-RPC response")) {
           throw new RequestFailedException(TaskBundle.message("bugzilla.failure.malformed.response"), e);
         }
         throw e;
