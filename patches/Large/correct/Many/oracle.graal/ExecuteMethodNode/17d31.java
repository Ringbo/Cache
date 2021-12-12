diff --git a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ExecuteMethodNode.java b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ExecuteMethodNode.java
index 4c87c98..7edcdff 100644
--- a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ExecuteMethodNode.java
+++ b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ExecuteMethodNode.java
@@ -510,7 +510,7 @@
         try {
             ret = method.invoke(obj, arguments);
         } catch (IllegalArgumentException ex) {
-            throw UnsupportedTypeException.raise(arguments);
+            throw UnsupportedTypeException.raise(ex, arguments);
         } catch (RuntimeException | Error ex) {
             CompilerDirectives.transferToInterpreter();
             throw ex;
