diff --git a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
index ea25f74..8abb7bb 100644
--- a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -2281,7 +2281,7 @@
 
         @Override
         public boolean onKeyEvent(KeyEvent keyEvent, int sequenceNumber) {
-            if (!mRequestFilterKeyEvents) {
+            if (!mRequestFilterKeyEvents || (mServiceInterface == null)) {
                 return false;
             }
             if((mAccessibilityServiceInfo.getCapabilities()
