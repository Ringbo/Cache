diff --git a/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java b/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java
index 71795d2..417a305 100644
--- a/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java
+++ b/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java
@@ -482,7 +482,7 @@
             if (sendToErrorRow)
             {
                 putError(rowMeta, r, 1, errorMessage, null, "TOP001");
-                insertRowData=null;
+                outputRowData=null;
             }
         }
         
