diff --git a/core/java/android/app/MediaRouteButton.java b/core/java/android/app/MediaRouteButton.java
index 018b25d..e28a415 100644
--- a/core/java/android/app/MediaRouteButton.java
+++ b/core/java/android/app/MediaRouteButton.java
@@ -110,7 +110,7 @@
                     final RouteInfo route = mRouter.getRouteAt(i);
                     if ((route.getSupportedTypes() & mRouteTypes) != 0 &&
                             route != mRouter.getSystemAudioRoute()) {
-                        mRouter.selectRoute(mRouteTypes, route);
+                        mRouter.selectRouteInt(mRouteTypes, route);
                     }
                 }
             }
