diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index 633de24..0946113 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -619,7 +619,7 @@
                 }
             }
         }
-        if (receiver == ClassHelper.GSTRING_TYPE) return findMethodOrFail(expr, ClassHelper.STRING_TYPE, name, args);
+        if (receiver == ClassHelper.GSTRING_TYPE) return findMethod(expr, ClassHelper.STRING_TYPE, name, args);
         return null;
     }
 
