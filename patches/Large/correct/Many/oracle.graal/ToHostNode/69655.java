diff --git a/truffle/src/com.oracle.truffle.polyglot/src/com/oracle/truffle/polyglot/ToHostNode.java b/truffle/src/com.oracle.truffle.polyglot/src/com/oracle/truffle/polyglot/ToHostNode.java
index 1dfbf02..b3932ca 100644
--- a/truffle/src/com.oracle.truffle.polyglot/src/com/oracle/truffle/polyglot/ToHostNode.java
+++ b/truffle/src/com.oracle.truffle.polyglot/src/com/oracle/truffle/polyglot/ToHostNode.java
@@ -448,7 +448,7 @@
     }
 
     @TruffleBoundary
-    private static Boolean parseBooleanOrNull(String s) {
+    private static Object parseBooleanOrNull(String s) {
         if ("true".equals(s)) {
             return Boolean.TRUE;
         } else if ("false".equals(s)) {
