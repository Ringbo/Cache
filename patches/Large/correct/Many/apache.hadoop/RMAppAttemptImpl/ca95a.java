diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/rmapp/attempt/RMAppAttemptImpl.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/rmapp/attempt/RMAppAttemptImpl.java
index efe0721..e289ad5 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/rmapp/attempt/RMAppAttemptImpl.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/rmapp/attempt/RMAppAttemptImpl.java
@@ -526,7 +526,7 @@
 
   private void setTrackingUrlToRMAppPage() {
     originalTrackingUrl = pjoin(
-        WebAppUtils.getResolvedRMWebAppURLWithoutScheme(conf),
+        WebAppUtils.getResolvedRMWebAppURLWithScheme(conf),
         "cluster", "app", getAppAttemptId().getApplicationId());
     proxiedTrackingUrl = originalTrackingUrl;
   }
