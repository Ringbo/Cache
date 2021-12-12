diff --git a/xml/impl/src/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java b/xml/impl/src/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
index e2773b5..a130853 100644
--- a/xml/impl/src/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
+++ b/xml/impl/src/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
@@ -559,7 +559,7 @@
       message = ((EmptyResolveMessageProvider)reference).getUnresolvedMessagePattern();
     }
     else {
-      message = XmlErrorMessages.message("cannot.resolve.symbol");
+      message = PsiBundle.message("cannot.resolve.symbol");
     }
 
     String description;
