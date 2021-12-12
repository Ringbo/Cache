diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java
index 253cd41..b4cfd0d 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java
@@ -51,7 +51,7 @@
             if (read.location().locationIdentity() == LocationNode.FINAL_LOCATION && read.location().getClass() == LocationNode.class) {
                 Object value = read.object().asConstant().asObject();
                 long displacement = read.location().displacement();
-                Kind kind = read.location().kind();
+                Kind kind = read.location().getValueKind();
                 Constant constant = kind.readUnsafeConstant(value, displacement);
                 if (constant != null) {
                     return ConstantNode.forConstant(constant, runtime, read.node().graph());
