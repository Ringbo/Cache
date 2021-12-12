diff --git a/platform/indexing-impl/src/com/intellij/psi/impl/cache/impl/id/IdTableBuilding.java b/platform/indexing-impl/src/com/intellij/psi/impl/cache/impl/id/IdTableBuilding.java
index 36c1b2f..3b0da18 100644
--- a/platform/indexing-impl/src/com/intellij/psi/impl/cache/impl/id/IdTableBuilding.java
+++ b/platform/indexing-impl/src/com/intellij/psi/impl/cache/impl/id/IdTableBuilding.java
@@ -50,7 +50,7 @@
   private static final Map<FileType, IdIndexer> ourIdIndexers = new HashMap<>();
 
   @Deprecated
-  public static void registerIdIndexer(@NotNull FileType fileType, IdIndexer indexer) {
+  public static void registerIdIndexer(@NotNull FileType fileType, FileTypeIdIndexer indexer) {
     ourIdIndexers.put(fileType, indexer);
   }
 
