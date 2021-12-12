diff --git a/reactor-core/src/test/java/reactor/core/publisher/MonoFilterWhenTest.java b/reactor-core/src/test/java/reactor/core/publisher/MonoFilterWhenTest.java
index 4d0c9c3..03b0d1f 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/MonoFilterWhenTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/MonoFilterWhenTest.java
@@ -156,7 +156,7 @@
 	public void predicateThrows() {
 		StepVerifier.create(Mono.just(1)
 		                        .filterWhen(v -> { throw new IllegalStateException(); }))
-		            .expectError(IllegalStateException.class);
+		            .verifyError(IllegalStateException.class);
 	}
 
 	@Test
