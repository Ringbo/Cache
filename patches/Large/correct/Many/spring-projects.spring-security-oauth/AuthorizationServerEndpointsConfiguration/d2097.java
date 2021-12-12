diff --git a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/config/annotation/web/configuration/AuthorizationServerEndpointsConfiguration.java b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/config/annotation/web/configuration/AuthorizationServerEndpointsConfiguration.java
index 163edd9..89ffb22 100644
--- a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/config/annotation/web/configuration/AuthorizationServerEndpointsConfiguration.java
+++ b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/config/annotation/web/configuration/AuthorizationServerEndpointsConfiguration.java
@@ -198,7 +198,7 @@
 		@Override
 		public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
 			String[] names = BeanFactoryUtils.beanNamesForTypeIncludingAncestors(beanFactory,
-					JwtAccessTokenConverter.class);
+					JwtAccessTokenConverter.class, false, false);
 			if (names.length > 0) {
 				BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(TokenKeyEndpoint.class);
 				builder.addConstructorArgReference(names[0]);
