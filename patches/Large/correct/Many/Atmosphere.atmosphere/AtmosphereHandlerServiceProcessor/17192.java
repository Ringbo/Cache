diff --git a/modules/cpr/src/main/java/org/atmosphere/annotation/AtmosphereHandlerServiceProcessor.java b/modules/cpr/src/main/java/org/atmosphere/annotation/AtmosphereHandlerServiceProcessor.java
index a763738..207973e 100644
--- a/modules/cpr/src/main/java/org/atmosphere/annotation/AtmosphereHandlerServiceProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/annotation/AtmosphereHandlerServiceProcessor.java
@@ -74,7 +74,7 @@
                 IntrospectionUtils.addProperty(handler, nv[0], nv[1]);
             }
 
-            framework.addAtmosphereHandler(a.path(), handler, framework.getBroadcasterFactory().lookup(a.broadcaster(), true), l);
+            framework.addAtmosphereHandler(a.path(), handler, framework.getBroadcasterFactory().lookup(a.broadcaster(), a.path(), true), l);
             framework.setBroadcasterCacheClassName(a.broadcasterCache().getName());
         } catch (Throwable e) {
             logger.warn("", e);
