diff --git a/src/main/java/reactor/core/converter/RxJava1SingleConverter.java b/src/main/java/reactor/core/converter/RxJava1SingleConverter.java
index 2113aef..895d5a7 100644
--- a/src/main/java/reactor/core/converter/RxJava1SingleConverter.java
+++ b/src/main/java/reactor/core/converter/RxJava1SingleConverter.java
@@ -37,7 +37,7 @@
 	}
 
 	@SuppressWarnings("unchecked")
-	static public <T> Publisher<T> from(Single<T> o) {
+	static public <T> Mono<T> from(Single<T> o) {
 		return INSTANCE.toPublisher(o);
 	}
 
