diff --git a/java/org/apache/catalina/realm/JNDIRealm.java b/java/org/apache/catalina/realm/JNDIRealm.java
index 2206e43..f1c95fd 100644
--- a/java/org/apache/catalina/realm/JNDIRealm.java
+++ b/java/org/apache/catalina/realm/JNDIRealm.java
@@ -1419,10 +1419,10 @@
 
         boolean validated = false;
         if (hasMessageDigest()) {
-            // iPlanet support if the values starts with {SHA1}
+            // Some directories prefix the password with the hash type
             // The string is in a format compatible with Base64.encode not
             // the Hex encoding of the parent class.
-            if (password.startsWith("{SHA}")) {
+            if (password.startsWith("{MD5}") || password.startsWith("{SHA}")) {
                 /* sync since super.digest() does this same thing */
                 synchronized (this) {
                     password = password.substring(5);
