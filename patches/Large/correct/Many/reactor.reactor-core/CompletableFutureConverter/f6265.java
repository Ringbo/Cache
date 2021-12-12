diff --git a/src/main/java/reactor/core/converter/CompletableFutureConverter.java b/src/main/java/reactor/core/converter/CompletableFutureConverter.java
index 09ab822..2c6ec37 100644
--- a/src/main/java/reactor/core/converter/CompletableFutureConverter.java
+++ b/src/main/java/reactor/core/converter/CompletableFutureConverter.java
@@ -56,7 +56,7 @@
 	}
 
 	@SuppressWarnings("unchecked")
-	static public <T> Publisher<T> from(CompletableFuture<T> o) {
+	static public <T> Mono<T> from(CompletableFuture<T> o) {
 		return INSTANCE.toPublisher(o);
 	}
 
