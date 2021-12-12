diff --git a/src/org/pentaho/di/trans/step/BaseStep.java b/src/org/pentaho/di/trans/step/BaseStep.java
index 144dc88..b62d0a1 100644
--- a/src/org/pentaho/di/trans/step/BaseStep.java
+++ b/src/org/pentaho/di/trans/step/BaseStep.java
@@ -1085,7 +1085,7 @@
         }
         
         Object[] errorRowData = RowDataUtil.allocateRowData(errorRowMeta.size());
-        System.arraycopy(row, 0, errorRowData, 0, errorRowMeta.size());
+        System.arraycopy(row, 0, errorRowData, 0, rowMeta.size());
         
         // Also add the error fields...
         stepErrorMeta.addErrorRowData(errorRowData, rowMeta.size(), nrErrors, errorDescriptions, fieldNames, errorCodes);
