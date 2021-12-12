diff --git a/src/main/java/com/owncloud/android/authentication/AuthenticatorUrlUtils.java b/src/main/java/com/owncloud/android/authentication/AuthenticatorUrlUtils.java
index 56cf4f1..d8f1310 100644
--- a/src/main/java/com/owncloud/android/authentication/AuthenticatorUrlUtils.java
+++ b/src/main/java/com/owncloud/android/authentication/AuthenticatorUrlUtils.java
@@ -78,7 +78,7 @@
             normalizedUrl = normalizedUrl.trim();
 
             if (!normalizedUrl.toLowerCase(Locale.ROOT).startsWith(HTTP_PROTOCOL) &&
-                    !normalizedUrl.toLowerCase(Locale.ROOT).startsWith(HTTP_PROTOCOL)) {
+                    !normalizedUrl.toLowerCase(Locale.ROOT).startsWith(HTTPS_PROTOCOL)) {
                 if (sslWhenUnprefixed) {
                     normalizedUrl = HTTPS_PROTOCOL + normalizedUrl;
                 } else {
