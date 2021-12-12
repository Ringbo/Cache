diff --git a/spring-web/src/main/java/org/springframework/http/codec/DecoderHttpMessageReader.java b/spring-web/src/main/java/org/springframework/http/codec/DecoderHttpMessageReader.java
index e9892f3..c54e50f 100644
--- a/spring-web/src/main/java/org/springframework/http/codec/DecoderHttpMessageReader.java
+++ b/spring-web/src/main/java/org/springframework/http/codec/DecoderHttpMessageReader.java
@@ -90,7 +90,7 @@
 		MediaType contentType = getContentType(message);
 		return this.decoder
 				.decode(message.getBody(), elementType, contentType, hints)
-				.mapError(this::mapError);
+				.onErrorMap(this::mapError);
 	}
 
 	@Override
@@ -100,7 +100,7 @@
 		MediaType contentType = getContentType(message);
 		return this.decoder
 				.decodeToMono(message.getBody(), elementType, contentType, hints)
-				.mapError(this::mapError);
+				.onErrorMap(this::mapError);
 	}
 
 	private MediaType getContentType(HttpMessage inputMessage) {
