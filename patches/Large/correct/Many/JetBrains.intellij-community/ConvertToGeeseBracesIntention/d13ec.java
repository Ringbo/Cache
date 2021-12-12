diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/style/ConvertToGeeseBracesIntention.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/style/ConvertToGeeseBracesIntention.java
index 11047f9..83a7c57 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/style/ConvertToGeeseBracesIntention.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/style/ConvertToGeeseBracesIntention.java
@@ -58,7 +58,7 @@
         element = PsiTreeUtil.prevLeaf(element);
       }
 
-      if (!isClosureRBrace(element)) return false;
+      if (!isClosureRBrace(element) || !isClosureContainLF(element)) return false;
 
       TextRange range = findRange(element);
 
@@ -88,7 +88,7 @@
     if (TokenSets.WHITE_SPACES_SET.contains(elementType)) {
       element = PsiTreeUtil.prevLeaf(element);
     }
-    LOG.assertTrue(isClosureRBrace(element));
+    LOG.assertTrue(isClosureRBrace(element) && isClosureContainLF(element));
 
     PsiDocumentManager.getInstance(project).commitAllDocuments();
 
