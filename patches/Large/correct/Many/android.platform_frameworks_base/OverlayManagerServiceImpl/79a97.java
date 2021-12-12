diff --git a/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java b/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java
index db133f8..5bdef9e 100644
--- a/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java
+++ b/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java
@@ -102,7 +102,8 @@
 
                 if (oi == null) {
                     // This overlay does not exist in our settings.
-                    if (mDefaultOverlays.contains(overlayPackage.packageName)) {
+                    if (overlayPackage.isStaticOverlay ||
+                            mDefaultOverlays.contains(overlayPackage.packageName)) {
                         // Enable this overlay by default.
                         mSettings.setEnabled(overlayPackage.packageName, newUserId, true);
                     }
