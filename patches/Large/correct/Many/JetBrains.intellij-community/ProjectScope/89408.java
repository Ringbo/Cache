diff --git a/platform/core-api/src/com/intellij/psi/search/ProjectScope.java b/platform/core-api/src/com/intellij/psi/search/ProjectScope.java
index 34f1578..d9634c8 100644
--- a/platform/core-api/src/com/intellij/psi/search/ProjectScope.java
+++ b/platform/core-api/src/com/intellij/psi/search/ProjectScope.java
@@ -63,7 +63,7 @@
       }
     });
   private static final NotNullLazyKey<EverythingGlobalScope, Project> EVERYTHING_SCOPE_KEY = NotNullLazyKey.create(
-    "ALL_PLACES",
+    "EVERYTHING_SCOPE_KEY",
     new NotNullFunction<Project, EverythingGlobalScope>() {
       @NotNull
       @Override
@@ -98,7 +98,7 @@
 
   @NotNull
   public static GlobalSearchScope getContentScope(@NotNull Project project) {
-    return CONTENT_SCOPE_KEY.get(project);
+    return CONTENT_SCOPE_KEY.getValue(project);
   }
 
   @NotNull
