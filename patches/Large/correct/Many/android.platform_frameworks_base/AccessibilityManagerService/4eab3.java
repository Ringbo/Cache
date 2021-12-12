diff --git a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
index cb6d4df..0488d22 100644
--- a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -1586,7 +1586,7 @@
     private void showAccessibilityButtonTargetSelection() {
         Intent intent = new Intent(AccessibilityManager.ACTION_CHOOSE_ACCESSIBILITY_BUTTON);
         intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
-        mContext.startActivity(intent);
+        mContext.startActivityAsUser(intent, UserHandle.of(mCurrentUserId));
     }
 
     private void scheduleNotifyClientsOfServicesStateChange(UserState userState) {
