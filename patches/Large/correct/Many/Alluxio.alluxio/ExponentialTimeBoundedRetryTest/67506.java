diff --git a/core/common/src/test/java/alluxio/retry/ExponentialTimeBoundedRetryTest.java b/core/common/src/test/java/alluxio/retry/ExponentialTimeBoundedRetryTest.java
index f951810..5e21123 100644
--- a/core/common/src/test/java/alluxio/retry/ExponentialTimeBoundedRetryTest.java
+++ b/core/common/src/test/java/alluxio/retry/ExponentialTimeBoundedRetryTest.java
@@ -74,7 +74,7 @@
       }
       thread.interrupt();
       thread.join(10 * Constants.SECOND_MS);
-      assertFalse(retry.attemptRetry());
+      assertFalse(retry.attempt());
     }
   }
 
