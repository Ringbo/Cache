diff --git a/modules/cpr/src/main/java/org/atmosphere/handler/AbstractReflectorAtmosphereHandler.java b/modules/cpr/src/main/java/org/atmosphere/handler/AbstractReflectorAtmosphereHandler.java
index 8b7f569..699bb88 100644
--- a/modules/cpr/src/main/java/org/atmosphere/handler/AbstractReflectorAtmosphereHandler.java
+++ b/modules/cpr/src/main/java/org/atmosphere/handler/AbstractReflectorAtmosphereHandler.java
@@ -165,7 +165,7 @@
      * @param event
      */
     protected final void postStateChange(AtmosphereResourceEvent event) {
-        if (event.isResuming() || event.isCancelled()) return;
+        if (event.isCancelled() || event.isResuming()) return;
 
         AtmosphereResourceImpl r = AtmosphereResourceImpl.class.cast(event.getResource());
         // Between event.isCancelled and resource, the connection has been remotly closed.
