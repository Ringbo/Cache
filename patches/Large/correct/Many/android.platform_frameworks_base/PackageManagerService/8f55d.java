diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index b8d7286..f59e30d 100644
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -1835,7 +1835,8 @@
                 PackageSetting ps = mSettings.mPackages.get(packageName);
                 if (ps == null) return null;
                 // Note: isEnabledLP() does not apply here - always return info
-                return PackageParser.generateApplicationInfo(p, flags, ps.readUserState(userId));
+                return PackageParser.generateApplicationInfo(
+                        p, flags, ps.readUserState(userId), userId);
             }
             if ("android".equals(packageName)||"system".equals(packageName)) {
                 return mAndroidApplication;
