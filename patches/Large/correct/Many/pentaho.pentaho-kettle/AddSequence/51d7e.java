diff --git a/src/be/ibridge/kettle/trans/step/addsequence/AddSequence.java b/src/be/ibridge/kettle/trans/step/addsequence/AddSequence.java
index 48d1c9e..8f4253c 100644
--- a/src/be/ibridge/kettle/trans/step/addsequence/AddSequence.java
+++ b/src/be/ibridge/kettle/trans/step/addsequence/AddSequence.java
@@ -49,8 +49,7 @@
 		super(stepMeta, stepDataInterface, copyNr, transMeta, trans);
 	}
 	
-	public synchronized boolean addSequence(Row row)
-		throws KettleException
+	public boolean addSequence(Row row) throws KettleException
 	{
 		Value next = null;
 		
