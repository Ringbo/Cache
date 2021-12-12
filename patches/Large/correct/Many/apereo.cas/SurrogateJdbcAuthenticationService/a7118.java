diff --git a/support/cas-server-support-surrogate-authentication-jdbc/src/main/java/org/apereo/cas/authentication/surrogate/SurrogateJdbcAuthenticationService.java b/support/cas-server-support-surrogate-authentication-jdbc/src/main/java/org/apereo/cas/authentication/surrogate/SurrogateJdbcAuthenticationService.java
index 58d3f85..c6915ae 100644
--- a/support/cas-server-support-surrogate-authentication-jdbc/src/main/java/org/apereo/cas/authentication/surrogate/SurrogateJdbcAuthenticationService.java
+++ b/support/cas-server-support-surrogate-authentication-jdbc/src/main/java/org/apereo/cas/authentication/surrogate/SurrogateJdbcAuthenticationService.java
@@ -68,7 +68,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
