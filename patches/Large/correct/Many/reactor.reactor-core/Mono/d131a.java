diff --git a/src/main/java/reactor/core/publisher/Mono.java b/src/main/java/reactor/core/publisher/Mono.java
index 05e7f8d..7ba654b 100644
--- a/src/main/java/reactor/core/publisher/Mono.java
+++ b/src/main/java/reactor/core/publisher/Mono.java
@@ -699,7 +699,7 @@
 	 */
 	public final Mono<T> cache() {
 		return MonoSource.wrap(Flux.from(this)
-		                           .publish()
+		                           .multicast(EmitterProcessor.replay(1))
 		                           .autoConnect());
 	}
 
