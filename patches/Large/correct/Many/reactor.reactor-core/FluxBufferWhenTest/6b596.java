diff --git a/reactor-core/src/test/java/reactor/core/publisher/FluxBufferWhenTest.java b/reactor-core/src/test/java/reactor/core/publisher/FluxBufferWhenTest.java
index 8a1ee7b..1981d8b 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/FluxBufferWhenTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/FluxBufferWhenTest.java
@@ -459,7 +459,7 @@
 		            .then(() -> {
 		            	source.assertSubscribers();
 		            	open.assertSubscribers();
-		            	close.assertSubscribers();
+			            close.assertNoSubscribers();
 		            	open.next(1);
 		            })
 		            .then(() -> {
@@ -468,7 +468,7 @@
 						source.complete();
 		            })
 		            .expectNextMatches(List::isEmpty)
-		            .expectComplete();
+		            .verifyComplete();
 
 		open.assertNoSubscribers();
 		close.assertNoSubscribers();
