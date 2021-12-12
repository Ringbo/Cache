diff --git a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
index 06c110d..d661754 100644
--- a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -1318,7 +1318,7 @@
 
     private void unbindAllServicesLocked(UserState userState) {
         List<AccessibilityServiceConnection> services = userState.mBoundServices;
-        for (int count = services.size(); count > 1; count--) {
+        for (int count = services.size(); count > 0; count--) {
             // When the service is unbound, it disappears from the list, so there's no need to
             // keep track of the index
             services.get(0).unbindLocked();
