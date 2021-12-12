diff --git a/flink-queryable-state/flink-queryable-state-runtime/src/main/java/org/apache/flink/queryablestate/client/proxy/KvStateClientProxyHandler.java b/flink-queryable-state/flink-queryable-state-runtime/src/main/java/org/apache/flink/queryablestate/client/proxy/KvStateClientProxyHandler.java
index 2e24431..8201305 100644
--- a/flink-queryable-state/flink-queryable-state-runtime/src/main/java/org/apache/flink/queryablestate/client/proxy/KvStateClientProxyHandler.java
+++ b/flink-queryable-state/flink-queryable-state-runtime/src/main/java/org/apache/flink/queryablestate/client/proxy/KvStateClientProxyHandler.java
@@ -197,14 +197,14 @@
 		final CompletableFuture<KvStateLocation> cachedFuture = lookupCache.get(cacheKey);
 
 		if (!forceUpdate && cachedFuture != null && !cachedFuture.isCompletedExceptionally()) {
-			LOG.debug("Retrieving location for state={} of job={} from the cache.", jobId, queryableStateName);
+			LOG.debug("Retrieving location for state={} of job={} from the cache.", queryableStateName, jobId);
 			return cachedFuture;
 		}
 
 		final KvStateLocationOracle kvStateLocationOracle = proxy.getKvStateLocationOracle(jobId);
 
 		if (kvStateLocationOracle != null) {
-			LOG.debug("Retrieving location for state={} of job={} from the key-value state location oracle.", jobId, queryableStateName);
+			LOG.debug("Retrieving location for state={} of job={} from the key-value state location oracle.", queryableStateName, jobId);
 			final CompletableFuture<KvStateLocation> location = new CompletableFuture<>();
 			lookupCache.put(cacheKey, location);
 
