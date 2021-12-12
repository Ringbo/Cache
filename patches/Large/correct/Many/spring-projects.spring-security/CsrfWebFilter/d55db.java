diff --git a/web/src/main/java/org/springframework/security/web/server/csrf/CsrfWebFilter.java b/web/src/main/java/org/springframework/security/web/server/csrf/CsrfWebFilter.java
index f797fbe..6de08be 100644
--- a/web/src/main/java/org/springframework/security/web/server/csrf/CsrfWebFilter.java
+++ b/web/src/main/java/org/springframework/security/web/server/csrf/CsrfWebFilter.java
@@ -123,7 +123,7 @@
 
 	private Mono<CsrfToken> generateToken(ServerWebExchange exchange) {
 		return this.csrfTokenRepository.generateToken(exchange)
-			.flatMap(token -> this.csrfTokenRepository.saveToken(exchange, token));
+			.delayUntil(token -> this.csrfTokenRepository.saveToken(exchange, token));
 	}
 
 	private static class DefaultRequireCsrfProtectionMatcher implements ServerWebExchangeMatcher {
