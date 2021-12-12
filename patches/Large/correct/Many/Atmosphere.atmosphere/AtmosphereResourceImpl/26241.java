diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
index a19e12a..6750354 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
@@ -124,7 +124,7 @@
         injectCacheHeaders = nocache != null ? false : true;
 
         String ac = config.getInitParameter(ApplicationConfig.DROP_ACCESS_CONTROL_ALLOW_ORIGIN_HEADER);
-        enableAccessControl = ac != null ? Boolean.parseBoolean(ac) : true;
+        enableAccessControl = ac != null ? !Boolean.parseBoolean(ac) : true;
 
         String wh = config.getInitParameter(FrameworkConfig.WRITE_HEADERS);
         writeHeaders = wh != null ? Boolean.parseBoolean(wh) : true;
