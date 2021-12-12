diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
index ba102e9..3cdce62 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
@@ -219,7 +219,7 @@
     private Set<VirtualFile> safeGetAndClear(@NotNull Set<VirtualFile> unsafeRefs) {
       Set<VirtualFile> safeRefs = ContainerUtil.newHashSet();
       synchronized (REFRESH_LOCK) {
-        safeRefs.addAll(safeRefs);
+        safeRefs.addAll(unsafeRefs);
         unsafeRefs.clear();
       }
       return safeRefs;
