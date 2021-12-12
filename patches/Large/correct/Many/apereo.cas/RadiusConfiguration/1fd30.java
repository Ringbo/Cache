diff --git a/support/cas-server-support-radius/src/main/java/org/apereo/cas/config/RadiusConfiguration.java b/support/cas-server-support-radius/src/main/java/org/apereo/cas/config/RadiusConfiguration.java
index ef0b8a7..fc8f6b8 100644
--- a/support/cas-server-support-radius/src/main/java/org/apereo/cas/config/RadiusConfiguration.java
+++ b/support/cas-server-support-radius/src/main/java/org/apereo/cas/config/RadiusConfiguration.java
@@ -126,7 +126,7 @@
     @Bean
     public AuthenticationEventExecutionPlanConfigurer radiusAuthenticationEventExecutionPlanConfigurer() {
         return plan -> {
-            Set<String> ips = getClientIps(casProperties.getAuthn().getRadius().getClient());
+            final Set<String> ips = getClientIps(casProperties.getAuthn().getRadius().getClient());
             if (!ips.isEmpty()) {
                 plan.registerAuthenticationHandler(radiusAuthenticationHandler());
             } else {
