diff --git a/java/testFramework/src/com/intellij/testFramework/ResolveTestCase.java b/java/testFramework/src/com/intellij/testFramework/ResolveTestCase.java
index ba2cb50..0b9fcd0 100644
--- a/java/testFramework/src/com/intellij/testFramework/ResolveTestCase.java
+++ b/java/testFramework/src/com/intellij/testFramework/ResolveTestCase.java
@@ -60,7 +60,7 @@
 
   protected PsiReference configureByFileText(String fileText, String fileName, @Nullable VirtualFile parentDir) throws Exception {
     int offset = fileText.indexOf(MARKER);
-    assertTrue(offset >= 0);
+    assertTrue(String.format("Expected to find %s marker in file but was none", MARKER), offset >= 0);
     fileText = fileText.substring(0, offset) + fileText.substring(offset + MARKER.length());
 
     if (parentDir == null) {
