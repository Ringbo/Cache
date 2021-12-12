diff --git a/engine/src/org/pentaho/di/trans/steps/tablecompare/TableCompare.java b/engine/src/org/pentaho/di/trans/steps/tablecompare/TableCompare.java
index 81b9e4f..a9a8441 100644
--- a/engine/src/org/pentaho/di/trans/steps/tablecompare/TableCompare.java
+++ b/engine/src/org/pentaho/di/trans/steps/tablecompare/TableCompare.java
@@ -442,7 +442,7 @@
 
             one = data.referenceDb.getRow( refSet );
             if ( one != null ) {
-              nrRecordsCompare++;
+              nrRecordsReference++;
             }
           } else {
             if ( one != null && two != null ) {
@@ -496,11 +496,11 @@
               } else {
                 if ( compare < 0 ) {
                   if ( getStepMeta().isDoingErrorHandling() ) {
-                    String keyDesc = getKeyDesc( keyRowMeta, keyNrs, two );
+                    String keyDesc = getKeyDesc( keyRowMeta, keyNrs, one );
                     Object[] errorRowData = constructErrorRow( rowMeta, r, keyDesc, null, null );
                     putError( data.errorRowMeta, errorRowData, 1, BaseMessages.getString(
                       PKG, "TableCompare.Error.RecordNotInReferenceFoundInCompareTable", cmpSchemaTable,
-                      keyRowMeta.getString( two ) ), null, "TAC004" );
+                      keyRowMeta.getString( one ) ), null, "TAC004" );
                   }
                   nrErrors++;
                   nrRightErrors++;
@@ -511,11 +511,11 @@
                   }
                 } else {
                   if ( getStepMeta().isDoingErrorHandling() ) {
-                    String keyDesc = getKeyDesc( keyRowMeta, keyNrs, one );
+                    String keyDesc = getKeyDesc( keyRowMeta, keyNrs, two );
                     Object[] errorRowData = constructErrorRow( rowMeta, r, keyDesc, null, null );
                     putError( data.errorRowMeta, errorRowData, 1, BaseMessages.getString(
                       PKG, "TableCompare.Error.RecordInReferenceNotFoundInCompareTable", refSchemaTable,
-                      keyRowMeta.getString( one ) ), null, "TAC005" );
+                      keyRowMeta.getString( two ) ), null, "TAC005" );
                   }
                   nrErrors++;
                   nrLeftErrors++;
