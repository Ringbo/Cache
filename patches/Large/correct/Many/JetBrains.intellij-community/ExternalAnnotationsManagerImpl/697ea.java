diff --git a/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java b/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
index 257364a8..f69e95f 100644
--- a/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
+++ b/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
@@ -293,7 +293,7 @@
       }
 
       prevItem = curItem;
-      curItem = PsiTreeUtil.getNextSiblingOfType(startTag, XmlTag.class);
+      curItem = PsiTreeUtil.getNextSiblingOfType(curItem, XmlTag.class);
     }
 
     return addItemTag(rootTag, prevItem, ownerName, annotation);
