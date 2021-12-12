diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotRuntime.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotRuntime.java
index 788aab5..5f135c0 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotRuntime.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotRuntime.java
@@ -861,7 +861,7 @@
                         !(load.object().objectStamp().type().isArray())) {
             IndexedLocationNode location = IndexedLocationNode.create(ANY_LOCATION, load.accessKind(), load.displacement(), load.offset(), graph, 1);
             // Calculate offset+displacement
-            IntegerAddNode addNode = graph.add(new IntegerAddNode(Kind.Long, load.offset(), ConstantNode.forInt(load.displacement(), graph)));
+            IntegerAddNode addNode = graph.add(new IntegerAddNode(Kind.Long, load.offset(), ConstantNode.forLong(load.displacement(), graph)));
             // Compare previous result with referent offset (16)
             CompareNode offsetCondition = CompareNode.createCompareNode(Condition.EQ, addNode, ConstantNode.forLong(referentOffset(), graph));
             // Instance of unsafe load is java.lang.ref.Reference
