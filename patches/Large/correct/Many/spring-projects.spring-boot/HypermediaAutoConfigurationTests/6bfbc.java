diff --git a/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfigurationTests.java b/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfigurationTests.java
index bd950b2..05ee515 100644
--- a/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfigurationTests.java
+++ b/spring-boot-project/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfigurationTests.java
@@ -140,7 +140,8 @@
 		for (HttpMessageConverter<?> converter : handlerAdapter.getMessageConverters()) {
 			if (converter instanceof TypeConstrainedMappingJackson2HttpMessageConverter) {
 				assertThat(converter.getSupportedMediaTypes())
-						.containsExactly(MediaTypes.HAL_JSON);
+						.containsExactly(MediaTypes.HAL_JSON, MediaType.parseMediaType(
+								MediaTypes.HAL_JSON_VALUE + ";charset=UTF-8"));
 			}
 		}
 	}
