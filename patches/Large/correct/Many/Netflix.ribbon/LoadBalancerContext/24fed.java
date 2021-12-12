diff --git a/ribbon-core/src/main/java/com/netflix/client/LoadBalancerContext.java b/ribbon-core/src/main/java/com/netflix/client/LoadBalancerContext.java
index 9285248..1978b79 100644
--- a/ribbon-core/src/main/java/com/netflix/client/LoadBalancerContext.java
+++ b/ribbon-core/src/main/java/com/netflix/client/LoadBalancerContext.java
@@ -453,7 +453,7 @@
                 host = svc.getHost();
 
                 if(shouldUseOverridePort){
-                    logger.debug("Using override port of %d on client %s", clientName);
+                    logger.debug("Using override port of %d on client %s", overridePort, clientName);
                     port = overridePort;
                 }else{
                     port = svc.getPort();
