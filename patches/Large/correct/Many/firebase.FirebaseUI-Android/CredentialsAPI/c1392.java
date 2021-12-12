diff --git a/auth/src/main/java/com/firebase/ui/auth/util/CredentialsAPI.java b/auth/src/main/java/com/firebase/ui/auth/util/CredentialsAPI.java
index 1505eb7..f0038dc 100644
--- a/auth/src/main/java/com/firebase/ui/auth/util/CredentialsAPI.java
+++ b/auth/src/main/java/com/firebase/ui/auth/util/CredentialsAPI.java
@@ -163,7 +163,7 @@
         } else {
             // Email/password account
             String status = String.format("Signed in as %s", credential.getId());
-            Log.e(TAG, status);
+            Log.d(TAG, status);
         }
     }
 
