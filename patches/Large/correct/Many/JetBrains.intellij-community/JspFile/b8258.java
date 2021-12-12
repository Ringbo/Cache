diff --git a/openapi/src/com/intellij/psi/jsp/JspFile.java b/openapi/src/com/intellij/psi/jsp/JspFile.java
index c92487f..9be64b0 100644
--- a/openapi/src/com/intellij/psi/jsp/JspFile.java
+++ b/openapi/src/com/intellij/psi/jsp/JspFile.java
@@ -21,5 +21,5 @@
   boolean isSessionPage();
 
   XmlTag[] getDirectiveTags(JspDirectiveKind directiveKind);
-  XmlTag createDirective(ASTNode context, JspDirectiveKind page);
+  XmlTag createDirective(XmlTag context, JspDirectiveKind page);
 }
