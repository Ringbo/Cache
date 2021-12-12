diff --git a/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java b/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java
index ed45188..ab9b032 100644
--- a/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java
+++ b/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java
@@ -48,7 +48,7 @@
 		exchange = exchange.mutate().principal(Mono.just(principal)).build();
 		StepVerifier.create(filter.filter(exchange,
 			new DefaultWebFilterChain( e ->
-				Mono.currentContext().doOnSuccess( context -> {
+				Mono.subscriberContext().doOnSuccess( context -> {
 					Principal contextPrincipal = context.<Mono<Principal>>get(Authentication.class).block();
 					assertThat(contextPrincipal).isEqualTo(principal);
 					assertThat(context.<String>get("foo")).isEqualTo("bar");
@@ -65,7 +65,7 @@
 		exchange = exchange.mutate().principal(Mono.just(principal)).build();
 		StepVerifier.create(filter.filter(exchange,
 			new DefaultWebFilterChain( e ->
-				Mono.currentContext().doOnSuccess( context -> {
+				Mono.subscriberContext().doOnSuccess( context -> {
 					Principal contextPrincipal = context.<Mono<Principal>>get(Authentication.class).block();
 					assertThat(contextPrincipal).isEqualTo(principal);
 				})
@@ -80,7 +80,7 @@
 		Context defaultContext = Context.empty();
 		StepVerifier.create(filter.filter(exchange,
 			new DefaultWebFilterChain( e ->
-				Mono.currentContext()
+				Mono.subscriberContext()
 					.defaultIfEmpty(defaultContext)
 					.doOnSuccess( context -> {
 					Principal contextPrincipal = context.<Mono<Principal>>get(Authentication.class).block();
