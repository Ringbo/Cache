diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/LoadIndexedNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/LoadIndexedNode.java
index b368a47..f7b4844 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/LoadIndexedNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/LoadIndexedNode.java
@@ -53,7 +53,7 @@
     private static Stamp createStamp(ValueNode array, Kind kind) {
         ResolvedJavaType type = StampTool.typeOrNull(array);
         if (kind == Kind.Object && type != null) {
-            return StampFactory.declared(type.getComponentType());
+            return StampFactory.declaredTrusted(type.getComponentType());
         } else {
             return StampFactory.forKind(kind);
         }
