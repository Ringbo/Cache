diff --git a/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java b/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
index 3249414..3d245f4 100644
--- a/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
+++ b/dom/impl/src/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
@@ -129,7 +129,7 @@
                                                        final boolean includeXmlProblems,
                                                        final boolean withChildren) {
 
-    final List<DomElementProblemDescriptor> list = getProblems(domElement);
+    final List<DomElementProblemDescriptor> list = getProblems(domElement, includeXmlProblems);
     if (!withChildren || domElement == null || !domElement.isValid()) {
       return list;
     }
