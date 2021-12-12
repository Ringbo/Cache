diff --git a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java
index bebbd18..d039816 100644
--- a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java
+++ b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java
@@ -157,7 +157,7 @@
             } else if (targetType.isArray()) {
                 return primitive.hasKeys(tValue);
             } else {
-                if (TruffleOptions.AOT) {
+                if (!TruffleOptions.AOT) {
                     if (JavaInterop.isJavaFunctionInterface(targetType) && (isExecutable(tValue) || isInstantiable(tValue))) {
                         return true;
                     } else if (targetType.isInterface() && ForeignAccess.sendHasKeys(hasKeysNode, tValue)) {
@@ -166,7 +166,7 @@
                         return false;
                     }
                 } else {
-                    // support Function also without AOT
+                    // support Function also with AOT
                     if (targetType == Function.class) {
                         return isExecutable(tValue) || isInstantiable(tValue);
                     } else {
