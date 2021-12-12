diff --git a/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java b/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java
index 658f99e..bf4c913 100644
--- a/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java
+++ b/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java
@@ -80,7 +80,7 @@
 					chain.filter(exchange.mutate().principal(Mono.just(currentPrincipal)).build()),
 				springSecurityFilterChain,
 				(exchange,chain) ->
-					Mono.currentContext()
+					Mono.subscriberContext()
 						.flatMap( c -> c.<Mono<Principal>>get(Authentication.class))
 						.flatMap( principal -> exchange.getResponse()
 							.writeWith(Mono.just(toDataBuffer(principal.getName()))))
@@ -99,7 +99,7 @@
 			WebTestClient client = WebTestClientBuilder.bindToWebFilters(
 				springSecurityFilterChain,
 				(exchange,chain) ->
-					Mono.currentContext()
+					Mono.subscriberContext()
 						.flatMap( c -> c.<Mono<Principal>>get(Authentication.class))
 						.flatMap( principal -> exchange.getResponse()
 							.writeWith(Mono.just(toDataBuffer(principal.getName()))))
@@ -139,7 +139,7 @@
 			WebTestClient client = WebTestClientBuilder.bindToWebFilters(
 				springSecurityFilterChain,
 				(exchange,chain) ->
-					Mono.currentContext()
+					Mono.subscriberContext()
 						.flatMap( c -> c.<Mono<Principal>>get(Authentication.class))
 						.flatMap( principal -> exchange.getResponse()
 							.writeWith(Mono.just(toDataBuffer(principal.getName()))))
