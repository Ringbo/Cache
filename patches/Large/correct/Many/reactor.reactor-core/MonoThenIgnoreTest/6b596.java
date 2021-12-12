diff --git a/reactor-core/src/test/java/reactor/core/publisher/MonoThenIgnoreTest.java b/reactor-core/src/test/java/reactor/core/publisher/MonoThenIgnoreTest.java
index a999246..68cc470 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/MonoThenIgnoreTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/MonoThenIgnoreTest.java
@@ -33,7 +33,7 @@
 	public void normal() {
 		StepVerifier.create(Mono.just(1)
 		                        .thenEmpty(Flux.empty()))
-		            .expectComplete();
+		            .verifyComplete();
 	}
 
 	Publisher<Void> scenario(){
@@ -45,7 +45,7 @@
 	public void normal3() {
 		StepVerifier.create(Mono.just(1)
 		                        .then())
-		            .expectComplete();
+		            .verifyComplete();
 	}
 
 	@Test
@@ -54,7 +54,7 @@
 		                        .then(Mono.just(1))
 		                        .then(Mono.just(2)))
 		            .expectNext(2)
-		            .expectComplete();
+		            .verifyComplete();
 	}
 
 
@@ -69,7 +69,7 @@
 	public void normalTime() {
 		StepVerifier.withVirtualTime(this::scenario)
 		            .thenAwait(Duration.ofSeconds(123))
-		            .expectComplete();
+		            .verifyComplete();
 	}
 
 	@Test
