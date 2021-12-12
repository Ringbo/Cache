diff --git a/eureka-client/src/main/java/com/netflix/discovery/DiscoveryClient.java b/eureka-client/src/main/java/com/netflix/discovery/DiscoveryClient.java
index 899f0fb..d9e2ba5 100644
--- a/eureka-client/src/main/java/com/netflix/discovery/DiscoveryClient.java
+++ b/eureka-client/src/main/java/com/netflix/discovery/DiscoveryClient.java
@@ -1148,7 +1148,7 @@
         arrangeListBasedonHostname(serviceUrls);
         serviceUrls.add(0, primaryServiceUrl);
 
-        logger.info(
+        logger.debug(
                 "This client will talk to the following serviceUrls in order : {} ",
                 Arrays.toString(serviceUrls.toArray()));
         t.stop();
@@ -1639,7 +1639,7 @@
                         return;
                     }
                     if (!serviceUrlList.equals(eurekaServiceUrls.get())) {
-                        logger.debug(
+                        logger.info(
                                 "Updating the serviceUrls as they seem to have changed from {} to {} ",
                                 Arrays.toString(eurekaServiceUrls.get()
                                         .toArray()), Arrays
