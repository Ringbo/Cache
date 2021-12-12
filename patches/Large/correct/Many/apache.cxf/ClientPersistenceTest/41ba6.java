diff --git a/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/ClientPersistenceTest.java b/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/ClientPersistenceTest.java
index 25229af..45543c1 100644
--- a/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/ClientPersistenceTest.java
+++ b/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/ClientPersistenceTest.java
@@ -258,7 +258,10 @@
         mf.verifyMessageNumbers(new String[] {"5"}, true);
         mf.verifyAcknowledgements(new boolean[1], true);
 
-        mf.verifyMessages(2, false);
+        // need in-exact as it COULD be 3 acks on a slow machine
+        //normally it will ack 1,3,5 and then 1-5, but on a slow machine,
+        //I've seen 1,3,5, then 1-3,5, and then 1-5
+        mf.verifyMessages(2, false, false);
 
         // we can't reliably predict how the three remaining messages are acknowledged
 //        expectedActions = new String[] {RM10Constants.SEQUENCE_ACKNOWLEDGMENT_ACTION,
