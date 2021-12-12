diff --git a/app/src/play/java/de/danoeh/antennapod/dialog/CustomMRControllerDialog.java b/app/src/play/java/de/danoeh/antennapod/dialog/CustomMRControllerDialog.java
index 93ec4e3..7b07d3f 100644
--- a/app/src/play/java/de/danoeh/antennapod/dialog/CustomMRControllerDialog.java
+++ b/app/src/play/java/de/danoeh/antennapod/dialog/CustomMRControllerDialog.java
@@ -354,14 +354,15 @@
 
         boolean showTitle = false;
         boolean showSubtitle = false;
-        if (route.getPresentationDisplayId() != MediaRouter.RouteInfo.PRESENTATION_DISPLAY_ID_NONE) {
+        if (route.getPresentationDisplay() != null &&
+                route.getPresentationDisplay().getDisplayId() != MediaRouter.RouteInfo.PRESENTATION_DISPLAY_ID_NONE) {
             // The user is currently casting screen.
             titleView.setText(android.support.v7.mediarouter.R.string.mr_controller_casting_screen);
             showTitle = true;
         } else if (state == null || state.getState() == PlaybackStateCompat.STATE_NONE) {
             // Show "No media selected" as we don't yet know the playback state.
             // (Only exception is bluetooth where we don't show anything.)
-            if (!route.isDeviceTypeBluetooth()) {
+            if (!route.isBluetooth()) {
                 titleView.setText(android.support.v7.mediarouter.R.string.mr_controller_no_media_selected);
                 showTitle = true;
             }
