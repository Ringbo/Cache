diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
index 6f4c1f2..75512d4 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
@@ -879,12 +879,10 @@
 			{
 				debug = "normal : data and footer";
 				/* IF we are done reading and we have a footer
-				   AND the number of lines in the buffer is smaller or equal to
-				   the number of footer lines
-				   THEN we can remove the remaining rows from the buffer: they
-				   are all footer rows.
+				   AND the number of lines in the buffer is smaller then the number of footer lines
+				   THEN we can remove the remaining rows from the buffer: they are all footer rows.
 				 */
-				if (data.doneReading && meta.hasFooter() && data.lineBuffer.size() <= meta.getNrFooterLines())
+				if (data.doneReading && meta.hasFooter() && data.lineBuffer.size() < meta.getNrFooterLines())
 				{
 					debug = "normal : footer";
 					data.lineBuffer.clear();
