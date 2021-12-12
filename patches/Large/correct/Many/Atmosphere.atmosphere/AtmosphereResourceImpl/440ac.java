diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
index ca8925e..131ee08 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
@@ -244,7 +244,7 @@
         try {
             if (!isResumed.getAndSet(true) && isInScope.get()) {
                 suspended.set(false);
-                logger.debug("AtmosphereResource {} is resuming", uuid());
+                logger.trace("AtmosphereResource {} is resuming", uuid());
 
                 action.type(Action.TYPE.RESUME);
 
