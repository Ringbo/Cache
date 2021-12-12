diff --git a/src/org/pentaho/di/trans/steps/orabulkloader/OraBulkLoader.java b/src/org/pentaho/di/trans/steps/orabulkloader/OraBulkLoader.java
index ac7184c..2949848 100644
--- a/src/org/pentaho/di/trans/steps/orabulkloader/OraBulkLoader.java
+++ b/src/org/pentaho/di/trans/steps/orabulkloader/OraBulkLoader.java
@@ -201,11 +201,11 @@
 			    case ValueMetaInterface.TYPE_BIGNUMBER:
 			    	break;
 			    case ValueMetaInterface.TYPE_DATE:			    	
-			    	if ( OraBulkLoaderMeta.DATE_MASK_DATE.equals(dateMask[pos]) )
+			    	if ( OraBulkLoaderMeta.DATE_MASK_DATE.equals(dateMask[i]) )
 			    	{
 			    	    contents.append(" DATE 'yyyy-mm-dd'");	
 			    	}
-			    	else if ( OraBulkLoaderMeta.DATE_MASK_DATETIME.equals(dateMask[pos]) )
+			    	else if ( OraBulkLoaderMeta.DATE_MASK_DATETIME.equals(dateMask[i]) )
 			    	{
 			    		contents.append(" TIMESTAMP 'yyyy-mm-dd hh24:mi:ss.ff'");
 			    	}			    	
