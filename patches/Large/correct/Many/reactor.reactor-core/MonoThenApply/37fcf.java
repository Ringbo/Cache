diff --git a/src/main/java/reactor/core/publisher/MonoThenApply.java b/src/main/java/reactor/core/publisher/MonoThenApply.java
index 913a91d..4fd74c2 100644
--- a/src/main/java/reactor/core/publisher/MonoThenApply.java
+++ b/src/main/java/reactor/core/publisher/MonoThenApply.java
@@ -50,7 +50,7 @@
 	@Override
 	public void subscribe(Subscriber<? super R> s) {
 
-		if (FluxFlatMap.trySubscribeScalarMap(source, s, mapper)) {
+		if (FluxFlatMap.trySubscribeScalarMap(source, s, mapper, true)) {
 			return;
 		}
 
