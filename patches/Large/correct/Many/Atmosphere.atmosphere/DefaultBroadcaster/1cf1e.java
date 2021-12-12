diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
index b78a635..9f2f554 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
@@ -995,7 +995,7 @@
             // Must make sure execute only one thread
             synchronized (r) {
                 try {
-                    r.getRequest().setAttribute(CACHED, "true");
+                    rImpl.getRequest().setAttribute(CACHED, "true");
                     prepareInvokeOnStateChange(r, e);
                 } catch (Throwable t) {
                     // An exception occurred
@@ -1408,7 +1408,7 @@
         if (!wasResumed && isAtmosphereResourceValid(r)) {
             logger.trace("Associating AtmosphereResource {} with Broadcaster {}", r.uuid(), getID());
 
-            String parentUUID = (String) r.getRequest().getAttribute(SUSPENDED_ATMOSPHERE_RESOURCE_UUID);
+            String parentUUID = (String) AtmosphereResourceImpl.class.cast(r).getRequest(false).getAttribute(SUSPENDED_ATMOSPHERE_RESOURCE_UUID);
             if (!backwardCompatible && parentUUID != null) {
                 AtmosphereResource p = AtmosphereResourceFactory.getDefault().find(parentUUID);
                 if (p != null && !resources.contains(p)) {
