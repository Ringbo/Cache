diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java
index 227790a..28e5b7a 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java
@@ -102,7 +102,7 @@
 	 * Return a {@code BodyExtractor} that reads form data into a {@link MultiValueMap}.
 	 * @return a {@code BodyExtractor} that reads form data
 	 */
-	public static BodyExtractor<Mono<MultiValueMap<String, String>>, ServerHttpRequest> toFormData() {
+	public static BodyExtractor<Mono<MultiValueMap<String, String>>, ReactiveHttpInputMessage> toFormData() {
 		return (serverRequest, context) -> {
 					HttpMessageReader<MultiValueMap<String, String>> messageReader = formMessageReader(context);
 					return messageReader.readMono(FORM_TYPE, serverRequest, context.hints());
