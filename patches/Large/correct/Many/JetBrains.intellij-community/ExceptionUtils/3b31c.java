diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExceptionUtils.java b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExceptionUtils.java
index 8067abb..337537d 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExceptionUtils.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExceptionUtils.java
@@ -58,7 +58,7 @@
             return false;
         }
         final PsiClassType classType = (PsiClassType) exceptionType;
-        final String className = classType.getClassName();
+        final String className = classType.getCanonicalText();
         return s_genericExceptionTypes.contains(className);
     }
 
