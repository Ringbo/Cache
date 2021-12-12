diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
index 8e558ed..eb868a4 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
@@ -118,9 +118,9 @@
         String s = (String) req.getAttribute(SUSPENDED_ATMOSPHERE_RESOURCE_UUID);
         if (s == null) {
             s = response.getHeader(HeaderConfig.X_ATMOSPHERE_TRACKING_ID);
-            if (s == null) {
+            if (s == null && req != null) {
                 String tmp = req.getHeader(HeaderConfig.X_ATMOSPHERE_TRACKING_ID);
-                s = !tmp.equalsIgnoreCase("0") ? tmp : null;
+                s = tmp != null && !tmp.equalsIgnoreCase("0") ? tmp : null;
             }
         }
         uuid = s == null ? UUID.randomUUID().toString() : s;
