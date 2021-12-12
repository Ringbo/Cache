diff --git a/struts2/plugin/src/com/intellij/struts2/dom/struts/impl/ExtendableClassConverterImpl.java b/struts2/plugin/src/com/intellij/struts2/dom/struts/impl/ExtendableClassConverterImpl.java
index 4db514c..f7768be 100644
--- a/struts2/plugin/src/com/intellij/struts2/dom/struts/impl/ExtendableClassConverterImpl.java
+++ b/struts2/plugin/src/com/intellij/struts2/dom/struts/impl/ExtendableClassConverterImpl.java
@@ -116,7 +116,7 @@
       if (contributor.isSuitable(context)) {
         final PsiReference[] additionalReferences = contributor.getReferencesByElement(element,
                                                                                        new ProcessingContext());
-        javaClassReferences = ArrayUtil.mergeArrays(javaClassReferences, additionalReferences);
+        javaClassReferences = ArrayUtil.mergeArrays(javaClassReferences, additionalReferences, PsiReference.ARRAY_FACTORY);
         referenceTypes = ArrayUtil.append(referenceTypes,
                                           contributor.getContributorType(),
                                           ArrayUtil.STRING_ARRAY_FACTORY);
