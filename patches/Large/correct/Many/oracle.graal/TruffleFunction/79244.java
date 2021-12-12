diff --git a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/TruffleFunction.java b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/TruffleFunction.java
index d2de457..0e4a94c 100644
--- a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/TruffleFunction.java
+++ b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/TruffleFunction.java
@@ -106,7 +106,7 @@
         @SuppressWarnings("unchecked")
         @Override
         protected Class<? extends TruffleObject> getReceiverType() {
-            return (Class<? extends TruffleObject>) returnClass;
+            return (Class<? extends TruffleObject>) receiverClass;
         }
 
         @Override
