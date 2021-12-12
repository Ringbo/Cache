diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 59008fd..dadc872 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -4010,7 +4010,8 @@
                 if (ps != null) {
                     // Try to get the status from User settings first
                     int status = getDomainVerificationStatusLPr(ps, userId);
-                    if (status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS) {
+                    if (status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS ||
+                            status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_UNDEFINED) {
                         result.add(info);
                     } else if (status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_NEVER) {
                         neverList.add(info);
