diff --git a/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java b/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java
index 70714b9..b9c6672 100644
--- a/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java
@@ -176,7 +176,7 @@
         r.getRequest().setAttribute(FrameworkConfig.ATMOSPHERE_RESOURCE, r);
         r.getRequest().setAttribute(FrameworkConfig.ATMOSPHERE_HANDLER, this);
         try {
-            if (wrapRequest) {
+            if (!wrapRequest) {
                 wrapper.service(r.getRequest(), r.getResponse());
             } else {
                 wrapper.service(new AtmosphereRequestWrapper(r.getRequest()), new AtmosphereResponseWrapper(r.getResponse()));
