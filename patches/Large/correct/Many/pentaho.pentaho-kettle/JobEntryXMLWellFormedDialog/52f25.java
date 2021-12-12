diff --git a/ui/src/org/pentaho/di/ui/job/entries/xmlwellformed/JobEntryXMLWellFormedDialog.java b/ui/src/org/pentaho/di/ui/job/entries/xmlwellformed/JobEntryXMLWellFormedDialog.java
index 648775a..b5dff76 100644
--- a/ui/src/org/pentaho/di/ui/job/entries/xmlwellformed/JobEntryXMLWellFormedDialog.java
+++ b/ui/src/org/pentaho/di/ui/job/entries/xmlwellformed/JobEntryXMLWellFormedDialog.java
@@ -769,7 +769,7 @@
         }
 
         if ( jobEntry.wildcard[i] != null ) {
-          ti.setText( 3, jobEntry.wildcard[i] );
+          ti.setText( 2, jobEntry.wildcard[i] );
         }
       }
       wFields.setRowNums();
