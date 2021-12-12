diff --git a/hazelcast-client-new/src/main/java/com/hazelcast/client/cache/impl/AbstractClientCacheProxy.java b/hazelcast-client-new/src/main/java/com/hazelcast/client/cache/impl/AbstractClientCacheProxy.java
index 8ebbb5f..b2d7aaa 100644
--- a/hazelcast-client-new/src/main/java/com/hazelcast/client/cache/impl/AbstractClientCacheProxy.java
+++ b/hazelcast-client-new/src/main/java/com/hazelcast/client/cache/impl/AbstractClientCacheProxy.java
@@ -398,7 +398,7 @@
                 int completionId = nextCompletionId();
                 // TODO If there is a single entry, we could make use of a put operation since that is a bit cheaper
                 ClientMessage request =
-                        CachePutAllCodec.encodeRequest(nameWithPrefix, entries, expiryPolicyData, partitionId);
+                        CachePutAllCodec.encodeRequest(nameWithPrefix, entries, expiryPolicyData, completionId);
                 Future f = invoke(request, partitionId, completionId);
                 futureEntriesTuples.add(new FutureEntriesTuple(f, entries));
                 if (nearCache != null) {
