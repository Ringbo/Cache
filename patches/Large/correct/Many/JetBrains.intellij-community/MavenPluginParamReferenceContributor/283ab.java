diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/plugins/api/MavenPluginParamReferenceContributor.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/plugins/api/MavenPluginParamReferenceContributor.java
index f60effd..6263d99 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/plugins/api/MavenPluginParamReferenceContributor.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/plugins/api/MavenPluginParamReferenceContributor.java
@@ -46,7 +46,7 @@
     @NotNull
     @Override
     public PsiReference[] getReferencesByElement(@NotNull final PsiElement element, @NotNull final ProcessingContext context) {
-      XmlText xmlText = (XmlText)element.getParent();
+      final XmlText xmlText = (XmlText)element.getParent();
 
       if (!MavenPluginParamInfo.isSimpleText(xmlText)) return PsiReference.EMPTY_ARRAY;
 
@@ -57,7 +57,7 @@
         public boolean process(ParamInfo info, MavenDomConfiguration domCfg) {
           MavenParamReferenceProvider providerInstance = info.getProviderInstance();
           if (providerInstance != null) {
-            result = providerInstance.getReferencesByElement(element, domCfg, context);
+            result = providerInstance.getReferencesByElement(xmlText, domCfg, context);
             return false;
           }
 
