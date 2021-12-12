diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 6ec99f6..3d9adbd 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -13567,7 +13567,7 @@
             sb.append("Process: ").append(processName).append("\n");
             int flags = process.info.flags;
             IPackageManager pm = AppGlobals.getPackageManager();
-            sb.append("Flags: 0x").append(Integer.toString(flags, 16)).append("\n");
+            sb.append("Flags: 0x").append(Integer.toHexString(flags)).append("\n");
             for (int ip=0; ip<process.pkgList.size(); ip++) {
                 String pkg = process.pkgList.keyAt(ip);
                 sb.append("Package: ").append(pkg);
