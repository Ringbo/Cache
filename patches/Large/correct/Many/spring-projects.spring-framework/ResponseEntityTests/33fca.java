diff --git a/spring-web/src/test/java/org/springframework/http/ResponseEntityTests.java b/spring-web/src/test/java/org/springframework/http/ResponseEntityTests.java
index a58abf4..e4c0f7c 100644
--- a/spring-web/src/test/java/org/springframework/http/ResponseEntityTests.java
+++ b/spring-web/src/test/java/org/springframework/http/ResponseEntityTests.java
@@ -122,11 +122,11 @@
 
 	@Test
 	public void unprocessableEntity() throws URISyntaxException {
-		ResponseEntity<Void> responseEntity = ResponseEntity.unprocessableEntity().build();
+		ResponseEntity<String> responseEntity = ResponseEntity.unprocessableEntity().body("error");
 
 		assertNotNull(responseEntity);
 		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, responseEntity.getStatusCode());
-		assertNull(responseEntity.getBody());
+		assertEquals("error", responseEntity.getBody());
 	}
 
 	@Test
