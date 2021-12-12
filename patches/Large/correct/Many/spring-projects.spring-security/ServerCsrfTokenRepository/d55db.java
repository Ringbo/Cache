diff --git a/web/src/main/java/org/springframework/security/web/server/csrf/ServerCsrfTokenRepository.java b/web/src/main/java/org/springframework/security/web/server/csrf/ServerCsrfTokenRepository.java
index 574e3a1..b09ee4e 100644
--- a/web/src/main/java/org/springframework/security/web/server/csrf/ServerCsrfTokenRepository.java
+++ b/web/src/main/java/org/springframework/security/web/server/csrf/ServerCsrfTokenRepository.java
@@ -46,7 +46,7 @@
 	 * @param exchange the {@link ServerWebExchange} to use
 	 * @param token the {@link CsrfToken} to save or null to delete
 	 */
-	Mono<CsrfToken> saveToken(ServerWebExchange exchange, CsrfToken token);
+	Mono<Void> saveToken(ServerWebExchange exchange, CsrfToken token);
 
 	/**
 	 * Loads the expected {@link CsrfToken} from the {@link ServerWebExchange}
