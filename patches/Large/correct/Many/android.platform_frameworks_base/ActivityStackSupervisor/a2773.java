diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index 95bc95a..3496238 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -2606,9 +2606,11 @@
 
         stack.setVisibleBehindActivity(visible ? r : null);
         if (!visible) {
-            // Make the activity immediately above r opaque.
+            // If there is a translucent home activity, we need to force it stop being translucent,
+            // because we can't depend on the application to necessarily perform that operation.
+            // Check out b/14469711 for details.
             final ActivityRecord next = stack.findNextTranslucentActivity(r);
-            if (next != null) {
+            if (next != null && next.isHomeActivity()) {
                 mService.convertFromTranslucent(next.appToken);
             }
         }
