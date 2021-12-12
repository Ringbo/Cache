diff --git a/plugins/android/src/org/jetbrains/android/AndroidFindUsagesHandlerFactory.java b/plugins/android/src/org/jetbrains/android/AndroidFindUsagesHandlerFactory.java
index 307b8cc..b3d9c03 100644
--- a/plugins/android/src/org/jetbrains/android/AndroidFindUsagesHandlerFactory.java
+++ b/plugins/android/src/org/jetbrains/android/AndroidFindUsagesHandlerFactory.java
@@ -60,10 +60,10 @@
       return AndroidResourceUtil.isResourceField((PsiField)element);
     }
     else if (element instanceof PsiFile) {
-      return AndroidResourceUtil.findResourceFieldsForFileResource((PsiFile)element, false).length > 0;
+      return AndroidResourceUtil.findResourceFieldsForFileResource((PsiFile)element, true).length > 0;
     }
     else if (element instanceof XmlTag) {
-      return AndroidResourceUtil.findResourceFieldsForValueResource((XmlTag)element, false).length > 0;
+      return AndroidResourceUtil.findResourceFieldsForValueResource((XmlTag)element, true).length > 0;
     }
     return false;
   }
