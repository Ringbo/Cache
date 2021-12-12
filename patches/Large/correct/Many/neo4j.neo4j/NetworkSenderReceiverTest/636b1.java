diff --git a/enterprise/cluster/src/test/java/org/neo4j/cluster/com/message/NetworkSenderReceiverTest.java b/enterprise/cluster/src/test/java/org/neo4j/cluster/com/message/NetworkSenderReceiverTest.java
index a2875ac..531eb6a 100644
--- a/enterprise/cluster/src/test/java/org/neo4j/cluster/com/message/NetworkSenderReceiverTest.java
+++ b/enterprise/cluster/src/test/java/org/neo4j/cluster/com/message/NetworkSenderReceiverTest.java
@@ -124,7 +124,7 @@
                     sem.release();
                     return null;
                 }
-            } ).when( loggerMock ).warn( anyString(), any( Exception.class ) );
+            } ).when( loggerMock ).warn( anyString() );
 
             receiver = new NetworkReceiver( new NetworkReceiver.Configuration()
             {
