diff --git a/java/openapi/src/com/intellij/psi/util/PsiUtil.java b/java/openapi/src/com/intellij/psi/util/PsiUtil.java
index 1f925d7..f3b41b2 100644
--- a/java/openapi/src/com/intellij/psi/util/PsiUtil.java
+++ b/java/openapi/src/com/intellij/psi/util/PsiUtil.java
@@ -802,7 +802,7 @@
       }
     } else {
       final PsiClass superClass = clazz.getSuperClass();
-      return superClass == null || hasDefaultConstructor(superClass);
+      return superClass == null || hasDefaultConstructor(superClass, true);
     }
     return false;
   }
