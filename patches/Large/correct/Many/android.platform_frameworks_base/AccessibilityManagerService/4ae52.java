diff --git a/services/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
index abbf0d7..20c89ad 100644
--- a/services/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -2123,7 +2123,7 @@
             if (OWN_PROCESS_ID == Binder.getCallingPid()) {
                 return;
             }
-            if (hasPermission(permission)) {
+            if (!hasPermission(permission)) {
                 throw new SecurityException("You do not have " + permission
                         + " required to call " + function);
             }
