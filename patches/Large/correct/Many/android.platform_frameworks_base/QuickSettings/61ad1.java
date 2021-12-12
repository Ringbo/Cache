diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java
index 53be1dc..bb03fd3 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java
@@ -228,7 +228,7 @@
         }
         intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
         mContext.startActivityAsUser(intent, new UserHandle(UserHandle.USER_CURRENT));
-        getService().animateCollapse();
+        getService().animateCollapseNotifications();
     }
 
     private void addUserTiles(ViewGroup parent, LayoutInflater inflater) {
