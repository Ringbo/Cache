diff --git a/compiler/src/org.graalvm.compiler.printer/src/org/graalvm/compiler/printer/BinaryGraphPrinter.java b/compiler/src/org.graalvm.compiler.printer/src/org/graalvm/compiler/printer/BinaryGraphPrinter.java
index c37eac5..03ebcce 100644
--- a/compiler/src/org.graalvm.compiler.printer/src/org/graalvm/compiler/printer/BinaryGraphPrinter.java
+++ b/compiler/src/org.graalvm.compiler.printer/src/org/graalvm/compiler/printer/BinaryGraphPrinter.java
@@ -366,7 +366,7 @@
             return ((Class<?>) obj).getName();
         }
         if (obj instanceof ResolvedJavaType) {
-            return ((ResolvedJavaType) obj).getName();
+            return ((ResolvedJavaType) obj).toJavaName();
         }
         return null;
     }
@@ -403,7 +403,7 @@
 
     @Override
     public String fieldTypeName(ResolvedJavaField field) {
-        return field.getType().getName();
+        return field.getType().toJavaName();
     }
 
     @Override
