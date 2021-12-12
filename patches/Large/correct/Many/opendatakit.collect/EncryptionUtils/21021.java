diff --git a/collect_app/src/main/java/org/odk/collect/android/utilities/EncryptionUtils.java b/collect_app/src/main/java/org/odk/collect/android/utilities/EncryptionUtils.java
index ae1a603..a9ce6dc 100644
--- a/collect_app/src/main/java/org/odk/collect/android/utilities/EncryptionUtils.java
+++ b/collect_app/src/main/java/org/odk/collect/android/utilities/EncryptionUtils.java
@@ -387,7 +387,7 @@
             } else {
                 msg = "No BouncyCastle provider for padding implementation of symmetric algorithm!";
             }
-            Timber.e(e, msg);
+            Timber.e(msg);
             return null;
         }
 
