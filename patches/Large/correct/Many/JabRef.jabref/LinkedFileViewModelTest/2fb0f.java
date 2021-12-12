diff --git a/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java b/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java
index fd6d832..155804a 100644
--- a/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java
+++ b/src/test/java/org/jabref/gui/fieldeditors/LinkedFileViewModelTest.java
@@ -55,7 +55,7 @@
         linkedFile = spy(new LinkedFile("", "nonexistent file", ""));
         doReturn(Optional.empty()).when(linkedFile).findIn(any(BibDatabaseContext.class), any(FileDirectoryPreferences.class));
 
-        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, taskExecutor, dialogService);
+        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, dialogService, taskExecutor);
         boolean removed = viewModel.delete(fileDirectoryPreferences);
 
         assertTrue(removed);
@@ -74,7 +74,7 @@
                 any(ButtonType.class),
                 any(ButtonType.class))).thenAnswer(invocation -> Optional.of(invocation.getArgument(3))); // first vararg - remove button
 
-        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, taskExecutor, dialogService);
+        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, dialogService, taskExecutor);
         boolean removed = viewModel.delete(fileDirectoryPreferences);
 
         assertTrue(removed);
@@ -93,7 +93,7 @@
                 any(ButtonType.class),
                 any(ButtonType.class))).thenAnswer(invocation -> Optional.of(invocation.getArgument(4))); // second vararg - delete button
 
-        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, taskExecutor, dialogService);
+        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, dialogService, taskExecutor);
         boolean removed = viewModel.delete(fileDirectoryPreferences);
 
         assertTrue(removed);
@@ -111,7 +111,7 @@
                 any(ButtonType.class),
                 any(ButtonType.class))).thenAnswer(invocation -> Optional.of(invocation.getArgument(4))); // second vararg - delete button
 
-        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, taskExecutor, dialogService);
+        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, dialogService, taskExecutor);
         boolean removed = viewModel.delete(fileDirectoryPreferences);
 
         verify(dialogService).showErrorDialogAndWait(anyString(), anyString());
@@ -130,7 +130,7 @@
                 any(ButtonType.class),
                 any(ButtonType.class))).thenAnswer(invocation -> Optional.of(invocation.getArgument(5))); // third vararg - cancel button
 
-        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, taskExecutor, dialogService);
+        LinkedFileViewModel viewModel = new LinkedFileViewModel(linkedFile, entry, databaseContext, dialogService, taskExecutor);
         boolean removed = viewModel.delete(fileDirectoryPreferences);
 
         assertFalse(removed);
