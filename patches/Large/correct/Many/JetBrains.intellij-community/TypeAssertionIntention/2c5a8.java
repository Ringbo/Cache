diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java
index 93fbf57..ab65d8b 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java
@@ -56,7 +56,7 @@
         (reference != null && reference.resolve() == null)) {
       return false;
     }
-    final PyType type = problemElement.getType(TypeEvalContext.fast());
+    final PyType type = problemElement.getType(TypeEvalContext.slow());
     return (type == null || type instanceof PyReturnTypeReference);
   }
 
