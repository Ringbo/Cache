diff --git a/platform/util/src/com/intellij/util/containers/ContainerUtil.java b/platform/util/src/com/intellij/util/containers/ContainerUtil.java
index 618a567..009746a 100644
--- a/platform/util/src/com/intellij/util/containers/ContainerUtil.java
+++ b/platform/util/src/com/intellij/util/containers/ContainerUtil.java
@@ -897,7 +897,7 @@
 
   @NotNull
   public static <T> Collection<T> subtract(@NotNull Collection<T> from, @NotNull Collection<T> what) {
-    final Set<T> set = newHashSet();
+    final Set<T> set = newHashSet(from);
     set.removeAll(what);
     return set;
   }
