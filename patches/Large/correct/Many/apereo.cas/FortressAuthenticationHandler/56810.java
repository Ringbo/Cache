diff --git a/support/cas-server-support-fortress/src/main/java/org/apereo/cas/adaptors/fortress/FortressAuthenticationHandler.java b/support/cas-server-support-fortress/src/main/java/org/apereo/cas/adaptors/fortress/FortressAuthenticationHandler.java
index 458e92c..778358b 100644
--- a/support/cas-server-support-fortress/src/main/java/org/apereo/cas/adaptors/fortress/FortressAuthenticationHandler.java
+++ b/support/cas-server-support-fortress/src/main/java/org/apereo/cas/adaptors/fortress/FortressAuthenticationHandler.java
@@ -70,7 +70,7 @@
                 LOGGER.debug("Fortress session result: [{}]", fortressXmlSession);
                 final Map<String, Object> attributes = new HashMap<>();
                 attributes.put(FORTRESS_SESSION_KEY, fortressXmlSession);
-                return createHandlerResult(c, principalFactory.createPrincipal(username, attributes), null);
+                return createHandlerResult(c, principalFactory.createPrincipal(username, attributes));
             } else {
                 LOGGER.warn("Could not establish a fortress session or session cannot authenticate");
             }
