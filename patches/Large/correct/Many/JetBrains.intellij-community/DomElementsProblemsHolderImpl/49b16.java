diff --git a/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java b/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
index 1cd79a5..754865f 100644
--- a/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
+++ b/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
@@ -93,7 +93,7 @@
 
   private static Collection<DomElementProblemDescriptor> getXmlProblems(DomElement domElement) {
     Collection<DomElementProblemDescriptor> problems = new ArrayList<DomElementProblemDescriptor>();
-    if (domElement.getXmlTag() != null) {
+    if (domElement != null && domElement.getXmlTag() != null) {
       problems.addAll(getResolveProblems(domElement));
 
     }
