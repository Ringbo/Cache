diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
index b504800..e8b67ac 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
@@ -188,11 +188,11 @@
 
             releaseExternalResources();
             if (notifierFuture != null) {
-                notifierFuture.cancel(true);
+                notifierFuture.cancel(false);
             }
 
             if (asyncWriteFuture != null) {
-                asyncWriteFuture.cancel(true);
+                asyncWriteFuture.cancel(false);
             }
 
             if (bc != null) {
