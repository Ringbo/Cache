diff --git a/services/core/java/com/android/server/am/ActiveServices.java b/services/core/java/com/android/server/am/ActiveServices.java
index 4b89b40..1bba7ec 100644
--- a/services/core/java/com/android/server/am/ActiveServices.java
+++ b/services/core/java/com/android/server/am/ActiveServices.java
@@ -707,7 +707,7 @@
         try {
             ServiceRecord r = findServiceLocked(className, token, userId);
             if (r != null) {
-                setServiceForegroundInnerLocked(r, userId, notification, flags);
+                setServiceForegroundInnerLocked(r, id, notification, flags);
             }
         } finally {
             Binder.restoreCallingIdentity(origId);
