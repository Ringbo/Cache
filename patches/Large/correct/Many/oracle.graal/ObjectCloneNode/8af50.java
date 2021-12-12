diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ObjectCloneNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ObjectCloneNode.java
index 0777ced..8de04cc 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ObjectCloneNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ObjectCloneNode.java
@@ -80,7 +80,7 @@
                 type = getConcreteType(getObject().stamp(), tool.assumptions(), tool.getMetaAccess());
                 if (type != null) {
                     StructuredGraph newGraph = new StructuredGraph();
-                    LocalNode local = newGraph.add(new LocalNode(0, getObject().stamp()));
+                    LocalNode local = newGraph.unique(new LocalNode(0, getObject().stamp()));
                     NewInstanceNode newInstance = newGraph.add(new NewInstanceNode(type, true));
                     newGraph.addAfterFixed(newGraph.start(), newInstance);
                     ReturnNode returnNode = newGraph.add(new ReturnNode(newInstance));
