diff --git a/src/org/pentaho/di/spoon/job/JobGraph.java b/src/org/pentaho/di/spoon/job/JobGraph.java
index 569ddd4..0af0d5f 100644
--- a/src/org/pentaho/di/spoon/job/JobGraph.java
+++ b/src/org/pentaho/di/spoon/job/JobGraph.java
@@ -2209,7 +2209,7 @@
         return !jobMeta.hasChanged();
     }
 
-    public Object getManagedObject()
+    public JobMeta getManagedObject()
     {
         return jobMeta;
     }
