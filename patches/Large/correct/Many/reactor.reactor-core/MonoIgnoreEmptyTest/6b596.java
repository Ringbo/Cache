diff --git a/reactor-core/src/test/java/reactor/core/publisher/MonoIgnoreEmptyTest.java b/reactor-core/src/test/java/reactor/core/publisher/MonoIgnoreEmptyTest.java
index db3a536..07498d0 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/MonoIgnoreEmptyTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/MonoIgnoreEmptyTest.java
@@ -30,14 +30,14 @@
 	public void normal() {
 		StepVerifier.create(Flux.just(1)
 		                        .thenEmpty(Flux.empty()))
-		            .expectComplete();
+		            .verifyComplete();
 	}
 
 	@Test
 	public void normal3() {
 		StepVerifier.create(Flux.just(1)
 		                        .then())
-		            .expectComplete();
+		            .verifyComplete();
 	}
 
 	@Test
