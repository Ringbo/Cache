diff --git a/src/com/facebook/buck/rules/modern/builders/IsolatedBuildableBuilder.java b/src/com/facebook/buck/rules/modern/builders/IsolatedBuildableBuilder.java
index c42bc82..55397d2 100644
--- a/src/com/facebook/buck/rules/modern/builders/IsolatedBuildableBuilder.java
+++ b/src/com/facebook/buck/rules/modern/builders/IsolatedBuildableBuilder.java
@@ -329,7 +329,7 @@
   }
 
   private DataProvider getProvider(Path dir) {
-    Preconditions.checkState(Files.exists(dir));
+    Preconditions.checkState(Files.exists(dir), "Dir [%s] does not exist.", dir.toAbsolutePath());
 
     return new DataProvider() {
       @Override
