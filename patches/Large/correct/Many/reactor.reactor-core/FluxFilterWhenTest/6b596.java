diff --git a/reactor-core/src/test/java/reactor/core/publisher/FluxFilterWhenTest.java b/reactor-core/src/test/java/reactor/core/publisher/FluxFilterWhenTest.java
index 68f38d4..eae89e8 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/FluxFilterWhenTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/FluxFilterWhenTest.java
@@ -153,7 +153,7 @@
 	public void predicateThrows() {
 		StepVerifier.create(Flux.just(1)
 		                        .filterWhen(v -> { throw new IllegalStateException(); }))
-		            .expectError(IllegalStateException.class);
+		            .verifyError(IllegalStateException.class);
 	}
 
 	@Test
