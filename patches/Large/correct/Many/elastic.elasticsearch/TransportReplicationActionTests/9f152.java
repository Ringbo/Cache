diff --git a/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java b/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java
index 9d8bf87..6b1d0dd 100644
--- a/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java
+++ b/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java
@@ -534,7 +534,7 @@
         AtomicReference<Throwable> failure = new AtomicReference<>();
         AtomicReference<Throwable> ignoredFailure = new AtomicReference<>();
         AtomicBoolean success = new AtomicBoolean();
-        proxy.failShard(replica, randomIntBetween(0, 10), "test", new ElasticsearchException("simulated"),
+        proxy.failShard(replica, randomIntBetween(1, 10), "test", new ElasticsearchException("simulated"),
             () -> success.set(true), failure::set, ignoredFailure::set
         );
         CapturingTransport.CapturedRequest[] shardFailedRequests = transport.getCapturedRequestsAndClear();
