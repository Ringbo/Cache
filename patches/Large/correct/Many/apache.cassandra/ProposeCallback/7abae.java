diff --git a/src/java/org/apache/cassandra/service/paxos/ProposeCallback.java b/src/java/org/apache/cassandra/service/paxos/ProposeCallback.java
index 018dab9..b0bd163 100644
--- a/src/java/org/apache/cassandra/service/paxos/ProposeCallback.java
+++ b/src/java/org/apache/cassandra/service/paxos/ProposeCallback.java
@@ -59,7 +59,7 @@
 
     public void response(MessageIn<Boolean> msg)
     {
-        logger.debug("Propose response {} from {}", msg.payload, msg.from);
+        logger.trace("Propose response {} from {}", msg.payload, msg.from);
 
         if (msg.payload)
             accepts.incrementAndGet();
