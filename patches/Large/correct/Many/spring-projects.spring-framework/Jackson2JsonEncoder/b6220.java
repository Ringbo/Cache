diff --git a/spring-web/src/main/java/org/springframework/http/codec/json/Jackson2JsonEncoder.java b/spring-web/src/main/java/org/springframework/http/codec/json/Jackson2JsonEncoder.java
index 0b2c192..5c97a4f 100644
--- a/spring-web/src/main/java/org/springframework/http/codec/json/Jackson2JsonEncoder.java
+++ b/spring-web/src/main/java/org/springframework/http/codec/json/Jackson2JsonEncoder.java
@@ -96,7 +96,7 @@
 		Mono<DataBuffer> endArray = Mono.just(bufferFactory.wrap(END_ARRAY_BUFFER));
 
 		Flux<DataBuffer> array = Flux.from(inputStream)
-				.flatMap(value -> {
+				.concatMap(value -> {
 					DataBuffer arraySeparator = bufferFactory.wrap(SEPARATOR_BUFFER);
 					return Flux.just(encodeValue(value, bufferFactory, elementType), arraySeparator);
 				});
