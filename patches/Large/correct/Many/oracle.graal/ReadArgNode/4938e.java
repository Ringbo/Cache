diff --git a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ReadArgNode.java b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ReadArgNode.java
index def90a6..b61d312 100644
--- a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ReadArgNode.java
+++ b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ReadArgNode.java
@@ -31,7 +31,7 @@
 class ReadArgNode extends Node {
     private final int argIndex;
 
-    public ReadArgNode(int argIndex) {
+    ReadArgNode(int argIndex) {
         this.argIndex = argIndex;
     }
 
