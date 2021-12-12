diff --git a/engine/src/org/pentaho/di/trans/steps/joinrows/JoinRows.java b/engine/src/org/pentaho/di/trans/steps/joinrows/JoinRows.java
index cde6ab4..8182a13 100644
--- a/engine/src/org/pentaho/di/trans/steps/joinrows/JoinRows.java
+++ b/engine/src/org/pentaho/di/trans/steps/joinrows/JoinRows.java
@@ -2,7 +2,7 @@
  *
  * Pentaho Data Integration
  *
- * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
+ * Copyright (C) 2002-2017 by Pentaho : http://www.pentaho.com
  *
  *******************************************************************************
  *
@@ -157,7 +157,7 @@
 
       if ( log.isRowLevel() ) {
         logRowlevel( BaseMessages.getString( PKG, "JoinRows.Log.ReadRowFromStream" )
-          + ( rowData == null ? "<null>" : rowData.toString() ) );
+          + ( rowData == null ? "<null>" : data.fileRowMeta[0].getString( rowData ) ) );
       }
     } else {
       if ( data.cache[filenr] == null ) {
@@ -392,7 +392,8 @@
       data.size[data.filenr]++;
 
       if ( log.isRowLevel() ) {
-        logRowlevel( rowData.toString() );
+        logRowlevel( BaseMessages.getString( PKG, "JoinRows.Log.ReadRowFromStreamN", data.filenr,
+          data.fileRowMeta[data.filenr].getString( rowData ) ) );
       }
 
       //
@@ -438,7 +439,7 @@
   private RowMetaInterface createOutputRowMeta( RowMetaInterface[] fileRowMeta ) {
     RowMetaInterface outputRowMeta = new RowMeta();
     for ( int i = 0; i < data.fileRowMeta.length; i++ ) {
-      outputRowMeta.mergeRowMeta( data.fileRowMeta[i] );
+      outputRowMeta.mergeRowMeta( data.fileRowMeta[i], meta.getName() );
     }
     return outputRowMeta;
   }
