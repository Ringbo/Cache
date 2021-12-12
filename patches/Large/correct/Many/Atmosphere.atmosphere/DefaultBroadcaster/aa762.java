diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
index 6e25f77..05169f6 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
@@ -995,12 +995,12 @@
      * {@inheritDoc}
      */
     @Override
-    public AtmosphereResource addAtmosphereResource(AtmosphereResource r) {
+    public Broadcaster addAtmosphereResource(AtmosphereResource r) {
 
         try {
             if (destroyed.get()) {
                 logger.debug(DESTROYED, getID(), "addAtmosphereResource(AtmosphereResource<?, ?> r");
-                return r;
+                return this;
             }
 
             start();
@@ -1027,7 +1027,7 @@
             }
 
             if (resources.contains(r)) {
-                return r;
+                return this;
             }
 
             // We need to synchronize here to let the push method cache message.
@@ -1051,7 +1051,7 @@
                 }
             }
         }
-        return r;
+        return this;
     }
 
     private boolean isAtmosphereResourceValid(AtmosphereResource r) {
@@ -1064,15 +1064,15 @@
      * {@inheritDoc}
      */
     @Override
-    public AtmosphereResource removeAtmosphereResource(AtmosphereResource r) {
+    public Broadcaster removeAtmosphereResource(AtmosphereResource r) {
 
         if (destroyed.get()) {
             logger.debug(DESTROYED, getID(), "removeAtmosphereResource(AtmosphereResource r)");
-            return r;
+            return this;
         }
 
         if (!resources.contains(r)) {
-            return null;
+            return this;
         }
         // Prevent two thread to mix operation
         boolean removed = resources.remove(r);
@@ -1089,7 +1089,7 @@
                 }
             }
         }
-        return r;
+        return this;
     }
 
     private void notifyIdleListener() {
