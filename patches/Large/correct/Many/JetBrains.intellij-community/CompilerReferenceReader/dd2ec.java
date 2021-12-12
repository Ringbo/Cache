diff --git a/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceReader.java b/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceReader.java
index 78ade89..ea5ed39 100644
--- a/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceReader.java
+++ b/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceReader.java
@@ -88,7 +88,7 @@
         if (requiredCandidates.isEmpty()) return true;
         final VirtualFile file = findFile(fileId);
         if (file != null && effectiveSearchScope.contains(file)) {
-          candidatesPerFile.put(file, searchType.convertToIds(defs, myIndex.getByteSeqEum()));
+          candidatesPerFile.put(file, searchType.convertToIds(requiredCandidates, myIndex.getByteSeqEum()));
         }
         return true;
       });
