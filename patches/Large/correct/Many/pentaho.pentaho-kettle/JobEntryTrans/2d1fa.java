diff --git a/src/be/ibridge/kettle/job/entry/trans/JobEntryTrans.java b/src/be/ibridge/kettle/job/entry/trans/JobEntryTrans.java
index 992f881..1d7fbb2 100644
--- a/src/be/ibridge/kettle/job/entry/trans/JobEntryTrans.java
+++ b/src/be/ibridge/kettle/job/entry/trans/JobEntryTrans.java
@@ -444,13 +444,13 @@
     			}
     			else
     			{
-    				while (!trans.isFinished() && !parentJob.isStopped())
+    				while (!trans.isFinished() && !parentJob.isStopped() && trans.getErrors() == 0)
     				{
     					try { Thread.sleep(100);}
     					catch(InterruptedException e) { }
     				}
     				
-    				if (parentJob.isStopped())
+    				if (parentJob.isStopped() || trans.getErrors() != 0)
     				{
     					trans.stopAll();
     					trans.waitUntilFinished();
