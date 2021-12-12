diff --git a/driver-core/src/main/java/com/datastax/driver/core/RetryingCallback.java b/driver-core/src/main/java/com/datastax/driver/core/RetryingCallback.java
index 9515e59..f87a4b7 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/RetryingCallback.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/RetryingCallback.java
@@ -166,13 +166,13 @@
                             assert err.error instanceof ReadTimeoutException;
                             ReadTimeoutException rte = (ReadTimeoutException)err.error;
                             ConsistencyLevel rcl = ConsistencyLevel.from(rte.consistency);
-                            retry = retryPolicy.onReadTimeout(rcl, rte.received, rte.blockFor, rte.dataPresent, queryRetries);
+                            retry = retryPolicy.onReadTimeout(rcl, rte.blockFor, rte.received, rte.dataPresent, queryRetries);
                             break;
                         case WRITE_TIMEOUT:
                             assert err.error instanceof WriteTimeoutException;
                             WriteTimeoutException wte = (WriteTimeoutException)err.error;
                             ConsistencyLevel wcl = ConsistencyLevel.from(wte.consistency);
-                            retry = retryPolicy.onWriteTimeout(wcl, WriteType.from(wte.writeType), wte.received, wte.blockFor, queryRetries);
+                            retry = retryPolicy.onWriteTimeout(wcl, WriteType.from(wte.writeType), wte.blockFor, wte.received, queryRetries);
                             break;
                         case UNAVAILABLE:
                             assert err.error instanceof UnavailableException;
