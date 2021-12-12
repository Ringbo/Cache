diff --git a/java/execution/impl/src/com/intellij/execution/JavaTestFrameworkRunnableState.java b/java/execution/impl/src/com/intellij/execution/JavaTestFrameworkRunnableState.java
index e20fdcd..4dda0a5 100644
--- a/java/execution/impl/src/com/intellij/execution/JavaTestFrameworkRunnableState.java
+++ b/java/execution/impl/src/com/intellij/execution/JavaTestFrameworkRunnableState.java
@@ -382,7 +382,7 @@
             final PsiDirectory[] directories = aPackage.getDirectories(configurationSearchScope);
             return Arrays.stream(directories)
                      .map(dir -> ModuleUtilCore.findModuleForFile(dir.getVirtualFile(), project))
-                     .filter(Objects::isNull)
+                     .filter(Objects::nonNull)
                      .distinct()
                      .count() > 1;
           }
