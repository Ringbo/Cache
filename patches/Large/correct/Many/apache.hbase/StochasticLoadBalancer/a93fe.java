diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java
index cbc1a37..7a93c6e 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java
@@ -389,7 +389,7 @@
             + "maxSteps:{}. Hence load balancing may not work well. Setting parameter "
             + "\"hbase.master.balancer.stochastic.runMaxSteps\" to true can overcome this issue."
             + "(This config change does not require service restart)", calculatedMaxSteps,
-            maxRunningTime);
+            maxSteps);
       }
     }
     LOG.info("start StochasticLoadBalancer.balancer, initCost=" + currentCost + ", functionCost="
