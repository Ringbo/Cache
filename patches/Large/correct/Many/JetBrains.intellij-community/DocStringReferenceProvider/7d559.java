diff --git a/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java b/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java
index 50ee085..13519f8 100644
--- a/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java
+++ b/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java
@@ -61,7 +61,7 @@
     return PsiReference.EMPTY_ARRAY;
   }
 
-  private List<PsiReference> returnTypes(PsiElement element,
+  private static List<PsiReference> returnTypes(PsiElement element,
                                          StructuredDocString docString,
                                                  int offset) {
     List<PsiReference> result = new ArrayList<PsiReference>();
@@ -72,7 +72,7 @@
     }
     return result;
   }
-  private List<PsiReference> referencesFromNames(PsiElement element,
+  private static List<PsiReference> referencesFromNames(PsiElement element,
                                                  int offset,
                                                  StructuredDocString docString,
                                                  List<Substring> paramNames, 
