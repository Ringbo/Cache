diff --git a/janusgraph-test/src/main/java/org/janusgraph/olap/OLAPTest.java b/janusgraph-test/src/main/java/org/janusgraph/olap/OLAPTest.java
index 645f7f4..8331d1f 100644
--- a/janusgraph-test/src/main/java/org/janusgraph/olap/OLAPTest.java
+++ b/janusgraph-test/src/main/java/org/janusgraph/olap/OLAPTest.java
@@ -254,9 +254,9 @@
             System.out.println("Execution time (ms) ["+numV+"|"+numE+"]: " + result.memory().getRuntime());
             assertEquals(2,result.memory().getIteration());
 
-            TitanGraphTransaction gview = null;
+            Transaction gview = null;
             switch (mode) {
-                case LOCALTX: gview = (TitanGraphTransaction) result.graph(); break;
+                case LOCALTX: gview = (Transaction) result.graph(); break;
                 case PERSIST: newTx(); gview = tx; break;
                 case NONE: break;
                 default: throw new AssertionError(mode);
