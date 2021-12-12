diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/client/OAuth2RestOperationsConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/client/OAuth2RestOperationsConfiguration.java
index 2f93b81..55e30f6 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/client/OAuth2RestOperationsConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/client/OAuth2RestOperationsConfiguration.java
@@ -200,7 +200,7 @@
 
 	static class ClientCredentialsCondition extends AnyNestedCondition {
 
-		public ClientCredentialsCondition() {
+		ClientCredentialsCondition() {
 			super(ConfigurationPhase.PARSE_CONFIGURATION);
 		}
 
@@ -215,7 +215,7 @@
 
 	static class NotClientCredentialsCondition extends NoneNestedConditions {
 
-		public NotClientCredentialsCondition() {
+		NotClientCredentialsCondition() {
 			super(ConfigurationPhase.PARSE_CONFIGURATION);
 		}
 
