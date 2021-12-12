diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/social/FacebookAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/social/FacebookAutoConfiguration.java
index 4d63ffe..34e3a90 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/social/FacebookAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/social/FacebookAutoConfiguration.java
@@ -58,17 +58,17 @@
 
 	@Configuration
 	@EnableSocial
-	@EnableConfigurationProperties(FaceBookProperties.class)
+	@EnableConfigurationProperties(FacebookProperties.class)
 	@ConditionalOnWebApplication
 	protected static class FacebookAutoConfigurationAdapter extends
 			SocialAutoConfigurerAdapter {
 
 		@Autowired
-		private FaceBookProperties faceBookProperties;
+		private FacebookProperties facebookProperties;
 
 		@Override
 		protected SocialProperties getSocialProperties() {
-			return faceBookProperties;
+			return facebookProperties;
 		}
 
 		@Bean
@@ -89,7 +89,7 @@
 	}
 
 	@ConfigurationProperties("spring.social.facebook")
-	public static class FaceBookProperties extends SocialProperties {
+	public static class FacebookProperties extends SocialProperties {
 
 		public ConnectionFactory<?> createConnectionFactory() {
 			return new FacebookConnectionFactory(
