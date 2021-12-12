diff --git a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
index 07a42bd..887cbac 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
@@ -356,7 +356,7 @@
      */
     public Drawable getBadgedIcon(Drawable icon, int userId) {
         if (userId != UserHandle.myUserId()) {
-            icon = mPm.getUserBadgedDrawableForDensity(icon, new UserHandle(userId), null, 0);
+            icon = mPm.getUserBadgedIcon(icon, new UserHandle(userId));
         }
         return icon;
     }
