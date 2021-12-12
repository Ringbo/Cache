diff --git a/core/java/android/content/SyncStorageEngine.java b/core/java/android/content/SyncStorageEngine.java
index 984c070..98a4993 100644
--- a/core/java/android/content/SyncStorageEngine.java
+++ b/core/java/android/content/SyncStorageEngine.java
@@ -330,11 +330,11 @@
 
     @Override public void handleMessage(Message msg) {
         if (msg.what == MSG_WRITE_STATUS) {
-            synchronized (mAccounts) {
+            synchronized (mAuthorities) {
                 writeStatusLocked();
             }
         } else if (msg.what == MSG_WRITE_STATISTICS) {
-            synchronized (mAccounts) {
+            synchronized (mAuthorities) {
                 writeStatisticsLocked();
             }
         }
