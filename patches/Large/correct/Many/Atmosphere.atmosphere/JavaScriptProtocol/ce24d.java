diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/JavaScriptProtocol.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/JavaScriptProtocol.java
index c0ec4e4..57a7f08 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/JavaScriptProtocol.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/JavaScriptProtocol.java
@@ -91,7 +91,7 @@
                 String javascriptVersion = request.getHeader(HeaderConfig.X_ATMOSPHERE_FRAMEWORK);
                 int version = Integer.valueOf(javascriptVersion.split("-")[0].replace(".", ""));
                 if (version < 221) {
-                    logger.debug("Invalid Atmosphere Version {}", javascriptVersion);
+                    logger.error("Invalid Atmosphere Version {}", javascriptVersion);
                     response.setStatus(501);
                     response.addHeader(X_ATMOSPHERE_ERROR, "Atmosphere Protocol version not supported.");
                     try {
