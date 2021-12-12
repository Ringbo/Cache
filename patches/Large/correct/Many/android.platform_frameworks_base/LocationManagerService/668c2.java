diff --git a/services/java/com/android/server/LocationManagerService.java b/services/java/com/android/server/LocationManagerService.java
index c8d6ae8..bcb7cb7 100644
--- a/services/java/com/android/server/LocationManagerService.java
+++ b/services/java/com/android/server/LocationManagerService.java
@@ -1358,7 +1358,7 @@
     private void applyAllProviderRequirementsLocked() {
         for (LocationProviderInterface p : mProviders) {
             // If provider is already disabled, don't need to do anything
-            if (!isAllowedBySettingsLocked(p.getName(), UserHandle.getUid(mCurrentUserId, 0))) {
+            if (!isAllowedByCurrentUserSettingsLocked(p.getName())) {
                 continue;
             }
 
