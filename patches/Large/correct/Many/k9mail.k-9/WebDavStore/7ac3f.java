diff --git a/src/com/android/email/mail/store/WebDavStore.java b/src/com/android/email/mail/store/WebDavStore.java
index 463d5c0..3addb4a 100644
--- a/src/com/android/email/mail/store/WebDavStore.java
+++ b/src/com/android/email/mail/store/WebDavStore.java
@@ -140,7 +140,8 @@
 
         for (int i = 0, count = pathParts.length; i < count; i++) {
             if (i == 0) {
-                if (pathParts[0] != null) {
+                if (pathParts[0] != null &&
+                    pathParts[0].length() > 1) {
                     if (!pathParts[0].substring(1).equals("")) {
                         mPath = pathParts[0].substring(1);
                     } else {
@@ -150,11 +151,13 @@
                     mPath = "";
                 }
             } else if (i == 1) {
-                if (pathParts[1] != null) {
+                if (pathParts[1] != null &&
+                    pathParts[1].length() > 1) {
                     mAuthPath = "/" + pathParts[1];
                 }
             } else if (i == 2) {
-                if (pathParts[2] != null) {
+                if (pathParts[2] != null &&
+                    pathParts[2].length() > 1) {
                     mMailboxPath = "/" + pathParts[2];
                     if (mPath == null ||
                         mPath.equals("")) {
