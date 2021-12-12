diff --git a/k9mail-library/src/main/java/com/fsck/k9/mail/ssl/LocalKeyStore.java b/k9mail-library/src/main/java/com/fsck/k9/mail/ssl/LocalKeyStore.java
index 103c468..bdfc0b2 100644
--- a/k9mail-library/src/main/java/com/fsck/k9/mail/ssl/LocalKeyStore.java
+++ b/k9mail-library/src/main/java/com/fsck/k9/mail/ssl/LocalKeyStore.java
@@ -92,7 +92,7 @@
             mKeyStore = store;
             mKeyStoreFile = file;
         } catch (Exception e) {
-            Timber.e("Failed to initialize local key store", e);
+            Timber.e(e, "Failed to initialize local key store");
             // Use of the local key store is effectively disabled.
             mKeyStore = null;
             mKeyStoreFile = null;
