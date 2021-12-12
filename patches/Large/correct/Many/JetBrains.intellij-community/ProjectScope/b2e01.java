diff --git a/platform/core-api/src/com/intellij/psi/search/ProjectScope.java b/platform/core-api/src/com/intellij/psi/search/ProjectScope.java
index 6c502ab..39a239a 100644
--- a/platform/core-api/src/com/intellij/psi/search/ProjectScope.java
+++ b/platform/core-api/src/com/intellij/psi/search/ProjectScope.java
@@ -53,7 +53,7 @@
 
   @NotNull
   public static GlobalSearchScope getContentScope(@NotNull Project project) {
-    GlobalSearchScope cached = project.getUserData(LIBRARIES_SCOPE_KEY);
+    GlobalSearchScope cached = project.getUserData(CONTENT_SCOPE_KEY);
     return cached != null ? cached : ((UserDataHolderEx)project).putUserDataIfAbsent(CONTENT_SCOPE_KEY, ProjectScopeBuilder.getInstance(project).buildContentScope());
   }
 }
