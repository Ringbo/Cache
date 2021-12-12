diff --git a/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/intentions/ConvertFieldToThreadLocalIntention.java b/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/intentions/ConvertFieldToThreadLocalIntention.java
index 2181606..d8dca0a 100644
--- a/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/intentions/ConvertFieldToThreadLocalIntention.java
+++ b/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/intentions/ConvertFieldToThreadLocalIntention.java
@@ -51,7 +51,7 @@
     if (psiField.getTypeElement() == null) return false;
     final PsiType fieldType = psiField.getType();
     final PsiClass fieldTypeClass = PsiUtil.resolveClassInType(fieldType);
-    if (fieldType instanceof PsiPrimitiveType) return true;
+    if (fieldType instanceof PsiPrimitiveType || fieldType instanceof PsiArrayType) return true;
     return fieldTypeClass != null && !Comparing.strEqual(fieldTypeClass.getQualifiedName(), ThreadLocal.class.getName());
   }
 
