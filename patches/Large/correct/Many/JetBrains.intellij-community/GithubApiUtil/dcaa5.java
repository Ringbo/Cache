diff --git a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
index f1e244c..095285e 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
@@ -240,7 +240,7 @@
 
   @NotNull
   private static JsonElement parseResponse(@NotNull InputStream githubResponse) throws IOException {
-    Reader reader = new InputStreamReader(githubResponse);
+    Reader reader = new InputStreamReader(githubResponse, "UTF-8");
     try {
       return new JsonParser().parse(reader);
     }
