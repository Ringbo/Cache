diff --git a/src/components/org/apache/jmeter/visualizers/backend/UserMetric.java b/src/components/org/apache/jmeter/visualizers/backend/UserMetric.java
index 1ea3d74..953c470 100644
--- a/src/components/org/apache/jmeter/visualizers/backend/UserMetric.java
+++ b/src/components/org/apache/jmeter/visualizers/backend/UserMetric.java
@@ -58,7 +58,7 @@
      *          using a sliding window of SLIDING_WINDOW_SIZE
      */
     public int getMaxActiveThreads() {
-        return (int) usersStats.getMin();
+        return (int) usersStats.getMax();
     }
 
     /**
@@ -74,7 +74,7 @@
      *          using a sliding window of SLIDING_WINDOW_SIZE
      */
     public int getMinActiveThreads() {
-        return (int) usersStats.getMax();
+        return (int) usersStats.getMin();
     }
 
     /**
