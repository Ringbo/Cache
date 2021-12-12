diff --git a/clustering/server/src/main/java/org/wildfly/clustering/server/dispatcher/ServiceCommandDispatcher.java b/clustering/server/src/main/java/org/wildfly/clustering/server/dispatcher/ServiceCommandDispatcher.java
index 35ec46b..6ccb326 100644
--- a/clustering/server/src/main/java/org/wildfly/clustering/server/dispatcher/ServiceCommandDispatcher.java
+++ b/clustering/server/src/main/java/org/wildfly/clustering/server/dispatcher/ServiceCommandDispatcher.java
@@ -202,7 +202,7 @@
     }
 
     private RequestOptions createRequestOptions() {
-        return new RequestOptions(ResponseMode.GET_ALL, this.timeout, false, FILTER, Message.Flag.DONT_BUNDLE);
+        return new RequestOptions(ResponseMode.GET_ALL, this.timeout, false, FILTER, Message.Flag.DONT_BUNDLE, Message.Flag.OOB);
     }
 
     static <R> CommandResponse<R> createCommandResponse(Rsp<R> response) {
