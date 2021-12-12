diff --git a/core/src/main/java/org/springframework/security/config/AuthenticationProviderBeanDefinitionParser.java b/core/src/main/java/org/springframework/security/config/AuthenticationProviderBeanDefinitionParser.java
index 6470cfa..6c1c79c 100644
--- a/core/src/main/java/org/springframework/security/config/AuthenticationProviderBeanDefinitionParser.java
+++ b/core/src/main/java/org/springframework/security/config/AuthenticationProviderBeanDefinitionParser.java
@@ -58,7 +58,7 @@
         if (userServiceElt != null) {
             userDetailsService = new UserServiceBeanDefinitionParser().parse(userServiceElt, parserContext);
         } else if (jdbcUserServiceElt != null) {
-            userDetailsService = new UserServiceBeanDefinitionParser().parse(userServiceElt, parserContext);
+            userDetailsService = new JdbcUserServiceBeanDefinitionParser().parse(jdbcUserServiceElt, parserContext);
         } else {
             throw new SecurityConfigurationException(Elements.AUTHENTICATION_PROVIDER
                     + " requires a UserDetailsService" );
