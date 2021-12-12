diff --git a/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Ping.java b/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Ping.java
index a770ff9..a70b704 100644
--- a/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Ping.java
+++ b/aeron-samples/src/main/java/uk/co/real_logic/aeron/samples/Ping.java
@@ -106,7 +106,7 @@
 
                     System.out.println("Pinging " + NUMBER_OF_MESSAGES + " messages");
 
-                    sendPingAndReceivePong(pingPublication, pongSubscription, WARMUP_NUMBER_OF_MESSAGES);
+                    sendPingAndReceivePong(pingPublication, pongSubscription, NUMBER_OF_MESSAGES);
                 }
 
                 System.out.println("Histogram of RTT latencies in microseconds.");
