diff --git a/config/src/test/java/org/springframework/security/config/annotation/web/socket/AbstractSecurityWebSocketMessageBrokerConfigurerTests.java b/config/src/test/java/org/springframework/security/config/annotation/web/socket/AbstractSecurityWebSocketMessageBrokerConfigurerTests.java
index 759fd7d..b917f13 100644
--- a/config/src/test/java/org/springframework/security/config/annotation/web/socket/AbstractSecurityWebSocketMessageBrokerConfigurerTests.java
+++ b/config/src/test/java/org/springframework/security/config/annotation/web/socket/AbstractSecurityWebSocketMessageBrokerConfigurerTests.java
@@ -444,7 +444,7 @@
 		// @formatter:on
 
 		@Bean
-		public SecurityExpressionHandler<Message<Object>> messageSecurityExpressionHandler() {
+		public static SecurityExpressionHandler<Message<Object>> messageSecurityExpressionHandler() {
 			return new DefaultMessageSecurityExpressionHandler<Object>() {
 				@Override
 				protected SecurityExpressionOperations createSecurityExpressionRoot(
