diff --git a/spring-boot-project/spring-boot-test/src/main/java/org/springframework/boot/test/web/reactive/server/WebTestClientContextCustomizer.java b/spring-boot-project/spring-boot-test/src/main/java/org/springframework/boot/test/web/reactive/server/WebTestClientContextCustomizer.java
index 0ebfeb5..d5292f7 100644
--- a/spring-boot-project/spring-boot-test/src/main/java/org/springframework/boot/test/web/reactive/server/WebTestClientContextCustomizer.java
+++ b/spring-boot-project/spring-boot-test/src/main/java/org/springframework/boot/test/web/reactive/server/WebTestClientContextCustomizer.java
@@ -65,7 +65,7 @@
 	private void registerWebTestClient(ConfigurableApplicationContext context) {
 		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
 		if (beanFactory instanceof BeanDefinitionRegistry) {
-			registerWebTestClient((BeanDefinitionRegistry) context);
+			registerWebTestClient((BeanDefinitionRegistry) beanFactory);
 		}
 	}
 
