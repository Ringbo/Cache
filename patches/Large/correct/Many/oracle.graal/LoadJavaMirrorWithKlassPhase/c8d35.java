diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/LoadJavaMirrorWithKlassPhase.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/LoadJavaMirrorWithKlassPhase.java
index 06c7b0d..e2016db 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/LoadJavaMirrorWithKlassPhase.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/LoadJavaMirrorWithKlassPhase.java
@@ -61,7 +61,7 @@
 
                 Stamp stamp = StampFactory.exactNonNull(runtime.lookupJavaType(Class.class));
                 LocationNode location = graph.unique(ConstantLocationNode.create(FINAL_LOCATION, stamp.kind(), runtime.config.classMirrorOffset, graph));
-                FloatingReadNode freadNode = graph.add(new FloatingReadNode(klassNode, location, null, stamp));
+                FloatingReadNode freadNode = graph.unique(new FloatingReadNode(klassNode, location, null, stamp));
 
                 graph.replaceFloating(node, freadNode);
             }
