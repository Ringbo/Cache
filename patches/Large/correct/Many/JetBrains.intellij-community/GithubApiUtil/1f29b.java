diff --git a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
index 6bece02..3037911 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
@@ -312,7 +312,7 @@
     }
   }
 
-  public static <Raw extends DataConstructorSimplified<Result>, Result> Result createDataFromRaw(@NotNull Raw rawObject,
+  static <Raw extends DataConstructorSimplified<Result>, Result> Result createDataFromRaw(@NotNull Raw rawObject,
                                                                                                  @NotNull Class<Result> result)
     throws JsonException {
     try {
