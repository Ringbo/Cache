diff --git a/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/servlet/WebMvcAutoConfigurationTests.java b/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/servlet/WebMvcAutoConfigurationTests.java
index afed1b4..6267606 100644
--- a/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/servlet/WebMvcAutoConfigurationTests.java
+++ b/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/servlet/WebMvcAutoConfigurationTests.java
@@ -138,7 +138,7 @@
 	@Test
 	public void handlerMappingsCreated() {
 		this.contextRunner.run((context) -> assertThat(context)
-				.getBeans(HandlerMapping.class).hasSize(7));
+				.getBeans(HandlerMapping.class).hasSize(5));
 	}
 
 	@Test
