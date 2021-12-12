diff --git a/main/src/com/metaweb/gridworks/expr/functions/math/Mod.java b/main/src/com/metaweb/gridworks/expr/functions/math/Mod.java
index edcea96..8a829c4 100644
--- a/main/src/com/metaweb/gridworks/expr/functions/math/Mod.java
+++ b/main/src/com/metaweb/gridworks/expr/functions/math/Mod.java
@@ -16,7 +16,7 @@
                 args[0] != null && args[0] instanceof Number && 
                 args[1] != null && args[1] instanceof Number) {
             int a = ((Number) args[0]).intValue();
-            int b = ((Number) args[0]).intValue();
+            int b = ((Number) args[1]).intValue();
             
             return a % b;
         }
