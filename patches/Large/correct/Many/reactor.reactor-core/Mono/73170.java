diff --git a/src/main/java/reactor/core/publisher/Mono.java b/src/main/java/reactor/core/publisher/Mono.java
index 0ae4241..fe29c8c 100644
--- a/src/main/java/reactor/core/publisher/Mono.java
+++ b/src/main/java/reactor/core/publisher/Mono.java
@@ -861,7 +861,7 @@
 	 */
 	@SuppressWarnings({ "unchecked", "rawtypes" })
 	public static <T1, T2, T3> Mono<Tuple3<T1, T2, T3>> whenDelayError(Mono<? extends T1> p1, Mono<? extends T2> p2, Mono<? extends T3> p3) {
-		return onAssembly(new MonoWhen(true, a -> Tuples.fromArray((Object[])a), p2, p3));
+		return onAssembly(new MonoWhen(true, a -> Tuples.fromArray((Object[])a), p1, p2, p3));
 	}
 
 	/**
