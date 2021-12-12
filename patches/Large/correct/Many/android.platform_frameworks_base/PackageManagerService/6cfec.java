diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 83ddf1c..1704577 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -17006,7 +17006,9 @@
         intent.addCategory(Intent.CATEGORY_SETUP_WIZARD);
 
         final List<ResolveInfo> matches = queryIntentActivitiesInternal(intent, null,
-                MATCH_SYSTEM_ONLY | MATCH_DISABLED_COMPONENTS, UserHandle.myUserId());
+                MATCH_SYSTEM_ONLY | MATCH_DIRECT_BOOT_AWARE | MATCH_DIRECT_BOOT_UNAWARE
+                        | MATCH_DISABLED_COMPONENTS,
+                UserHandle.myUserId());
         if (matches.size() == 1) {
             return matches.get(0).getComponentInfo().packageName;
         } else {
