diff --git a/spring-test/src/test/java/org/springframework/test/web/reactive/server/samples/ResponseEntityTests.java b/spring-test/src/test/java/org/springframework/test/web/reactive/server/samples/ResponseEntityTests.java
index 1177be5..7048c25 100644
--- a/spring-test/src/test/java/org/springframework/test/web/reactive/server/samples/ResponseEntityTests.java
+++ b/spring-test/src/test/java/org/springframework/test/web/reactive/server/samples/ResponseEntityTests.java
@@ -111,7 +111,7 @@
 				.accept(TEXT_EVENT_STREAM)
 				.exchange()
 				.expectStatus().isOk()
-				.expectHeader().contentType(TEXT_EVENT_STREAM)
+				.expectHeader().contentTypeCompatibleWith(TEXT_EVENT_STREAM)
 				.returnResult(Person.class);
 
 		StepVerifier.create(result.getResponseBody())
