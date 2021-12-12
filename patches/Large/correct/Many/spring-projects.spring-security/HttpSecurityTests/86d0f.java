diff --git a/config/src/test/java/org/springframework/security/config/web/server/HttpSecurityTests.java b/config/src/test/java/org/springframework/security/config/web/server/HttpSecurityTests.java
index 41800c8..03ef0b4 100644
--- a/config/src/test/java/org/springframework/security/config/web/server/HttpSecurityTests.java
+++ b/config/src/test/java/org/springframework/security/config/web/server/HttpSecurityTests.java
@@ -88,14 +88,14 @@
 
 		WebTestClient client = buildClient();
 
-		EntityExchangeResult<byte[]> result = client
+		EntityExchangeResult<String> result = client
 			.filter(basicAuthentication("rob", "rob"))
 			.get()
 			.uri("/")
 			.exchange()
 			.expectStatus().isOk()
 			.expectHeader().valueMatches(HttpHeaders.CACHE_CONTROL, ".+")
-			.expectBody().consumeAsStringWith( b-> assertThat(b).isEqualTo("ok"))
+			.expectBody(String.class).consumeWith(b -> assertThat(b.getResponseBody()).isEqualTo("ok"))
 			.returnResult();
 
 		assertThat(result.getResponseCookies().getFirst("SESSION")).isNotNull();
