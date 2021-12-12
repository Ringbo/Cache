diff --git a/test/unit/voldemort/client/rebalance/AbstractRebalanceTest.java b/test/unit/voldemort/client/rebalance/AbstractRebalanceTest.java
index 003a115..d97e1c6 100644
--- a/test/unit/voldemort/client/rebalance/AbstractRebalanceTest.java
+++ b/test/unit/voldemort/client/rebalance/AbstractRebalanceTest.java
@@ -295,7 +295,7 @@
             public void run() {
                 try {
 
-                    Thread.sleep(100);
+                    Thread.sleep(500);
 
                     RebalanceController rebalanceClient = new RebalanceController(getBootstrapUrl(currentCluster,
                                                                                                   0),
@@ -305,8 +305,7 @@
                                       rebalanceClient,
                                       Arrays.asList(1));
 
-                    // sleep for 1 mins before stopping servers
-                    Thread.sleep(60 * 1000);
+                    Thread.sleep(500);
 
                     rebalancingToken.set(true);
 
@@ -412,7 +411,7 @@
             public void run() {
                 try {
 
-                    Thread.sleep(100);
+                    Thread.sleep(500);
 
                     RebalanceController rebalanceClient = new RebalanceController(getBootstrapUrl(currentCluster,
                                                                                                   0),
@@ -422,8 +421,7 @@
                                       rebalanceClient,
                                       Arrays.asList(1));
 
-                    // sleep for 1 mins before stopping servers
-                    Thread.sleep(60 * 1000);
+                    Thread.sleep(500);
 
                     rebalancingToken.set(true);
 
