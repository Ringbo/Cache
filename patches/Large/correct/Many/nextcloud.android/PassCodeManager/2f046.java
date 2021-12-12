diff --git a/src/main/java/com/owncloud/android/authentication/PassCodeManager.java b/src/main/java/com/owncloud/android/authentication/PassCodeManager.java
index e72a55f..edded6b 100644
--- a/src/main/java/com/owncloud/android/authentication/PassCodeManager.java
+++ b/src/main/java/com/owncloud/android/authentication/PassCodeManager.java
@@ -110,7 +110,7 @@
     }
 
     private boolean passCodeShouldBeRequested() {
-        return (hasAuthenticationTimeoutExpired() && passCodeIsEnabled());
+        return (passCodeIsEnabled() && hasAuthenticationTimeoutExpired());
     }
 
     private boolean passCodeIsEnabled() {
@@ -119,7 +119,7 @@
     }
 
     private boolean fingerprintShouldBeRequested() {
-        return (hasAuthenticationTimeoutExpired() && fingerprintIsEnabled());
+        return (fingerprintIsEnabled() && hasAuthenticationTimeoutExpired());
     }
 
     private boolean hasAuthenticationTimeoutExpired() {
