diff --git a/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/test/java/org/deeplearning4j/ui/stats/TestStatsListener.java b/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/test/java/org/deeplearning4j/ui/stats/TestStatsListener.java
index 3c1080a..f5d98bb 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/test/java/org/deeplearning4j/ui/stats/TestStatsListener.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/test/java/org/deeplearning4j/ui/stats/TestStatsListener.java
@@ -44,9 +44,9 @@
             StatsStorage ss = new MapDBStatsStorage(); //in-memory
 
             if (useJ7) {
-                net.setListeners(new J7StatsListener(ss));
+                net.setListeners(new J7StatsListener(ss, 1));
             } else {
-                net.setListeners(new StatsListener(ss));
+                net.setListeners(new StatsListener(ss, 1));
             }
 
 
