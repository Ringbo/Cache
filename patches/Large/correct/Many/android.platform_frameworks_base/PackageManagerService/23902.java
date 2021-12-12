diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 7a8eb58..c80f316 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -3418,7 +3418,7 @@
             String resolvedType, int flags, int sourceUserId) {
         List<ResolveInfo> resultTargetUser = mActivities.queryIntent(intent,
                 resolvedType, flags, filter.getTargetUserId());
-        if (resultTargetUser != null) {
+        if (resultTargetUser != null && !resultTargetUser.isEmpty()) {
             return createForwardingResolveInfo(filter, sourceUserId, filter.getTargetUserId());
         }
         return null;
