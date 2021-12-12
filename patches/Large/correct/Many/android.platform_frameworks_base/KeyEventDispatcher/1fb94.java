diff --git a/services/accessibility/java/com/android/server/accessibility/KeyEventDispatcher.java b/services/accessibility/java/com/android/server/accessibility/KeyEventDispatcher.java
index e03c16e..e8f93b8 100644
--- a/services/accessibility/java/com/android/server/accessibility/KeyEventDispatcher.java
+++ b/services/accessibility/java/com/android/server/accessibility/KeyEventDispatcher.java
@@ -121,7 +121,7 @@
             Service service = boundServices.get(i);
             // Key events are handled only by services that declared
             // this capability and requested to filter key events.
-            if (!service.mRequestFilterKeyEvents) {
+            if (!service.mRequestFilterKeyEvents || (service.mServiceInterface == null)) {
                 continue;
             }
             int filterKeyEventBit = service.mAccessibilityServiceInfo.getCapabilities()
