diff --git a/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java b/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java
index 7563d1a..c04c157 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java
@@ -179,7 +179,7 @@
         super.action(r);
 
         ServletRequest request = r.getRequest();
-        while (AtmosphereRequest.class.isAssignableFrom(request.getClass())) {
+        while (!AtmosphereRequest.class.isAssignableFrom(request.getClass())) {
             request = AtmosphereRequest.class.cast(request).getRequest();
         }
 
