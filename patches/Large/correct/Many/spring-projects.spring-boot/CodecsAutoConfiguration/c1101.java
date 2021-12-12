diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/http/codec/CodecsAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/http/codec/CodecsAutoConfiguration.java
index f35d4d9..69794cf 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/http/codec/CodecsAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/http/codec/CodecsAutoConfiguration.java
@@ -55,9 +55,9 @@
 		public CodecCustomizer jacksonCodecCustomizer(ObjectMapper objectMapper) {
 			return (configurer) -> {
 				CodecConfigurer.DefaultCodecs defaults = configurer.defaultCodecs();
-				defaults.jackson2Decoder(
+				defaults.jackson2JsonDecoder(
 						new Jackson2JsonDecoder(objectMapper, EMPTY_MIME_TYPES));
-				defaults.jackson2Encoder(
+				defaults.jackson2JsonEncoder(
 						new Jackson2JsonEncoder(objectMapper, EMPTY_MIME_TYPES));
 			};
 		}
