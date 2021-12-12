diff --git a/src/biz/bokhorst/xprivacy/PackageChange.java b/src/biz/bokhorst/xprivacy/PackageChange.java
index 83937ba..8d831a4 100644
--- a/src/biz/bokhorst/xprivacy/PackageChange.java
+++ b/src/biz/bokhorst/xprivacy/PackageChange.java
@@ -35,7 +35,7 @@
 				PackageManager pm = context.getPackageManager();
 				try {
 					pInfo = pm.getPackageInfo(packageName, 0);
-					system = (pInfo.applicationInfo.flags & (ApplicationInfo.FLAG_SYSTEM | ApplicationInfo.FLAG_UPDATED_SYSTEM_APP)) == 0;
+					system = (pInfo.applicationInfo.flags & (ApplicationInfo.FLAG_SYSTEM | ApplicationInfo.FLAG_UPDATED_SYSTEM_APP)) != 0;
 				} catch (Throwable ex) {
 					Util.bug(null, ex);
 					return;
