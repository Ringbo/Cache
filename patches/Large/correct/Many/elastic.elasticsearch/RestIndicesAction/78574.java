diff --git a/core/src/main/java/org/elasticsearch/rest/action/cat/RestIndicesAction.java b/core/src/main/java/org/elasticsearch/rest/action/cat/RestIndicesAction.java
index eaf9ad4..38cbba6f 100644
--- a/core/src/main/java/org/elasticsearch/rest/action/cat/RestIndicesAction.java
+++ b/core/src/main/java/org/elasticsearch/rest/action/cat/RestIndicesAction.java
@@ -412,13 +412,13 @@
             table.addCell(indexStats == null ? null : indexStats.getPrimaries().getIndexing().getTotal().getIndexFailedCount());
 
             table.addCell(indexStats == null ? null : indexStats.getTotal().getMerge().getCurrent());
-            table.addCell(indexStats == null ? null : indexStats.getPrimaries().getMerge().getCurrentSize());
+            table.addCell(indexStats == null ? null : indexStats.getPrimaries().getMerge().getCurrent());
 
             table.addCell(indexStats == null ? null : indexStats.getTotal().getMerge().getCurrentNumDocs());
             table.addCell(indexStats == null ? null : indexStats.getPrimaries().getMerge().getCurrentNumDocs());
 
             table.addCell(indexStats == null ? null : indexStats.getTotal().getMerge().getCurrentSize());
-            table.addCell(indexStats == null ? null : indexStats.getPrimaries().getMerge().getCurrent());
+            table.addCell(indexStats == null ? null : indexStats.getPrimaries().getMerge().getCurrentSize());
 
             table.addCell(indexStats == null ? null : indexStats.getTotal().getMerge().getTotal());
             table.addCell(indexStats == null ? null : indexStats.getPrimaries().getMerge().getTotal());
