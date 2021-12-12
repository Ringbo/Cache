diff --git a/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java b/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java
index 1fd2bfc..b1bfa49 100644
--- a/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java
+++ b/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java
@@ -48,7 +48,7 @@
     }
 
     @Test
-    public void deleteWhenFilePathNotPresentReturnsFalse() {
+    public void deleteWhenFilePathNotPresentReturnsTrue() {
         // Making this a spy, so we can inject an empty optional without digging into the implementation
         linkedFile = spy(new LinkedFile("", "nonexistent file", ""));
         doReturn(Optional.empty()).when(linkedFile).findIn(any(BibDatabaseContext.class), any(FileDirectoryPreferences.class));
@@ -56,7 +56,7 @@
         LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, taskExecutor, dialogService);
         boolean removed = viewModel.delete();
 
-        assertFalse(removed);
+        assertTrue(removed);
         verifyZeroInteractions(dialogService); // dialog was never shown
     }
 
