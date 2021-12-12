diff --git a/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/GenericObjectAccessNode.java b/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/GenericObjectAccessNode.java
index 059b899..0022dc0 100644
--- a/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/GenericObjectAccessNode.java
+++ b/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/GenericObjectAccessNode.java
@@ -37,12 +37,12 @@
 
     @Child private ForeignAccessArguments accessArguments = new ForeignAccessArguments();
 
-    public GenericObjectAccessNode(Message access) {
+    GenericObjectAccessNode(Message access) {
         this.access = access;
         indirectCallNode = Truffle.getRuntime().createIndirectCallNode();
     }
 
-    public GenericObjectAccessNode(GenericObjectAccessNode prev) {
+    GenericObjectAccessNode(GenericObjectAccessNode prev) {
         this(prev.access);
     }
 
