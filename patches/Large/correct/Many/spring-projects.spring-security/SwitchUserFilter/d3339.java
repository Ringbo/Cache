diff --git a/web/src/main/java/org/springframework/security/web/authentication/switchuser/SwitchUserFilter.java b/web/src/main/java/org/springframework/security/web/authentication/switchuser/SwitchUserFilter.java
index 9cdf90e..1eb839d 100644
--- a/web/src/main/java/org/springframework/security/web/authentication/switchuser/SwitchUserFilter.java
+++ b/web/src/main/java/org/springframework/security/web/authentication/switchuser/SwitchUserFilter.java
@@ -250,7 +250,7 @@
         Authentication original = getSourceAuthentication(current);
 
         if (original == null) {
-            logger.error("Could not find original user Authentication object!");
+            logger.debug("Could not find original user Authentication object!");
             throw new AuthenticationCredentialsNotFoundException(messages.getMessage(
                     "SwitchUserFilter.noOriginalAuthentication",
                     "Could not find original Authentication object"));
