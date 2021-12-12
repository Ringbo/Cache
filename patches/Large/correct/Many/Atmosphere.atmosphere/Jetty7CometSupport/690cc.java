diff --git a/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java b/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java
index 2cf969d..21f1b0b 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/Jetty7CometSupport.java
@@ -175,7 +175,7 @@
     public void action(AtmosphereResourceImpl r) {
         super.action(r);
 
-        ServletRequest request = r.getRequest(false);
+        ServletRequest request = r.getRequest(true);
         while (request != null) {
             try {
                 Continuation c = (Continuation) request.getAttribute(Continuation.class.getName());
