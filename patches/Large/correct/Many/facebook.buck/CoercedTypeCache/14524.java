diff --git a/src/com/facebook/buck/rules/coercer/CoercedTypeCache.java b/src/com/facebook/buck/rules/coercer/CoercedTypeCache.java
index d799707..cca8594 100644
--- a/src/com/facebook/buck/rules/coercer/CoercedTypeCache.java
+++ b/src/com/facebook/buck/rules/coercer/CoercedTypeCache.java
@@ -102,7 +102,8 @@
       throw new IllegalStateException(
           String.format(
               "Could not instantiate immutable constructor arg type %s: %s",
-              dtoType, e.getMessage(), e));
+              dtoType, e.getMessage()),
+          e);
     }
   }
 
@@ -194,7 +195,8 @@
         throw new IllegalStateException(
             String.format(
                 "Builder for coercable type %s had 2 setters named %s but they were not Optional "
-                    + "and non-Optional. Don't know how to coerce."));
+                    + "and non-Optional. Don't know how to coerce.",
+                coercableType.getName(), entry.getKey()));
       }
       ParamInfo paramInfo = new ParamInfo(typeCoercerFactory, takesOptional);
       allInfo.put(paramInfo.getName(), paramInfo);
