diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultRenderingResponseBuilder.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultRenderingResponseBuilder.java
index 6955e69..2af7e5b 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultRenderingResponseBuilder.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultRenderingResponseBuilder.java
@@ -168,7 +168,7 @@
 			return Flux.fromStream(viewResolverStream)
 					.concatMap(viewResolver -> viewResolver.resolveViewName(name(), locale))
 					.next()
-					.otherwiseIfEmpty(Mono.error(new IllegalArgumentException("Could not resolve view with name '" +
+					.switchIfEmpty(Mono.error(new IllegalArgumentException("Could not resolve view with name '" +
 							name() +"'")))
 					.flatMap(view -> view.render(model(), contentType, exchange));
 		}
