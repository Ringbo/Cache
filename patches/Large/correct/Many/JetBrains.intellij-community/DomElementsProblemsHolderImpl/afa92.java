diff --git a/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java b/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
index 754865f..5e2da00 100644
--- a/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
+++ b/source/com/intellij/util/xml/highlighting/DomElementsProblemsHolderImpl.java
@@ -55,7 +55,7 @@
                                                        final boolean includeXmlProblems,
                                                        final boolean withChildren) {
 
-    if (!withChildren) return getProblems(domElement);
+    if (!withChildren || domElement == null) return getProblems(domElement);
 
     final Set<DomElementProblemDescriptor> problems = new HashSet<DomElementProblemDescriptor>();
 
