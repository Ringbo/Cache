diff --git a/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootModelImpl.java b/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootModelImpl.java
index d35d7ba..8d9e4a8 100644
--- a/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootModelImpl.java
+++ b/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootModelImpl.java
@@ -226,7 +226,7 @@
   public LibraryOrderEntry addLibraryEntry(@NotNull Library library) {
     assertWritable();
     final LibraryOrderEntry libraryOrderEntry = new LibraryOrderEntryImpl(library, this, myProjectRootManager);
-    if (libraryOrderEntry.isValid()) {
+    if (!libraryOrderEntry.isValid()) {
       LibraryEx libraryEx = ObjectUtils.tryCast(library, LibraryEx.class);
       boolean libraryDisposed = libraryEx != null ? libraryEx.isDisposed() : Disposer.isDisposed(library);
       throw new AssertionError("Invalid libraryOrderEntry, library: " + library
