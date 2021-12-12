diff --git a/platform/lang-impl/src/com/intellij/slicer/SliceLeafAnalyzer.java b/platform/lang-impl/src/com/intellij/slicer/SliceLeafAnalyzer.java
index 4da9e3e..f04a87a 100644
--- a/platform/lang-impl/src/com/intellij/slicer/SliceLeafAnalyzer.java
+++ b/platform/lang-impl/src/com/intellij/slicer/SliceLeafAnalyzer.java
@@ -152,7 +152,7 @@
     });
   }
 
-  public static Map<SliceNode, Collection<PsiElement>> createMap() {
+  public Map<SliceNode, Collection<PsiElement>> createMap() {
     return ConcurrentFactoryMap.createMap(k->ContainerUtil.newConcurrentSet(myLeafEquality), ()->ContainerUtil.newConcurrentMap(ContainerUtil.<SliceNode>identityStrategy()));
   }
 
