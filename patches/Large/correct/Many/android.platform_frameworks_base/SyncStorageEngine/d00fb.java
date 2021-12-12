diff --git a/core/java/android/content/SyncStorageEngine.java b/core/java/android/content/SyncStorageEngine.java
index d81b2a3..6413cec 100644
--- a/core/java/android/content/SyncStorageEngine.java
+++ b/core/java/android/content/SyncStorageEngine.java
@@ -332,11 +332,11 @@
 
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
