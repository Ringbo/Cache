diff --git a/main/src/com/google/refine/expr/functions/booleans/Xor.java b/main/src/com/google/refine/expr/functions/booleans/Xor.java
index 72fdb1e..b80b3cb 100644
--- a/main/src/com/google/refine/expr/functions/booleans/Xor.java
+++ b/main/src/com/google/refine/expr/functions/booleans/Xor.java
@@ -41,7 +41,7 @@
     public Object call(Properties bindings, Object[] args) {
         if (args.length == 2 && 
                 args[0] != null && args[0] instanceof Boolean && 
-                args[1] != null && args[0] instanceof Boolean) {
+                args[1] != null && args[1] instanceof Boolean) {
             boolean o1 = ((Boolean) args[0]).booleanValue();
             boolean o2 = ((Boolean) args[1]).booleanValue();
             return o1 != o2;
