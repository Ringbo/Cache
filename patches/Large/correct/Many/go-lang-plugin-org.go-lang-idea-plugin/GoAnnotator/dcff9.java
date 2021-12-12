diff --git a/src/com/goide/highlighting/GoAnnotator.java b/src/com/goide/highlighting/GoAnnotator.java
index 509eab7..7ae36f0 100644
--- a/src/com/goide/highlighting/GoAnnotator.java
+++ b/src/com/goide/highlighting/GoAnnotator.java
@@ -36,7 +36,8 @@
 
 public class GoAnnotator implements Annotator {
   private static final Set<String> INT_TYPE_NAMES = Sets.newHashSet(
-    "int", "int8", "int16", "int32", "int64", "uint", "uint8", "uint16", "uint32", "uint64", "uintptr"
+    "int", "int8", "int16", "int32", "int64", "uint", "uint8", "uint16", "uint32", "uint64", "uintptr",
+    "rune", "float32", "float64"
   ); // todo: unify with DlvApi.Variable.Kind
 
   @Override
@@ -174,7 +175,7 @@
       GoType type = expression.getGoType(null); // todo: context
       if (type != null) {
         GoType expressionBaseType = getBaseType(type);
-        if (!(isIntegerType(expressionBaseType) || isCType(type))) {
+        if (!(isIntegerConvertibleType(expressionBaseType) || isCType(type))) {
           String argName = i == 0 ? "size" : "capacity";
           holder.createErrorAnnotation(expression, "Non-integer " + argName + " argument to make");
         }
@@ -197,7 +198,7 @@
     return type instanceof GoCType;
   }
 
-  private static boolean isIntegerType(@Nullable GoType type) {
+  private static boolean isIntegerConvertibleType(@Nullable GoType type) {
     if (type == null) return false;
     GoTypeReferenceExpression ref = type.getTypeReferenceExpression();
     if (ref == null) return false;
