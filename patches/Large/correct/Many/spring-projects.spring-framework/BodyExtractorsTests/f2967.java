diff --git a/spring-webflux/src/test/java/org/springframework/web/reactive/function/BodyExtractorsTests.java b/spring-webflux/src/test/java/org/springframework/web/reactive/function/BodyExtractorsTests.java
index a6f4b54..a027258 100644
--- a/spring-webflux/src/test/java/org/springframework/web/reactive/function/BodyExtractorsTests.java
+++ b/spring-webflux/src/test/java/org/springframework/web/reactive/function/BodyExtractorsTests.java
@@ -207,7 +207,7 @@
 
 	@Test
 	public void toFormData() throws Exception {
-		BodyExtractor<Mono<MultiValueMap<String, String>>, ServerHttpRequest> extractor = BodyExtractors.toFormData();
+		BodyExtractor<Mono<MultiValueMap<String, String>>, ReactiveHttpInputMessage> extractor = BodyExtractors.toFormData();
 
 		DefaultDataBufferFactory factory = new DefaultDataBufferFactory();
 		DefaultDataBuffer dataBuffer =
