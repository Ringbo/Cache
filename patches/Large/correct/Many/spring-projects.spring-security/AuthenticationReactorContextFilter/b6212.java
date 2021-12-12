diff --git a/webflux/src/main/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilter.java b/webflux/src/main/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilter.java
index 4ae287f..599180d 100644
--- a/webflux/src/main/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilter.java
+++ b/webflux/src/main/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilter.java
@@ -40,6 +40,6 @@
 	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
 
 		return chain.filter(exchange)
-				.contextStart((Context context) -> context.put(Authentication.class, exchange.getPrincipal()));
+				.subscriberContext((Context context) -> context.put(Authentication.class, exchange.getPrincipal()));
 	}
 }
