diff --git a/python/src/com/jetbrains/python/psi/search/PyStringReferenceSearch.java b/python/src/com/jetbrains/python/psi/search/PyStringReferenceSearch.java
index 4cdcc71..74009f5 100644
--- a/python/src/com/jetbrains/python/psi/search/PyStringReferenceSearch.java
+++ b/python/src/com/jetbrains/python/psi/search/PyStringReferenceSearch.java
@@ -38,8 +38,7 @@
 
     SearchScope searchScope = params.getEffectiveSearchScope();
     if (searchScope instanceof GlobalSearchScope) {
-      searchScope = GlobalSearchScope.getScopeRestrictedByFileTypes((GlobalSearchScope)searchScope, PythonFileType.INSTANCE, DjangoTemplateFileType.INSTANCE, StdFileTypes.XML, StdFileTypes.XHTML,
-                                                                    HtmlFileType.INSTANCE
+      searchScope = GlobalSearchScope.getScopeRestrictedByFileTypes((GlobalSearchScope)searchScope, PythonFileType.INSTANCE
       );
     }
 
