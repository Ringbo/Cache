diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java b/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java
index 1b594ab..14d7b9b 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java
@@ -442,7 +442,7 @@
 
   @Nullable
   private static GlobalSearchScope toGlobal(Project project, @Nullable SearchScope scope) {
-    if (scope instanceof GlobalSearchScope) {
+    if (scope instanceof GlobalSearchScope || scope == null) {
       return (GlobalSearchScope)scope;
     }
     Set<VirtualFile> files = new HashSet<VirtualFile>();
