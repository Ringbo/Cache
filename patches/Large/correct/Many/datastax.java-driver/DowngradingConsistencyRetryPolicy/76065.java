diff --git a/driver-core/src/main/java/com/datastax/driver/core/policies/DowngradingConsistencyRetryPolicy.java b/driver-core/src/main/java/com/datastax/driver/core/policies/DowngradingConsistencyRetryPolicy.java
index 2c201e5..950dd86 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/policies/DowngradingConsistencyRetryPolicy.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/policies/DowngradingConsistencyRetryPolicy.java
@@ -156,7 +156,7 @@
             case SIMPLE:
             case BATCH:
                 // Since we provide atomicity there is no point in retrying
-                return requiredAcks > 0 ? RetryDecision.ignore() : RetryDecision.rethrow();
+                return receivedAcks > 0 ? RetryDecision.ignore() : RetryDecision.rethrow();
             case UNLOGGED_BATCH:
                 // Since only part of the batch could have been persisted,
                 // retry with whatever consistency should allow to persist all
