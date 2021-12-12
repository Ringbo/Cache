diff --git a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
index efca159..8febecf 100644
--- a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -1141,7 +1141,7 @@
         // TODO: support shared UIDs
         if (maxBytes > 0 && maxBytes > totalBytes / 2) {
             final String[] packageNames = mContext.getPackageManager().getPackagesForUid(maxUid);
-            if (packageNames.length == 1) {
+            if (packageNames != null && packageNames.length == 1) {
                 try {
                     return mContext.getPackageManager().getApplicationInfo(packageNames[0],
                             MATCH_ANY_USER | MATCH_DISABLED_COMPONENTS | MATCH_DIRECT_BOOT_AWARE
