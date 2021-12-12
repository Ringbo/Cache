diff --git a/services/autofill/java/com/android/server/autofill/AutofillManagerService.java b/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
index f61edc5..8a20c85 100644
--- a/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
+++ b/services/autofill/java/com/android/server/autofill/AutofillManagerService.java
@@ -390,7 +390,7 @@
      * Updates a cached service for a given user.
      */
     private void updateCachedServiceLocked(int userId, boolean disabled) {
-        AutofillManagerServiceImpl service = peekServiceForUserLocked(userId);
+        AutofillManagerServiceImpl service = getServiceForUserLocked(userId);
         if (service != null) {
             service.updateLocked(disabled);
             if (!service.isEnabled()) {
