diff --git a/src/org/pentaho/di/trans/step/BaseStep.java b/src/org/pentaho/di/trans/step/BaseStep.java
index 72dd56d..c73ab5d 100644
--- a/src/org/pentaho/di/trans/step/BaseStep.java
+++ b/src/org/pentaho/di/trans/step/BaseStep.java
@@ -1204,9 +1204,9 @@
 	    // The buffer to grow beyond "a few" entries.
 	    // We'll only do that if the previous step has not ended...
 	    //
-        while (isUsingThreadPriorityManagment() && !inputRowSet.isDone() && inputRowSet.size()<= ( transMeta.getSizeRowset()>>6 ) && !isStopped())
+        if (isUsingThreadPriorityManagment() && !inputRowSet.isDone() && inputRowSet.size()<= ( transMeta.getSizeRowset()>>6 ) && !isStopped())
         {
-        	try { Thread.sleep(0,10); } catch (InterruptedException e) { }
+        	try { Thread.sleep(0,1); } catch (InterruptedException e) { }
         }
     
 
