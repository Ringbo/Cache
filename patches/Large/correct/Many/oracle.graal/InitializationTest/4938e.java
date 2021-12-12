diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/InitializationTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/InitializationTest.java
index dd75849..249b011 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/InitializationTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/InitializationTest.java
@@ -128,7 +128,7 @@
     private static class ANode extends Node {
         private final int constant;
 
-        public ANode(int constant) {
+        ANode(int constant) {
             this.constant = constant;
         }
 
