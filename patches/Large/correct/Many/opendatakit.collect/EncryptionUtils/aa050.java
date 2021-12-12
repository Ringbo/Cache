diff --git a/src/org/odk/collect/android/utilities/EncryptionUtils.java b/src/org/odk/collect/android/utilities/EncryptionUtils.java
index a4176b6..8efcbcd 100644
--- a/src/org/odk/collect/android/utilities/EncryptionUtils.java
+++ b/src/org/odk/collect/android/utilities/EncryptionUtils.java
@@ -270,7 +270,7 @@
 				c = Cipher.getInstance(EncryptionUtils.SYMMETRIC_ALGORITHM, "BC");
 				isNotBouncyCastle = false;
 			} catch (NoSuchProviderException e) {
-				Log.e(t, "Unable to obtain BouncyCastle provider! Decryption may fail!");
+				Log.w(t, "Unable to obtain BouncyCastle provider! Decryption may fail!");
 				e.printStackTrace();
 				isNotBouncyCastle = true;
 				c = Cipher.getInstance(EncryptionUtils.SYMMETRIC_ALGORITHM);
