diff --git a/modules/cpr/src/main/java/org/atmosphere/container/Servlet30CometSupport.java b/modules/cpr/src/main/java/org/atmosphere/container/Servlet30CometSupport.java
index 1df0d6b..38eb72d 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/Servlet30CometSupport.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/Servlet30CometSupport.java
@@ -137,7 +137,7 @@
             throws IOException, ServletException {
 
         if (!req.isAsyncStarted()) {
-            AsyncContext asyncContext = req.startAsync();
+            AsyncContext asyncContext = req.startAsync(req, res);
             asyncContext.addListener(new CometListener(this));
             // Do nothing except setting the times out
             if (action.timeout() != -1) {
