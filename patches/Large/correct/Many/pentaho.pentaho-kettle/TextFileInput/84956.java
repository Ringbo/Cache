diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
index acd799d..c33190a 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
@@ -969,7 +969,7 @@
 			if (log.isRowLevel()) logRowlevel("Putting row: " + r.toString());
 			putRow(r);
 
-			if ( linesInput > meta.getRowLimit() )
+			if ( linesInput > meta.getRowLimit() && meta.getRowLimit() >0 )
 			{
 			    closeLastFile();
 			    setOutputDone(); // signal end to receiver(s)
