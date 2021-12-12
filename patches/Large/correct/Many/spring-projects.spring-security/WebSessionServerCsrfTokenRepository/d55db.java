diff --git a/web/src/main/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepository.java b/web/src/main/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepository.java
index 908f00a..222e59a 100644
--- a/web/src/main/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepository.java
+++ b/web/src/main/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepository.java
@@ -52,11 +52,10 @@
 	}
 
 	@Override
-	public Mono<CsrfToken> saveToken(ServerWebExchange exchange, CsrfToken token) {
+	public Mono<Void> saveToken(ServerWebExchange exchange, CsrfToken token) {
 		return exchange.getSession()
 			.doOnNext(session -> putToken(session.getAttributes(), token))
-			.flatMap(session -> session.changeSessionId())
-			.then(Mono.justOrEmpty(token));
+			.flatMap(session -> session.changeSessionId());
 	}
 
 	private void putToken(Map<String, Object> attributes, CsrfToken token) {
