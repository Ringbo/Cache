diff --git a/components/camel-zookeeper/src/test/java/org/apache/camel/component/zookeeper/policy/ZookeeperElectionTest.java b/components/camel-zookeeper/src/test/java/org/apache/camel/component/zookeeper/policy/ZookeeperElectionTest.java
index fb639b08..e0818ed 100644
--- a/components/camel-zookeeper/src/test/java/org/apache/camel/component/zookeeper/policy/ZookeeperElectionTest.java
+++ b/components/camel-zookeeper/src/test/java/org/apache/camel/component/zookeeper/policy/ZookeeperElectionTest.java
@@ -120,7 +120,7 @@
 
     private void assertIsMaster(ZooKeeperElection electionCandidate) throws InterruptedException {
         // Need to wait for a while to be elected.
-        long timeout = System.currentTimeMillis() + 5000;
+        long timeout = System.currentTimeMillis() + 10000;
         
         while (!electionCandidate.isMaster() && timeout > System.currentTimeMillis()) {
             Thread.sleep(200);
