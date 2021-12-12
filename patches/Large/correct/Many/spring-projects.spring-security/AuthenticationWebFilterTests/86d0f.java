diff --git a/webflux/src/test/java/org/springframework/security/web/server/authentication/AuthenticationWebFilterTests.java b/webflux/src/test/java/org/springframework/security/web/server/authentication/AuthenticationWebFilterTests.java
index 8b2c8b5..812b2fb 100644
--- a/webflux/src/test/java/org/springframework/security/web/server/authentication/AuthenticationWebFilterTests.java
+++ b/webflux/src/test/java/org/springframework/security/web/server/authentication/AuthenticationWebFilterTests.java
@@ -78,11 +78,11 @@
 			.bindToWebFilters(filter)
 			.build();
 
-		EntityExchangeResult<byte[]> result = client.get()
+		EntityExchangeResult<String> result = client.get()
 			.uri("/")
 			.exchange()
 			.expectStatus().isOk()
-			.expectBody().consumeAsStringWith(b -> assertThat(b).isEqualTo("ok"))
+			.expectBody(String.class).consumeWith(b -> assertThat(b.getResponseBody()).isEqualTo("ok"))
 			.returnResult();
 
 		verifyZeroInteractions(authenticationManager);
@@ -98,13 +98,13 @@
 			.bindToWebFilters(filter)
 			.build();
 
-		EntityExchangeResult<byte[]> result = client
+		EntityExchangeResult<String> result = client
 			.filter(basicAuthentication("test","this"))
 			.get()
 			.uri("/")
 			.exchange()
 			.expectStatus().isOk()
-			.expectBody().consumeAsStringWith(b -> assertThat(b).isEqualTo("ok"))
+			.expectBody(String.class).consumeWith(b -> assertThat(b.getResponseBody()).isEqualTo("ok"))
 			.returnResult();
 
 		assertThat(result.getResponseCookies()).isEmpty();
@@ -139,12 +139,12 @@
 			.bindToWebFilters(filter)
 			.build();
 
-		EntityExchangeResult<byte[]> result = client
+		EntityExchangeResult<String> result = client
 			.get()
 			.uri("/")
 			.exchange()
 			.expectStatus().isOk()
-			.expectBody().consumeAsStringWith(b -> assertThat(b).isEqualTo("ok"))
+			.expectBody(String.class).consumeWith(b -> assertThat(b.getResponseBody()).isEqualTo("ok"))
 			.returnResult();
 
 		verifyZeroInteractions(authenticationManager, successHandler, entryPoint);
