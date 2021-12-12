diff --git a/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java b/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java
index 2e6bdb0..de9d88b 100644
--- a/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java
+++ b/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java
@@ -268,7 +268,13 @@
         continue;
       }
 
-      if (flow.getUpdateTime() > updateTime) {
+      // In the previous design, web server sends update requests to executor periodically and checks
+      // updateTime to decide whether to update the flow cache on web server side and remove active flows
+      // from DB. After removing runningFlows cache from web server, flow info will be fetched from DB
+      // directly, so both web server and executor will have the same flow updateTime here.
+      // todo jamiesjc: will investigate whether the current update mechanism is still needed. Plan to
+      // remove UpdaterThread in executorManager and deprecate handleAjaxUpdateRequest()
+      if (flow.getUpdateTime() >= updateTime) {
         updateList.add(flow.toUpdateObject(updateTime));
       }
     }
