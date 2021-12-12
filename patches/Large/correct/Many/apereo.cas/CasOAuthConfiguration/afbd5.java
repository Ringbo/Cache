diff --git a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java
index 192dec3..08d51cd 100644
--- a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java
+++ b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java
@@ -381,8 +381,8 @@
     }
 
     @Bean
-    @ConditionalOnMissingBean(name = "oauth20ValidationServiceSelectionStrategy")
-    public AuthenticationRequestServiceSelectionStrategy oauth20ValidationServiceSelectionStrategy() {
+    @ConditionalOnMissingBean(name = "oauth20AuthenticationRequestServiceSelectionStrategy")
+    public AuthenticationRequestServiceSelectionStrategy oauth20AuthenticationRequestServiceSelectionStrategy() {
         final OAuth20AuthenticationRequestServiceSelectionStrategy s = new OAuth20AuthenticationRequestServiceSelectionStrategy();
         s.setServicesManager(servicesManager);
         s.setWebApplicationServiceFactory(webApplicationServiceFactory);
@@ -422,6 +422,6 @@
             servicesManager.load();
         }
 
-        this.authenticationRequestServiceSelectionStrategies.add(0, oauth20ValidationServiceSelectionStrategy());
+        this.authenticationRequestServiceSelectionStrategies.add(0, oauth20AuthenticationRequestServiceSelectionStrategy());
     }
 }
