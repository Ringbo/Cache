diff --git a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java
index 9b64100..7140d5f 100644
--- a/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java
+++ b/truffle/src/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/ToJavaNode.java
@@ -249,7 +249,7 @@
                 throw JavaInteropErrors.cannotConvert(languageContext, truffleObject, targetType, "Value must have members or array elements.");
             }
         } else if (targetType == Function.class) {
-            TypeAndClass<?> returnType = getGenericParameterType(genericType, 0);
+            TypeAndClass<?> returnType = getGenericParameterType(genericType, 1);
             if (isExecutable(truffleObject) || isInstantiable(truffleObject)) {
                 obj = TruffleFunction.create(languageContext, truffleObject, returnType.clazz, returnType.type);
             } else if (!TruffleOptions.AOT && ForeignAccess.sendHasKeys(hasKeysNode, truffleObject)) {
