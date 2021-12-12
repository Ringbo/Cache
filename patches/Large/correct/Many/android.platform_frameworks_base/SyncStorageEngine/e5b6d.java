diff --git a/core/java/android/content/SyncStorageEngine.java b/core/java/android/content/SyncStorageEngine.java
index 3ff13ae..df3d241 100644
--- a/core/java/android/content/SyncStorageEngine.java
+++ b/core/java/android/content/SyncStorageEngine.java
@@ -369,7 +369,7 @@
             int i = mAuthorities.size();
             while (i > 0) {
                 i--;
-                AuthorityInfo authority = mAuthorities.get(i);
+                AuthorityInfo authority = mAuthorities.valueAt(i);
                 if (authority.authority.equals(providerName)
                         && authority.enabled) {
                     return true;
@@ -408,7 +408,7 @@
             int i = mAuthorities.size();
             while (i > 0) {
                 i--;
-                AuthorityInfo authority = mAuthorities.get(i);
+                AuthorityInfo authority = mAuthorities.valueAt(i);
                 if (authority.authority.equals(providerName)) {
                     return authority.syncable;
                 }
@@ -581,7 +581,7 @@
             mPendingOperations.clear();
             final int N = mSyncStatus.size();
             for (int i=0; i<N; i++) {
-                mSyncStatus.get(i).pending = false;
+                mSyncStatus.valueAt(i).pending = false;
             }
             writePendingOperationsLocked();
         }
@@ -876,7 +876,7 @@
             SyncStatusInfo best = null;
             final int N = mSyncStatus.size();
             for (int i=0; i<N; i++) {
-                SyncStatusInfo cur = mSyncStatus.get(i);
+                SyncStatusInfo cur = mSyncStatus.valueAt(i);
                 AuthorityInfo ainfo = mAuthorities.get(cur.authorityId);
                 if (ainfo != null && ainfo.authority.equals(authority)) {
                     if (best == null) {
@@ -897,7 +897,7 @@
         synchronized (mAuthorities) {
             final int N = mSyncStatus.size();
             for (int i=0; i<N; i++) {
-                SyncStatusInfo cur = mSyncStatus.get(i);
+                SyncStatusInfo cur = mSyncStatus.valueAt(i);
                 AuthorityInfo ainfo = mAuthorities.get(cur.authorityId);
                 if (ainfo == null) {
                     continue;
@@ -1187,7 +1187,7 @@
             
             final int N = mAuthorities.size();
             for (int i=0; i<N; i++) {
-                AuthorityInfo authority = mAuthorities.get(i);
+                AuthorityInfo authority = mAuthorities.valueAt(i);
                 out.startTag(null, "authority");
                 out.attribute(null, "id", Integer.toString(authority.ident));
                 out.attribute(null, "account", authority.account.name);
@@ -1290,7 +1290,7 @@
                     SyncStatusInfo st = null;
                     while (i > 0) {
                         i--;
-                        st = mSyncStatus.get(i);
+                        st = mSyncStatus.valueAt(i);
                         if (st.authorityId == authority.ident) {
                             found = true;
                             break;
@@ -1333,7 +1333,7 @@
                     int i = mAuthorities.size();
                     while (i > 0) {
                         i--;
-                        AuthorityInfo authority = mAuthorities.get(i);
+                        AuthorityInfo authority = mAuthorities.valueAt(i);
                         if (authority.authority.equals(provider)) {
                             authority.enabled = value == null || Boolean.parseBoolean(value);
                             authority.syncable = 1;
