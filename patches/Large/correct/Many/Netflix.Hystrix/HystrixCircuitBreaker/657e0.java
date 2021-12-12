diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCircuitBreaker.java b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCircuitBreaker.java
index f31e8fe..02b40c5 100644
--- a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCircuitBreaker.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCircuitBreaker.java
@@ -197,12 +197,13 @@
                 // our failure rate is too high, trip the circuit
                 if (circuitOpen.compareAndSet(false, true)) {
                     // if the previousValue was false then we want to set the currentTime
-                    // How could previousValue be true? If another thread was going through this code at the same time a race-condition could have
-                    // caused another thread to set it to true already even though we were in the process of doing the same
                     circuitOpenedOrLastTestedTime.set(System.currentTimeMillis());
                     return true;
                 } else {
-                    return false;
+                    // How could previousValue be true? If another thread was going through this code at the same time a race-condition could have
+                    // caused another thread to set it to true already even though we were in the process of doing the same
+                    // In this case, we know the circuit is open, so let the other thread set the currentTime and report back that the circuit is open
+                    return true;
                 }
             }
         }
