diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java
index c7cc558..39dd695 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java
@@ -637,7 +637,7 @@
 
     protected void doInitParamsForWebSocket(ServletConfig sc) {
         String s = sc.getInitParameter(WEBSOCKET_SUPPORT);
-        if (s != null) {
+        if (s != null && Boolean.parseBoolean(s)) {
             webSocketEnabled = true;
             sessionSupport(false);
         }
