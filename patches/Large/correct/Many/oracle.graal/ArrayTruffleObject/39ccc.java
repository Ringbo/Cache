diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/vm/ArrayTruffleObject.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/vm/ArrayTruffleObject.java
index 9a30171..d878146 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/vm/ArrayTruffleObject.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/vm/ArrayTruffleObject.java
@@ -100,10 +100,10 @@
 
     @Override
     public CallTarget accessInvoke(int argumentsLength) {
-        if (argumentsLength == 1) {
+        if (argumentsLength == 0) {
             return target(new DuplNode());
         }
-        if (argumentsLength == 2) {
+        if (argumentsLength == 1) {
             return target(new InvokeNode());
         }
         return null;
