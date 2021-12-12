diff --git a/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java b/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java
index 351cc43..bea4a69 100644
--- a/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java
+++ b/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java
@@ -259,10 +259,10 @@
         final TIntHashSet ids1 = myReader.getAllContainingFileIds(ref1);
         final TIntHashSet ids2 = myReader.getAllContainingFileIds(ref2);
         final TIntHashSet intersection = intersection(ids1, ids2);
-        if ((ids1.size() - intersection.size()) * correlationThreshold < intersection.size()) {
+        if ((ids1.size() - intersection.size()) * correlationThreshold < ids1.size()) {
           return true;
         }
-        if ((ids1.size() - intersection.size()) * correlationThreshold < intersection.size()) {
+        if ((ids2.size() - intersection.size()) * correlationThreshold < ids2.size()) {
           return true;
         }
         return false;
