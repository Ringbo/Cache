diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 42b4aaf..1257bc6 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -4022,7 +4022,8 @@
                 if (ps != null) {
                     // Try to get the status from User settings first
                     int status = getDomainVerificationStatusLPr(ps, userId);
-                    if (status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS) {
+                    if (status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS ||
+                            status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_UNDEFINED) {
                         result.add(info);
                     } else if (status == INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_NEVER) {
                         neverList.add(info);
