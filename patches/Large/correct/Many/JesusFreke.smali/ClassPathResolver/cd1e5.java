diff --git a/dexlib2/src/main/java/org/jf/dexlib2/analysis/ClassPathResolver.java b/dexlib2/src/main/java/org/jf/dexlib2/analysis/ClassPathResolver.java
index da2dbea..10daa56 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/analysis/ClassPathResolver.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/analysis/ClassPathResolver.java
@@ -232,7 +232,7 @@
         List<String> entryNames = container.getDexEntryNames();
 
         if (entryNames.size() == 0) {
-            throw new NoDexException("%s contains no dex file");
+            throw new NoDexException("%s contains no dex file", entryFile);
         }
 
         loadedFiles.add(entryFile);
