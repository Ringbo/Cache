diff --git a/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java b/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
index 82aa93d..385494a 100644
--- a/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
+++ b/java/java-impl/src/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
@@ -198,7 +198,7 @@
     XmlTag rootTag = extractRootTag(annotationsFile);
 
     TreeMap<String, List<ExternalAnnotation>> ownerToAnnotations = StreamEx.of(annotations)
-      .mapToEntry(annotation -> StringUtil.escapeXml(getExternalName(annotation.getOwner(), false)), Function.identity())
+      .mapToEntry(annotation -> StringUtil.escapeXml(getExternalName(annotation.getOwner())), Function.identity())
       .distinct()
       .grouping(() -> new TreeMap<>(Comparator.nullsFirst(Comparator.naturalOrder())));
 
