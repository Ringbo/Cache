diff --git a/src/be/ibridge/kettle/trans/step/BaseStep.java b/src/be/ibridge/kettle/trans/step/BaseStep.java
index 0651215..d67c2e1 100644
--- a/src/be/ibridge/kettle/trans/step/BaseStep.java
+++ b/src/be/ibridge/kettle/trans/step/BaseStep.java
@@ -926,7 +926,7 @@
 		return row;
 	}
 
-	private void safeModeChecking(Row row)
+	private synchronized void safeModeChecking(Row row)
 	{
 		//String saveDebug=debug;
 		//debug="Safe mode checking";
