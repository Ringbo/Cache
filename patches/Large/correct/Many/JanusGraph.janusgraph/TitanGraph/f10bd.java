diff --git a/janusgraph-core/src/main/java/org/janusgraph/core/TitanGraph.java b/janusgraph-core/src/main/java/org/janusgraph/core/TitanGraph.java
index ba9877c..4e62c57 100644
--- a/janusgraph-core/src/main/java/org/janusgraph/core/TitanGraph.java
+++ b/janusgraph-core/src/main/java/org/janusgraph/core/TitanGraph.java
@@ -38,7 +38,7 @@
         test = "org.apache.tinkerpop.gremlin.process.computer.GraphComputerTest",
         method = "shouldProcessResultGraphNewWithPersistVertexProperties",
         reason = "The result graph should return an empty iterator when vertex.edges() or vertex.vertices() is called.")
-public interface TitanGraph extends TitanGraphTransaction {
+public interface TitanGraph extends Transaction {
 
    /* ---------------------------------------------------------------
     * Transactions and general admin
