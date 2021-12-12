diff --git a/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java b/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java
index 7ef4e42..c41ef6b 100644
--- a/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java
+++ b/src/org/pentaho/di/trans/steps/tableoutput/TableOutput.java
@@ -307,7 +307,7 @@
             }
             else
             {
-                data.batchBuffer.add(r);
+                data.batchBuffer.add(outputRowData);
                 outputRowData=null;
                 
                 if (rowIsSafe) // A commit was done and the rows are all safe (no error)
