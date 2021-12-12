diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java
index e117dca..8c4f534 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java
@@ -90,9 +90,9 @@
 				PropertyPlaceholderAutoConfiguration.class);
 		this.context.refresh();
 		assertThat(this.context.getBean(AuthenticationManagerBuilder.class)).isNotNull();
-		// 4 for static resources and one for the rest
+		// 5 for static resources and one for the rest
 		assertThat(this.context.getBean(FilterChainProxy.class).getFilterChains())
-				.hasSize(5);
+				.hasSize(6);
 	}
 
 	@Test
