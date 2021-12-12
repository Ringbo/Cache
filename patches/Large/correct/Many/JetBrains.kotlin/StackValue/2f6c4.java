diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/StackValue.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/StackValue.java
index b482129..2042667 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/StackValue.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/StackValue.java
@@ -477,7 +477,7 @@
 
         Type resultType = KotlinTypeMapper.mapUnderlyingTypeOfInlineClassType(targetInlineClassType);
 
-        if (TypeUtils.isNullableType(targetInlineClassType) && !isPrimitive(type)) {
+        if (TypeUtils.isNullableType(targetInlineClassType) && !isPrimitive(resultType)) {
             boxOrUnboxWithNullCheck(v, vv -> invokeUnboxMethod(vv, owner, resultType));
         }
         else {
