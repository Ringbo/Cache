diff --git a/core/src/com/google/inject/TypeLiteral.java b/core/src/com/google/inject/TypeLiteral.java
index 61034b3..d18087d 100644
--- a/core/src/com/google/inject/TypeLiteral.java
+++ b/core/src/com/google/inject/TypeLiteral.java
@@ -171,7 +171,7 @@
     for (int t = 0; t < types.length; t++) {
       result[t] = resolve(types[t]);
     }
-    return ImmutableList.of(result);
+    return ImmutableList.copyOf(result);
   }
 
   /**
