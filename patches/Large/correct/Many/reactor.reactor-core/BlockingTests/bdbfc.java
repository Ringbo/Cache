diff --git a/src/test/java/reactor/core/publisher/BlockingTests.java b/src/test/java/reactor/core/publisher/BlockingTests.java
index f8c1237..f846938 100644
--- a/src/test/java/reactor/core/publisher/BlockingTests.java
+++ b/src/test/java/reactor/core/publisher/BlockingTests.java
@@ -77,7 +77,7 @@
 
 	@Test
 	public void blockingLast2() {
-		Assert.assertEquals((Integer) 1,
+		Assert.assertEquals((Integer) 10,
 				Flux.range(1, 10)
 				    .publishOn(scheduler)
 				    .blockLast(Duration.ofSeconds(10)));
