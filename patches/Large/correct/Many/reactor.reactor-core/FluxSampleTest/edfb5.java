diff --git a/reactor-core/src/test/java/reactor/core/publisher/FluxSampleTest.java b/reactor-core/src/test/java/reactor/core/publisher/FluxSampleTest.java
index 53752cb..8c7bea5 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/FluxSampleTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/FluxSampleTest.java
@@ -187,7 +187,7 @@
 	public void sampleIncludesLastItem() {
 		Flux<Integer> source = Flux.concat(
 				Flux.range(1, 5),
-				Mono.delay(Duration.ofMillis(260)).ignoreElement().map(Long::intValue),
+				Mono.delay(Duration.ofMillis(300)).ignoreElement().map(Long::intValue),
 				Flux.just(80, 90, 100)
 		).hide();
 
