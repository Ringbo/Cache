diff --git a/core/cas-server-core-services/src/main/java/org/apereo/cas/services/GroovyRegisteredServiceUsernameProvider.java b/core/cas-server-core-services/src/main/java/org/apereo/cas/services/GroovyRegisteredServiceUsernameProvider.java
index 9c19d02..daad059 100644
--- a/core/cas-server-core-services/src/main/java/org/apereo/cas/services/GroovyRegisteredServiceUsernameProvider.java
+++ b/core/cas-server-core-services/src/main/java/org/apereo/cas/services/GroovyRegisteredServiceUsernameProvider.java
@@ -54,7 +54,8 @@
             return resolveUsernameFromExternalGroovyScript(principal, service);
         }
 
-        LOGGER.warn("Groovy script [{}] is not a valid. CAS will switch to use the default principal identifier [{}]", principal.getId());
+        LOGGER.warn("Groovy script [{}] is not valid. CAS will switch to use the default principal identifier [{}]",
+                this.groovyScript, principal.getId());
         return principal.getId();
     }
 
@@ -72,7 +73,8 @@
             LOGGER.error(e.getMessage(), e);
         }
 
-        LOGGER.warn("Groovy script [{}] returned no value for username attribute. Fallback to default [{}]", principal.getId());
+        LOGGER.warn("Groovy script [{}] returned no value for username attribute. Fallback to default [{}]",
+                this.groovyScript, principal.getId());
         return principal.getId();
     }
 
@@ -88,7 +90,8 @@
             LOGGER.error(e.getMessage(), e);
         }
 
-        LOGGER.warn("Groovy script [{}] returned no value for username attribute. Fallback to default [{}]", principal.getId());
+        LOGGER.warn("Groovy script [{}] returned no value for username attribute. Fallback to default [{}]",
+                this.groovyScript, principal.getId());
         return principal.getId();
     }
 
