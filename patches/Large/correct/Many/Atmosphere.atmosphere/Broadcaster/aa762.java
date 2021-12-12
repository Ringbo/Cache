diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/Broadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/Broadcaster.java
index 10da1e6..ec433fb 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/Broadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/Broadcaster.java
@@ -201,7 +201,7 @@
      * @param resource an {@link AtmosphereResource}
      * @return {@link AtmosphereResource} if added, or null if it was already there.
      */
-    AtmosphereResource addAtmosphereResource(AtmosphereResource resource);
+    Broadcaster addAtmosphereResource(AtmosphereResource resource);
 
     /**
      * Remove a {@link AtmosphereResource} from the list of item to be notified when
@@ -210,7 +210,7 @@
      * @param resource an {@link AtmosphereResource}
      * @return {@link AtmosphereResource} if removed, or null if it was not.
      */
-    AtmosphereResource removeAtmosphereResource(AtmosphereResource resource);
+    Broadcaster removeAtmosphereResource(AtmosphereResource resource);
 
     /**
      * Set the {@link BroadcasterConfig} instance.
