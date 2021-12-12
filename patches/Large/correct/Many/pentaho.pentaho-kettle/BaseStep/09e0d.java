diff --git a/experimental/org/pentaho/di/trans/step/BaseStep.java b/experimental/org/pentaho/di/trans/step/BaseStep.java
index ce0f19b..6f2a406 100644
--- a/experimental/org/pentaho/di/trans/step/BaseStep.java
+++ b/experimental/org/pentaho/di/trans/step/BaseStep.java
@@ -1217,14 +1217,14 @@
      * This version of getRow() only takes data from certain rowsets We select these rowsets that have name = step
      * Otherwise it's the same as the other one.
      */
-    public synchronized RowMetaAndData getRowFrom(String from)
+    public synchronized RowMetaAndData getRowFrom(String from) throws KettleException
     {
         output_rowset_nr = findInputRowSetNumber(from, 0, stepname, 0);
         
         if (output_rowset_nr < 0) 
         {
             // No rowset found: normally it can't happen: we deleted the rowset because it was finished
-            return null; 
+        	throw new KettleException("Couldn't find hop '" + from + "' to read from"); 
         }
 
         return getRowFrom(output_rowset_nr);
