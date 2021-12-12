diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/CheckCastNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/CheckCastNode.java
index 3d4dfa4..66318e3 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/CheckCastNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/java/CheckCastNode.java
@@ -71,7 +71,7 @@
         }
         if (assumptions != null) {
             ResolvedJavaType uniqueConcreteType = type.findUniqueConcreteSubtype();
-            if (uniqueConcreteType != null) {
+            if (uniqueConcreteType != null && !uniqueConcreteType.equals(type)) {
                 assumptions.recordConcreteSubtype(type, uniqueConcreteType);
                 type = uniqueConcreteType;
             }
