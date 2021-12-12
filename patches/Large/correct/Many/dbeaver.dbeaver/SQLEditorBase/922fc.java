diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
index dafddc5..dbf1709 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
@@ -435,7 +435,7 @@
             partitioner.connect(document);
             try {
                 document.setDocumentPartitioner(SQLPartitionScanner.SQL_PARTITIONING, partitioner);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 log.warn("Error setting SQL partitioner", e); //$NON-NLS-1$
             }
 
