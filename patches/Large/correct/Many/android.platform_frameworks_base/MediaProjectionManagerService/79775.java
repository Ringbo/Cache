diff --git a/services/core/java/com/android/server/media/projection/MediaProjectionManagerService.java b/services/core/java/com/android/server/media/projection/MediaProjectionManagerService.java
index cdfb656..531d20a 100644
--- a/services/core/java/com/android/server/media/projection/MediaProjectionManagerService.java
+++ b/services/core/java/com/android/server/media/projection/MediaProjectionManagerService.java
@@ -91,7 +91,8 @@
     public void onStart() {
         publishBinderService(Context.MEDIA_PROJECTION_SERVICE, new BinderService(),
                 false /*allowIsolated*/);
-        mMediaRouter.addCallback(MediaRouter.ROUTE_TYPE_REMOTE_DISPLAY, mMediaRouterCallback);
+        mMediaRouter.addCallback(MediaRouter.ROUTE_TYPE_REMOTE_DISPLAY, mMediaRouterCallback,
+                MediaRouter.CALLBACK_FLAG_PASSIVE_DISCOVERY);
     }
 
     @Override
