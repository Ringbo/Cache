diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceFactory.java
index a8ec9ea..f3d0f84 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceFactory.java
@@ -239,7 +239,7 @@
      * @param r {@link AtmosphereResource}
      */
     public void unRegisterUuidForFindCandidate(AtmosphereResource r) {
-        logger.debug("Removing: {}", r);
+        logger.trace("Removing: {}", r);
         resources.remove(r.uuid());
     }
 
