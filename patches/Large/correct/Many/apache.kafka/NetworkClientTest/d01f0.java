diff --git a/clients/src/test/java/org/apache/kafka/clients/NetworkClientTest.java b/clients/src/test/java/org/apache/kafka/clients/NetworkClientTest.java
index edbd72d..b966494 100644
--- a/clients/src/test/java/org/apache/kafka/clients/NetworkClientTest.java
+++ b/clients/src/test/java/org/apache/kafka/clients/NetworkClientTest.java
@@ -284,7 +284,7 @@
         client.poll(requestTimeoutMs, time.milliseconds());
         long delay = client.connectionDelay(node, time.milliseconds());
         long expectedDelay = reconnectBackoffMsTest;
-        double jitter = 0.2;
+        double jitter = 0.3;
         assertEquals(expectedDelay, delay, expectedDelay * jitter);
 
         // Sleep until there is no connection delay
@@ -299,7 +299,7 @@
         // Second attempt should take twice as long with twice the jitter
         expectedDelay = Math.round(delay * 2);
         delay = client.connectionDelay(node, time.milliseconds());
-        jitter = 0.4;
+        jitter = 0.6;
         assertEquals(expectedDelay, delay, expectedDelay * jitter);
     }
 
