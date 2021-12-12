diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java
index 1f03024..7562399 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java
@@ -145,7 +145,7 @@
                 getContext().getMainThreadHandler());
         mContentResolver.registerContentObserver(Settings.Secure.getUriFor(
                 Settings.Secure.ACCESSIBILITY_DISPLAY_MAGNIFICATION_NAVBAR_ENABLED), false,
-                mMagnificationObserver);
+                mMagnificationObserver, UserHandle.USER_ALL);
 
         if (savedInstanceState != null) {
             mDisabledFlags1 = savedInstanceState.getInt(EXTRA_DISABLE_STATE, 0);
@@ -559,20 +559,23 @@
     private boolean onAccessibilityLongClick(View v) {
         Intent intent = new Intent(AccessibilityManager.ACTION_CHOOSE_ACCESSIBILITY_BUTTON);
         intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
-        v.getContext().startActivity(intent);
+        v.getContext().startActivityAsUser(intent, UserHandle.CURRENT);
         return true;
     }
 
     private void updateAccessibilityServicesState() {
         int requestingServices = 0;
         try {
-            if (Settings.Secure.getInt(mContentResolver,
-                    Settings.Secure.ACCESSIBILITY_DISPLAY_MAGNIFICATION_NAVBAR_ENABLED) == 1) {
+            if (Settings.Secure.getIntForUser(mContentResolver,
+                    Settings.Secure.ACCESSIBILITY_DISPLAY_MAGNIFICATION_NAVBAR_ENABLED,
+                    UserHandle.USER_CURRENT) == 1) {
                 requestingServices++;
             }
         } catch (Settings.SettingNotFoundException e) {
         }
 
+        // AccessibilityManagerService resolves services for the current user since the local
+        // AccessibilityManager is created from a Context with the INTERACT_ACROSS_USERS permission
         final List<AccessibilityServiceInfo> services =
                 mAccessibilityManager.getEnabledAccessibilityServiceList(
                         AccessibilityServiceInfo.FEEDBACK_ALL_MASK);
