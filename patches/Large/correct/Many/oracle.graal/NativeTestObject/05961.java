diff --git a/truffle/src/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/interop/NativeTestObject.java b/truffle/src/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/interop/NativeTestObject.java
index b3c55c3..2630eb2 100644
--- a/truffle/src/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/interop/NativeTestObject.java
+++ b/truffle/src/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/interop/NativeTestObject.java
@@ -56,7 +56,7 @@
     }
 
     public static boolean isInstance(TruffleObject obj) {
-        return obj instanceof ManagedTestObject;
+        return obj instanceof NativeTestObject;
     }
 
     public ManagedTestObject getObject() {
