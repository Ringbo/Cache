diff --git a/eureka-client/src/main/java/com/netflix/discovery/DefaultEurekaClientConfig.java b/eureka-client/src/main/java/com/netflix/discovery/DefaultEurekaClientConfig.java
index 33237c4..8618bc4 100644
--- a/eureka-client/src/main/java/com/netflix/discovery/DefaultEurekaClientConfig.java
+++ b/eureka-client/src/main/java/com/netflix/discovery/DefaultEurekaClientConfig.java
@@ -132,7 +132,7 @@
     @Override
     public int getEurekaServiceUrlPollIntervalSeconds() {
         return configInstance.getIntProperty(
-                namespace + "serviceUrlPollIntervalMs", 5 * 60 * 1000).get();
+                namespace + "serviceUrlPollIntervalMs", 5 * 60 * 1000).get() / 1000;
     }
 
     /*
@@ -176,7 +176,7 @@
     @Override
     public int getEurekaServerReadTimeoutSeconds() {
         return configInstance.getIntProperty(
-                namespace + "eurekaServer.readTimeout", 8000).get();
+                namespace + "eurekaServer.readTimeout", 8).get();
     }
 
     /*
@@ -187,7 +187,7 @@
     @Override
     public int getEurekaServerConnectTimeoutSeconds() {
         return configInstance.getIntProperty(
-                namespace + "eurekaServer.connectTimeout", 5000).get();
+                namespace + "eurekaServer.connectTimeout", 5).get();
     }
 
     /*
