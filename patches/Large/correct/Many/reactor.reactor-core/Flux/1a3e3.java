diff --git a/src/main/java/reactor/core/publisher/Flux.java b/src/main/java/reactor/core/publisher/Flux.java
index 74406b9..39d6630 100644
--- a/src/main/java/reactor/core/publisher/Flux.java
+++ b/src/main/java/reactor/core/publisher/Flux.java
@@ -2639,7 +2639,7 @@
 	 * @return a transforming {@link Flux} that emits tuples of time elapsed in milliseconds and matching data
 	 */
 	public final Flux<Tuple2<Long, T>> elapsed() {
-		return transform(f -> f.map(new Elapsed<>()));
+		return compose(f -> f.map(new Elapsed<>()));
 	}
 
 	/**
