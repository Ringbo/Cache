diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/ri/HotSpotRuntime.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/ri/HotSpotRuntime.java
index 330f1c4..a291da9 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/ri/HotSpotRuntime.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/ri/HotSpotRuntime.java
@@ -387,7 +387,7 @@
                 SafeReadNode klassOop = safeRead(graph, CiKind.Object, receiver, config.klassOopOffset, StampFactory.objectNonNull(), StructuredGraph.INVALID_GRAPH_ID);
                 graph.start().setNext(klassOop);
                 // TODO(thomaswue): Care about primitive classes! Crashes for primitive classes at the moment (klassOop == null)
-                ReadNode result = graph.add(new ReadNode(klassOop, LocationNode.create(LocationNode.FINAL_LOCATION, CiKind.Int, config.klassModifierFlagsOffset, graph), StampFactory.forKind(CiKind.Int)));
+                FloatingReadNode result = graph.add(new FloatingReadNode(klassOop, null, LocationNode.create(LocationNode.FINAL_LOCATION, CiKind.Int, config.klassModifierFlagsOffset, graph), StampFactory.forKind(CiKind.Int)));
                 ReturnNode ret = graph.add(new ReturnNode(result));
                 klassOop.setNext(ret);
                 return graph;
