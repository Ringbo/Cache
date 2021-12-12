diff --git a/src/com/owncloud/android/files/services/FileObserverService.java b/src/com/owncloud/android/files/services/FileObserverService.java
index 3cadc56..73a03ec 100644
--- a/src/com/owncloud/android/files/services/FileObserverService.java
+++ b/src/com/owncloud/android/files/services/FileObserverService.java
@@ -137,7 +137,7 @@
                 ProviderTableMeta.FILE_KEEP_IN_SYNC + " = ?",
                 new String[] {String.valueOf(1)},
                 null);
-        if (!c.moveToFirst()) return;
+        if (c == null || !c.moveToFirst()) return;
         AccountManager acm = AccountManager.get(this);
         Account[] accounts = acm.getAccounts();
         do {
