diff --git a/external/storm-jdbc/src/test/java/org/apache/storm/jdbc/topology/AbstractUserTopology.java b/external/storm-jdbc/src/test/java/org/apache/storm/jdbc/topology/AbstractUserTopology.java
index 700f83e..6d2f8e9 100644
--- a/external/storm-jdbc/src/test/java/org/apache/storm/jdbc/topology/AbstractUserTopology.java
+++ b/external/storm-jdbc/src/test/java/org/apache/storm/jdbc/topology/AbstractUserTopology.java
@@ -93,7 +93,7 @@
             cluster.shutdown();
             System.exit(0);
         } else {
-            StormSubmitter.submitTopology(args[5], config, getTopology());
+            StormSubmitter.submitTopology(args[4], config, getTopology());
         }
     }
 
