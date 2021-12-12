diff --git a/src/javatest/com/cloudera/flume/agent/TestFlumeNode.java b/src/javatest/com/cloudera/flume/agent/TestFlumeNode.java
index 2e07af7..f853734 100644
--- a/src/javatest/com/cloudera/flume/agent/TestFlumeNode.java
+++ b/src/javatest/com/cloudera/flume/agent/TestFlumeNode.java
@@ -220,6 +220,11 @@
     }
   }
 
+  /**
+   * This test starts a node, then starts a master, and waits until a node shows
+   * up. Then it closes, down and does so again, demonstrating that a node will
+   * reconnect
+   */
   public void testFlumeNodeReconnect() throws TTransportException, IOException,
       InterruptedException {
 
@@ -241,7 +246,7 @@
     assertEquals(0, fm.getKnownNodes().size());
     fm.serve();
     LOG.info("flume master 1 open ");
-    while (fm.getKnownNodes().size() > 0) {
+    while (fm.getKnownNodes().size() == 0) {
       Clock.sleep(1000);
     }
     fm.shutdown();
@@ -253,7 +258,7 @@
     assertEquals(0, fm2.getKnownNodes().size());
     fm2.serve();
     LOG.info("flume master 2 open ");
-    while (fm2.getKnownNodes().size() > 0) {
+    while (fm2.getKnownNodes().size() == 0) {
       Clock.sleep(1000);
     }
     fm2.shutdown();
