diff --git a/janusgraph-core/src/main/java/org/janusgraph/graphdb/transaction/StandardJanusGraphTx.java b/janusgraph-core/src/main/java/org/janusgraph/graphdb/transaction/StandardJanusGraphTx.java
index 4a967e8..7257007 100644
--- a/janusgraph-core/src/main/java/org/janusgraph/graphdb/transaction/StandardJanusGraphTx.java
+++ b/janusgraph-core/src/main/java/org/janusgraph/graphdb/transaction/StandardJanusGraphTx.java
@@ -181,7 +181,7 @@
     /**
      * Whether or not this transaction is open
      */
-    private boolean isOpen;
+    private volatile boolean isOpen;
 
     private final VertexConstructor existingVertexRetriever;
     private final VertexConstructor externalVertexRetriever;
