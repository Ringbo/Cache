diff --git a/src/main/java/reactor/core/publisher/FluxFlatMap.java b/src/main/java/reactor/core/publisher/FluxFlatMap.java
index 4087c76..d613dd1 100644
--- a/src/main/java/reactor/core/publisher/FluxFlatMap.java
+++ b/src/main/java/reactor/core/publisher/FluxFlatMap.java
@@ -272,7 +272,7 @@
 					if (r != Long.MAX_VALUE) {
 						REQUESTED.decrementAndGet(this);
 					}
-					if (maxConcurrency != Integer.MAX_VALUE && !isCancelled() && ++lastRequest == limit) {
+					if (maxConcurrency != Integer.MAX_VALUE && !isTerminated() && ++lastRequest == limit) {
 						lastRequest = 0;
 						subscription.request(limit);
 					}
