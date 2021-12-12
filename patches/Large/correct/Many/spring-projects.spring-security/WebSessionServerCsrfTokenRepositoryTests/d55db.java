diff --git a/web/src/test/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepositoryTests.java b/web/src/test/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepositoryTests.java
index 41627e3..038ea06 100644
--- a/web/src/test/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepositoryTests.java
+++ b/web/src/test/java/org/springframework/security/web/server/csrf/WebSessionServerCsrfTokenRepositoryTests.java
@@ -78,7 +78,7 @@
 	public void saveTokenWhenNullThenDeletes() {
 		CsrfToken token = this.repository.generateToken(this.exchange).block();
 
-		Mono<CsrfToken> result = this.repository.saveToken(this.exchange, null);
+		Mono<Void> result = this.repository.saveToken(this.exchange, null);
 		StepVerifier.create(result)
 			.verifyComplete();
 
