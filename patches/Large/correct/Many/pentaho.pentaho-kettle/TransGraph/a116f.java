diff --git a/src/org/pentaho/di/spoon/trans/TransGraph.java b/src/org/pentaho/di/spoon/trans/TransGraph.java
index 071b178..727ada1 100644
--- a/src/org/pentaho/di/spoon/trans/TransGraph.java
+++ b/src/org/pentaho/di/spoon/trans/TransGraph.java
@@ -2189,7 +2189,7 @@
         return !transMeta.hasChanged();
     }
     
-    public Object getManagedObject()
+    public TransMeta getManagedObject()
     {
         return transMeta;
     }
