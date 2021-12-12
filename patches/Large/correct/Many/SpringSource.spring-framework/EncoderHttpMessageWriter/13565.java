diff --git a/spring-web/src/main/java/org/springframework/http/codec/EncoderHttpMessageWriter.java b/spring-web/src/main/java/org/springframework/http/codec/EncoderHttpMessageWriter.java
index b93d986..4bc30d4 100644
--- a/spring-web/src/main/java/org/springframework/http/codec/EncoderHttpMessageWriter.java
+++ b/spring-web/src/main/java/org/springframework/http/codec/EncoderHttpMessageWriter.java
@@ -99,7 +99,7 @@
 
 		Flux<DataBuffer> body = this.encoder
 				.encode(inputStream, message.bufferFactory(), elementType, contentType, hints)
-				.mapError(this::mapError);
+				.onErrorMap(this::mapError);
 
 		return isStreamingMediaType(contentType) ?
 				message.writeAndFlushWith(body.map(Flux::just)) :
