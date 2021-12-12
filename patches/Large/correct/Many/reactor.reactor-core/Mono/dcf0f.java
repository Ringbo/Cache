diff --git a/src/main/java/reactor/core/publisher/Mono.java b/src/main/java/reactor/core/publisher/Mono.java
index 019e5a9..eb11c02 100644
--- a/src/main/java/reactor/core/publisher/Mono.java
+++ b/src/main/java/reactor/core/publisher/Mono.java
@@ -2529,7 +2529,7 @@
 	 * @see #compose(Function) for deferred composition of {@link Mono} for each {@link Subscriber}
 	 * @see #as for a loose conversion to an arbitrary type
 	 */
-	public final <V> Mono<V> transform(Function<? super Mono<T>, ? extends Mono<V>> transformer) {
+	public final <V> Mono<V> transform(Function<? super Mono<T>, ? extends Publisher<V>> transformer) {
 		return from(transformer.apply(this));
 	}
 
