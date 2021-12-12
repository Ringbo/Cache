diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceEventListenerAdapter.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceEventListenerAdapter.java
index e40cb32..71c73f4 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceEventListenerAdapter.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceEventListenerAdapter.java
@@ -25,7 +25,7 @@
  */
 public class AtmosphereResourceEventListenerAdapter implements AtmosphereResourceEventListener {
 
-    private final static Logger logger = LoggerFactory.getLogger(AtmosphereResourceEventListener.class);
+    private final static Logger logger = LoggerFactory.getLogger(AtmosphereResourceEventListenerAdapter.class);
 
     @Override
     public void onPreSuspend(AtmosphereResourceEvent event) {
