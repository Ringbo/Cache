diff --git a/modules/cpr/src/main/java/org/atmosphere/container/JBossWebCometSupport.java b/modules/cpr/src/main/java/org/atmosphere/container/JBossWebCometSupport.java
index 68a5383..f7b81ed 100755
--- a/modules/cpr/src/main/java/org/atmosphere/container/JBossWebCometSupport.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/JBossWebCometSupport.java
@@ -152,7 +152,7 @@
     @Override
     public AsyncSupport complete(AtmosphereResourceImpl r) {
         try {
-            HttpEvent event = (HttpEvent) r.getRequest().getAttribute(HTTP_EVENT);
+            HttpEvent event = (HttpEvent) r.getRequest(false).getAttribute(HTTP_EVENT);
             // Resume without closing the underlying suspended connection.
             if (event != null) {
                 event.close();
