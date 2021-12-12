diff --git a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
index 9029cd8..b8cf537 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
@@ -292,7 +292,7 @@
     try {
       return new JsonParser().parse(reader);
     }
-    catch (JsonSyntaxException jse) {
+    catch (JsonParseException jse) {
       throw new GithubJsonException("Couldn't parse GitHub response", jse);
     }
     finally {
