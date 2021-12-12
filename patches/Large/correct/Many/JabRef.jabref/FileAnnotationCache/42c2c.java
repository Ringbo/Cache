diff --git a/src/main/java/org/jabref/logic/pdf/FileAnnotationCache.java b/src/main/java/org/jabref/logic/pdf/FileAnnotationCache.java
index 75a024e..33baade 100644
--- a/src/main/java/org/jabref/logic/pdf/FileAnnotationCache.java
+++ b/src/main/java/org/jabref/logic/pdf/FileAnnotationCache.java
@@ -38,12 +38,12 @@
      * @return Map containing a list of annotations in a list for each file
      */
     public Map<String, List<FileAnnotation>> getFromCache(BibEntry entry) {
-        LOGGER.debug(String.format("Loading Bibentry '%s' from cache.", entry.getField(BibEntry.KEY_FIELD).get()));
+        LOGGER.debug(String.format("Loading Bibentry '%s' from cache.", entry.getCiteKeyOptional().orElse(entry.getId())));
         return annotationCache.getUnchecked(entry);
     }
 
     public void remove(BibEntry entry) {
-        LOGGER.debug(String.format("Deleted Bibentry '%s' from cache.", entry.getField(BibEntry.KEY_FIELD).get()));
+        LOGGER.debug(String.format("Deleted Bibentry '%s' from cache.", entry.getCiteKeyOptional().orElse(entry.getId())));
         annotationCache.invalidate(entry);
     }
 }
