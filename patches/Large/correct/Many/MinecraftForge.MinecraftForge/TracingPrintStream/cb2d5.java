diff --git a/src/main/java/net/minecraftforge/fml/common/TracingPrintStream.java b/src/main/java/net/minecraftforge/fml/common/TracingPrintStream.java
index f6ea78e..0451edf 100644
--- a/src/main/java/net/minecraftforge/fml/common/TracingPrintStream.java
+++ b/src/main/java/net/minecraftforge/fml/common/TracingPrintStream.java
@@ -44,7 +44,7 @@
         if (elem.getClassName().startsWith("kotlin.io.")) {
             elem = elems[BASE_DEPTH + 2]; // Kotlins IoPackage masks origins 2 deeper in the stack.
         } else if (elem.getClassName().startsWith("java.lang.Throwable")) {
-            elem = elems[BASE_DEPTH + 2];
+            elem = elems[BASE_DEPTH + 4];
         }
         return "[" + elem.getClassName() + ":" + elem.getMethodName() + ":" + elem.getLineNumber() + "]: ";
     }
