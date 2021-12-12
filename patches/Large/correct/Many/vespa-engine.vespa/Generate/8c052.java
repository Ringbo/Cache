diff --git a/vespajlib/src/main/java/com/yahoo/tensor/functions/Generate.java b/vespajlib/src/main/java/com/yahoo/tensor/functions/Generate.java
index d95feb2..6d0703b 100644
--- a/vespajlib/src/main/java/com/yahoo/tensor/functions/Generate.java
+++ b/vespajlib/src/main/java/com/yahoo/tensor/functions/Generate.java
@@ -50,7 +50,7 @@
 
     @Override
     public TensorFunction replaceArguments(List<TensorFunction> arguments) {
-        if ( arguments.size() != 1)
+        if ( arguments.size() != 0)
             throw new IllegalArgumentException("Generate must have 0 arguments, got " + arguments.size());
         return this;
     }
