diff --git a/src/org/pentaho/di/trans/steps/luciddbbulkloader/LucidDBBulkLoader.java b/src/org/pentaho/di/trans/steps/luciddbbulkloader/LucidDBBulkLoader.java
index ecb15f6..6cca598 100644
--- a/src/org/pentaho/di/trans/steps/luciddbbulkloader/LucidDBBulkLoader.java
+++ b/src/org/pentaho/di/trans/steps/luciddbbulkloader/LucidDBBulkLoader.java
@@ -491,7 +491,7 @@
 			data.bufferIndex = 0;
 			
 			// Schema-table combination...
-			data.schemaTable = meta.getDatabaseMeta().getSchemaTableCombination(environmentSubstitute(meta.getSchemaName()), environmentSubstitute(meta.getTableName()));
+			data.schemaTable = meta.getDatabaseMeta().getQuotedSchemaTableCombination(environmentSubstitute(meta.getSchemaName()), environmentSubstitute(meta.getTableName()));
 			
 			return true;
 		}
