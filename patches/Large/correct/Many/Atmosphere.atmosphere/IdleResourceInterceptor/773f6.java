diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/IdleResourceInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/IdleResourceInterceptor.java
index e78b257..1b5e9fa 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/IdleResourceInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/IdleResourceInterceptor.java
@@ -87,7 +87,7 @@
             AtmosphereRequest req = AtmosphereResourceImpl.class.cast(r).getRequest(false);
             try {
                 if (req.getAttribute(MAX_INACTIVE) == null) {
-                    logger.error("Invalid state {}", r);
+                    logger.warn("Invalid state {}", r);
                     r.removeFromAllBroadcasters();
                     config.resourcesFactory().unRegisterUuidForFindCandidate(r);
                     continue;
