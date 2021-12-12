diff --git a/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/config/annotation/AuthorizationServerConfigurationTests.java b/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/config/annotation/AuthorizationServerConfigurationTests.java
index 346fd49..d5e1701 100644
--- a/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/config/annotation/AuthorizationServerConfigurationTests.java
+++ b/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/config/annotation/AuthorizationServerConfigurationTests.java
@@ -147,7 +147,7 @@
 		            .authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT")
 		            .scopes("read", "write", "trust")
 		            .accessTokenValiditySeconds(60)
-		            .additionalInformation("foo:bar", "spam:bucket");
+		            .additionalInformation("foo:bar", "spam:bucket", "crap");
 		 	// @formatter:on
 		}
 
