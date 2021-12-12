diff --git a/angel-ps/core/src/main/java/com/tencent/angel/client/local/AngelLocalClient.java b/angel-ps/core/src/main/java/com/tencent/angel/client/local/AngelLocalClient.java
index 19891a7..e4c9be2 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/client/local/AngelLocalClient.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/client/local/AngelLocalClient.java
@@ -71,7 +71,7 @@
     TConnection connection = TConnectionManager.getConnection(conf);
     while (tryTime < maxWaitSeconds) {
       LocalMaster localMaster = LocalClusterContext.get().getMaster();
-      if(localMaster == null) {
+      if(localMaster == null || localMaster.getAppMaster().getAppContext().getMasterService() == null) {
         Thread.sleep(1000);
         tryTime++;
         continue;
