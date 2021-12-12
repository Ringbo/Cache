diff --git a/janusgraph-test/src/main/java/org/janusgraph/graphdb/TitanGraphBaseTest.java b/janusgraph-test/src/main/java/org/janusgraph/graphdb/TitanGraphBaseTest.java
index 916e289..22bd76b 100644
--- a/janusgraph-test/src/main/java/org/janusgraph/graphdb/TitanGraphBaseTest.java
+++ b/janusgraph-test/src/main/java/org/janusgraph/graphdb/TitanGraphBaseTest.java
@@ -383,16 +383,16 @@
 //        return result;
 //    }
 
-    public static void assertMissing(TitanGraphTransaction g, Object vid) {
+    public static void assertMissing(Transaction g, Object vid) {
         assertFalse(g.vertices(vid).hasNext());
     }
 
-    public static TitanVertex getV(TitanGraphTransaction g, Object vid) {
+    public static TitanVertex getV(Transaction g, Object vid) {
         if (!g.vertices(vid).hasNext()) return null;
         return (TitanVertex)g.vertices(vid).next();
     }
 
-    public static TitanEdge getE(TitanGraphTransaction g, Object eid) {
+    public static TitanEdge getE(Transaction g, Object eid) {
         if (!g.edges(eid).hasNext()) return null;
         return (TitanEdge)g.edges(eid).next();
     }
