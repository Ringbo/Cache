diff --git a/sql/src/main/java/io/crate/operation/projectors/FetchProjector.java b/sql/src/main/java/io/crate/operation/projectors/FetchProjector.java
index 2bed084..f8e3e14 100644
--- a/sql/src/main/java/io/crate/operation/projectors/FetchProjector.java
+++ b/sql/src/main/java/io/crate/operation/projectors/FetchProjector.java
@@ -261,7 +261,7 @@
         request.executionNodeId(executionNodeId);
         request.toFetchReferences(toFetchReferences);
         request.jobSearchContextDocIds(nodeBucket.docIds());
-        if (bulkSize > NO_BULK_REQUESTS) {
+        if (bulkSize > NO_BULK_REQUESTS && remainingUpstreams.get() > 0) {
             request.closeContext(false);
         }
         transportFetchNodeAction.execute(nodeBucket.nodeId, request, new ActionListener<NodeFetchResponse>() {
