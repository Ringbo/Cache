diff --git a/source/com/intellij/openapi/vcs/actions/VcsContextWrapper.java b/source/com/intellij/openapi/vcs/actions/VcsContextWrapper.java
index 09c5263..84f7303 100644
--- a/source/com/intellij/openapi/vcs/actions/VcsContextWrapper.java
+++ b/source/com/intellij/openapi/vcs/actions/VcsContextWrapper.java
@@ -74,7 +74,7 @@
   }
 
   public static VcsContext createCachedInstanceOn(AnActionEvent event) {
-    return new CachedVcsContext(createCachedInstanceOn(event));
+    return new CachedVcsContext(createInstanceOn(event));
   }
 
   public static VcsContextWrapper createInstanceOn(final AnActionEvent event) {
