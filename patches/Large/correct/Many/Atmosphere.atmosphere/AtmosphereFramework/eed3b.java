diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 666395c..9695e3c 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -581,10 +581,10 @@
             initEndpointMapper();
 
             autoDetectContainer();
-            configureWebDotXmlAtmosphereHandler(sc);
+            configureWebDotXmlAtmosphereHandler(scFacade);
             asyncSupport.init(scFacade);
             initAtmosphereHandler(scFacade);
-            configureAtmosphereInterceptor(sc);
+            configureAtmosphereInterceptor(scFacade);
             analytics();
 
             if (broadcasterCacheClassName == null) {
