diff --git a/plugins/github/src/org/jetbrains/plugins/github/GithubUtil.java b/plugins/github/src/org/jetbrains/plugins/github/GithubUtil.java
index 4e987fb..69989a3 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/GithubUtil.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/GithubUtil.java
@@ -386,7 +386,7 @@
   }
 
   public static boolean isGithubUrl(@NotNull String url) {
-    return url.contains(GithubApiUtil.getGitHost());
+    return url.contains(GithubApiUtil.removeProtocolPrefix(GithubSettings.getInstance().getHost()));
   }
 
   static void setVisibleEnabled(AnActionEvent e, boolean visible, boolean enabled) {
