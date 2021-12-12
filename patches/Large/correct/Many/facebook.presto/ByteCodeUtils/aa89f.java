diff --git a/presto-main/src/main/java/com/facebook/presto/sql/gen/ByteCodeUtils.java b/presto-main/src/main/java/com/facebook/presto/sql/gen/ByteCodeUtils.java
index ef3d186..f8f1023 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/gen/ByteCodeUtils.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/gen/ByteCodeUtils.java
@@ -44,7 +44,7 @@
 import static com.facebook.presto.sql.gen.Bootstrap.CALL_SITES_FIELD_NAME;
 import static java.lang.String.format;
 
-public class ByteCodeUtils
+public final class ByteCodeUtils
 {
     private ByteCodeUtils()
     {
@@ -68,7 +68,7 @@
     public static ByteCodeNode handleNullValue(CompilerContext context,
             LabelNode label,
             Class<?> returnType,
-            List<? extends Class<?>> stackArgsToPop,
+            List<Class<?>> stackArgsToPop,
             boolean clearNullFlag)
     {
         Block nullCheck = new Block(context)
@@ -165,7 +165,7 @@
         Block block = new Block(context)
                 .setDescription("invoke " + signature);
 
-        ArrayList<Class<?>> stackTypes = new ArrayList<>();
+        List<Class<?>> stackTypes = new ArrayList<>();
 
         int index = 0;
         for (Class<?> type : methodType.parameterArray()) {
@@ -176,7 +176,7 @@
             else {
                 block.append(arguments.get(index));
                 index++;
-                block.append(ByteCodeUtils.ifWasNullPopAndGoto(context, end, unboxedReturnType, Lists.reverse(stackTypes)));
+                block.append(ifWasNullPopAndGoto(context, end, unboxedReturnType, Lists.reverse(stackTypes)));
             }
         }
         block.append(invoke(context, binding));
@@ -192,7 +192,7 @@
                         .pushJavaDefault(unboxedReturnType)
                         .gotoLabel(end)
                         .visitLabel(notNull)
-                        .append(ByteCodeUtils.unboxPrimitive(context, unboxedReturnType));
+                        .append(unboxPrimitive(context, unboxedReturnType));
             }
             else {
                 block.dup(methodType.returnType())
