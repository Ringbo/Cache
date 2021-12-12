diff --git a/json/src/com/jetbrains/jsonSchema/impl/JsonCachedValues.java b/json/src/com/jetbrains/jsonSchema/impl/JsonCachedValues.java
index 372b599..f71645c 100644
--- a/json/src/com/jetbrains/jsonSchema/impl/JsonCachedValues.java
+++ b/json/src/com/jetbrains/jsonSchema/impl/JsonCachedValues.java
@@ -51,7 +51,7 @@
 
   private static PsiFile resolveFile(@NotNull VirtualFile file,
                                      @NotNull Project project) {
-    if (!file.isValid()) return null;
+    if (project.isDisposed() || !file.isValid()) return null;
     return PsiManager.getInstance(project).findFile(file);
   }
 
