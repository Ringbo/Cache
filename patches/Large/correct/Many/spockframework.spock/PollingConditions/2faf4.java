diff --git a/spock-core/src/main/java/spock/util/concurrent/PollingConditions.java b/spock-core/src/main/java/spock/util/concurrent/PollingConditions.java
index f2d75bd..c867b23 100644
--- a/spock-core/src/main/java/spock/util/concurrent/PollingConditions.java
+++ b/spock-core/src/main/java/spock/util/concurrent/PollingConditions.java
@@ -161,7 +161,7 @@
         long elapsedTime = lastAttempt - start;
         if (elapsedTime >= timeoutMillis) {
           String msg = String.format("Condition not satisfied after %1.2f seconds and %d attempts", elapsedTime / 1000d, attempts);
-          throw new SpockTimeoutError(seconds, msg);
+          throw new SpockTimeoutError(seconds, msg, e);
         }
         Thread.sleep(Math.min(currDelay, start + timeoutMillis - System.currentTimeMillis()));
         currDelay *= factor;
