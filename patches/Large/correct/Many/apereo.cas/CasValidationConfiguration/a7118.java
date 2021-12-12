diff --git a/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/config/CasValidationConfiguration.java b/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/config/CasValidationConfiguration.java
index 12bb10f..f817b5b 100644
--- a/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/config/CasValidationConfiguration.java
+++ b/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/config/CasValidationConfiguration.java
@@ -269,6 +269,6 @@
     @Bean
     @ConditionalOnMissingBean(name = "serviceValidationAuthorizers")
     public Set<ValidationAuthorizer> serviceValidationAuthorizers() {
-        return new LinkedHashSet<>();
+        return new LinkedHashSet<>(0);
     }
 }
