diff --git a/nd4j/nd4j-parameter-server-parent/nd4j-parameter-server-node/src/test/java/org/nd4j/parameterserver/distributed/v2/transport/impl/DummyTransportTest.java b/nd4j/nd4j-parameter-server-parent/nd4j-parameter-server-node/src/test/java/org/nd4j/parameterserver/distributed/v2/transport/impl/DummyTransportTest.java
index 2e26278..b2f530d 100644
--- a/nd4j/nd4j-parameter-server-parent/nd4j-parameter-server-node/src/test/java/org/nd4j/parameterserver/distributed/v2/transport/impl/DummyTransportTest.java
+++ b/nd4j/nd4j-parameter-server-parent/nd4j-parameter-server-node/src/test/java/org/nd4j/parameterserver/distributed/v2/transport/impl/DummyTransportTest.java
@@ -153,7 +153,7 @@
         transportB.propagateMessage(msg, PropagationMode.BOTH_WAYS);
 
         // we expect that each of the nodes gets this message
-        assertEquals(300, counter.get());
+        assertEquals(400, counter.get());
     }
 
     @Test
