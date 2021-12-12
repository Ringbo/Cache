diff --git a/services/java/com/android/server/pm/KeySetManager.java b/services/java/com/android/server/pm/KeySetManager.java
index 8272c15..2acc779 100644
--- a/services/java/com/android/server/pm/KeySetManager.java
+++ b/services/java/com/android/server/pm/KeySetManager.java
@@ -99,7 +99,7 @@
     public void addDefinedKeySetToPackage(String packageName,
             Set<PublicKey> keys, String alias) {
         if ((packageName == null) || (keys == null) || (alias == null)) {
-            Log.e(TAG, "Got null argument for a defined keyset, ignoring!");
+            Log.d(TAG, "Got null argument for a defined keyset, ignoring!");
             return;
         }
         synchronized (mLockObject) {
@@ -120,7 +120,7 @@
     public void addSigningKeySetToPackage(String packageName,
             Set<PublicKey> signingKeys) {
         if ((packageName == null) || (signingKeys == null)) {
-            Log.e(TAG, "Got null argument for a signing keyset, ignoring!");
+            Log.d(TAG, "Got null argument for a signing keyset, ignoring!");
             return;
         }
         synchronized (mLockObject) {
