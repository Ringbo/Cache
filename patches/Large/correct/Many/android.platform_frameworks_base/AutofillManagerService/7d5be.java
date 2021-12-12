diff --git a/services/autofill/java/com/android/server/autofill/AutofillManagerService.java b/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
index 4b3abea..3689536 100644
--- a/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
+++ b/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
@@ -514,7 +514,7 @@
      */
     @GuardedBy("mLock")
     private void updateCachedServiceLocked(int userId, boolean disabled) {
-        AutofillManagerServiceImpl service = peekServiceForUserLocked(userId);
+        AutofillManagerServiceImpl service = getServiceForUserLocked(userId);
         if (service != null) {
             service.destroySessionsLocked();
             service.updateLocked(disabled);
