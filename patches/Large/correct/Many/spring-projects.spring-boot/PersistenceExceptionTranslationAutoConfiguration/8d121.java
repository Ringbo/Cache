diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/dao/PersistenceExceptionTranslationAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/dao/PersistenceExceptionTranslationAutoConfiguration.java
index d858d06..5b3ef16 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/dao/PersistenceExceptionTranslationAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/dao/PersistenceExceptionTranslationAutoConfiguration.java
@@ -36,7 +36,7 @@
 	@Bean
 	@ConditionalOnMissingBean(PersistenceExceptionTranslationPostProcessor.class)
 	@ConditionalOnProperty(prefix = "spring.dao.exceptiontranslation", name = "enabled", matchIfMissing = true)
-	public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
+	public static PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
 		PersistenceExceptionTranslationPostProcessor postProcessor = new PersistenceExceptionTranslationPostProcessor();
 		postProcessor.setProxyTargetClass(true);
 		return postProcessor;
