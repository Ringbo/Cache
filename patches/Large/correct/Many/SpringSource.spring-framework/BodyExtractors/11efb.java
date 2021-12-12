diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java
index 28e5b7a..2bc05c5 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/BodyExtractors.java
@@ -102,7 +102,10 @@
 	 * Return a {@code BodyExtractor} that reads form data into a {@link MultiValueMap}.
 	 * @return a {@code BodyExtractor} that reads form data
 	 */
-	public static BodyExtractor<Mono<MultiValueMap<String, String>>, ReactiveHttpInputMessage> toFormData() {
+	// Note that the returned BodyExtractor is parameterized to ServerHttpRequest, not
+	// ReactiveHttpInputMessage like other methods, since reading form data only typically happens on
+	// the server-side
+	public static BodyExtractor<Mono<MultiValueMap<String, String>>, ServerHttpRequest> toFormData() {
 		return (serverRequest, context) -> {
 					HttpMessageReader<MultiValueMap<String, String>> messageReader = formMessageReader(context);
 					return messageReader.readMono(FORM_TYPE, serverRequest, context.hints());
