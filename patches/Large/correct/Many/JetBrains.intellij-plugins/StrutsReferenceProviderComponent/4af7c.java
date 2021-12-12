diff --git a/struts2/plugin/src/com/intellij/struts2/reference/StrutsReferenceProviderComponent.java b/struts2/plugin/src/com/intellij/struts2/reference/StrutsReferenceProviderComponent.java
index 6a31ff5..bc97281 100644
--- a/struts2/plugin/src/com/intellij/struts2/reference/StrutsReferenceProviderComponent.java
+++ b/struts2/plugin/src/com/intellij/struts2/reference/StrutsReferenceProviderComponent.java
@@ -31,7 +31,7 @@
 import org.jetbrains.annotations.NonNls;
 
 /**
- * Registers all {@link com.intellij.psi.impl.source.resolve.reference.PsiReferenceProvider}s.
+ * Registers all {@link com.intellij.psi.PsiReferenceProvider}s.
  *
  * @author Yann C�bron
  */
@@ -126,7 +126,7 @@
     // elements with "action"
     registerTags(ACTION_REFERENCE_PROVIDER,
                  "action", NAMESPACE_TAGLIB_STRUTS_UI,
-                 "form", "url");
+                 "form", "submit", "url");
 
     registerTags(ACTION_REFERENCE_PROVIDER,
                  "name", NAMESPACE_TAGLIB_STRUTS_UI,
@@ -193,7 +193,7 @@
                  "set");
 
     // <submit>
-    registerTags(new StaticStringValuesReferenceProvider(false, "input", "button", "image"),
+    registerTags(new StaticStringValuesReferenceProvider(false, "input", "button", "image", "submit"),
                  "type", NAMESPACE_TAGLIB_STRUTS_UI,
                  "submit");
 
