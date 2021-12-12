diff --git a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/WriteFieldNode.java b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/WriteFieldNode.java
index cf8572b..c972c86 100644
--- a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/WriteFieldNode.java
+++ b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/WriteFieldNode.java
@@ -32,7 +32,7 @@
 
 class WriteFieldNode extends RootNode {
 
-    public WriteFieldNode() {
+    WriteFieldNode() {
         super(JavaInteropLanguage.class, null, null);
     }
 
