diff --git a/support/cas-server-support-surrogate-authentication-rest/src/main/java/cas/authentication/surrogate/SurrogateRestAuthenticationService.java b/support/cas-server-support-surrogate-authentication-rest/src/main/java/cas/authentication/surrogate/SurrogateRestAuthenticationService.java
index 0ad2461..7ba5d26 100644
--- a/support/cas-server-support-surrogate-authentication-rest/src/main/java/cas/authentication/surrogate/SurrogateRestAuthenticationService.java
+++ b/support/cas-server-support-surrogate-authentication-rest/src/main/java/cas/authentication/surrogate/SurrogateRestAuthenticationService.java
@@ -63,6 +63,6 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 }
