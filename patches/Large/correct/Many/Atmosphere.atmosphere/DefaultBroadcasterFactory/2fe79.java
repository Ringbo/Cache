diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
index d93d883..50f34d5 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
@@ -234,7 +234,7 @@
                 for (Broadcaster b : lookupAll()) {
                     try {
                         // Prevent deadlock
-                        if (!b.getAtmosphereResources().contains(r)) {
+                        if (b.getAtmosphereResources().contains(r)) {
                             b.removeAtmosphereResource(r);
                         }
                     } catch (IllegalStateException ex) {
