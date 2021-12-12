diff --git a/core/java/android/content/ContentResolver.java b/core/java/android/content/ContentResolver.java
index b2b48e8..a09fee9 100644
--- a/core/java/android/content/ContentResolver.java
+++ b/core/java/android/content/ContentResolver.java
@@ -1763,7 +1763,7 @@
      * @param extras any extras to pass to the SyncAdapter.
      */
     public static void requestSync(Account account, String authority, Bundle extras) {
-        requestSyncAsUser(account, authority, UserHandle.getCallingUserId(), extras);
+        requestSyncAsUser(account, authority, UserHandle.myUserId(), extras);
     }
 
     /**
@@ -1938,7 +1938,7 @@
      * @param sync true if the provider should be synced when tickles are received for it
      */
     public static void setSyncAutomatically(Account account, String authority, boolean sync) {
-        setSyncAutomaticallyAsUser(account, authority, sync, UserHandle.getCallingUserId());
+        setSyncAutomaticallyAsUser(account, authority, sync, UserHandle.myUserId());
     }
 
     /**
@@ -2165,7 +2165,7 @@
      * @param sync the master auto-sync setting that applies to all the providers and accounts
      */
     public static void setMasterSyncAutomatically(boolean sync) {
-        setMasterSyncAutomaticallyAsUser(sync, UserHandle.getCallingUserId());
+        setMasterSyncAutomaticallyAsUser(sync, UserHandle.myUserId());
     }
 
     /**
@@ -2297,7 +2297,7 @@
      * @return true if there is a pending sync with the matching account and authority
      */
     public static boolean isSyncPending(Account account, String authority) {
-        return isSyncPendingAsUser(account, authority, UserHandle.getCallingUserId());
+        return isSyncPendingAsUser(account, authority, UserHandle.myUserId());
     }
 
     /**
