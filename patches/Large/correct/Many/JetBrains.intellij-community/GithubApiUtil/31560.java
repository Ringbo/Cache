diff --git a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
index 19f5ca2..b624730 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/api/GithubApiUtil.java
@@ -48,7 +48,7 @@
   private static final int CONNECTION_TIMEOUT = 5000;
   private static final Logger LOG = GithubUtil.LOG;
 
-  @NotNull public static final Gson gson = initGson();
+  @NotNull private static final Gson gson = initGson();
 
   private static Gson initGson() {
     GsonBuilder builder = new GsonBuilder();
@@ -235,7 +235,7 @@
    * Github API
    */
 
-  public static <Raw extends DataConstructor<Result>, Result> Result createDataFromRaw(@NotNull Raw rawObject,
+  static <Raw extends DataConstructor<Result>, Result> Result createDataFromRaw(@NotNull Raw rawObject,
                                                                                        @NotNull Class<Result> result) throws JsonException {
     try {
       return rawObject.create();
@@ -245,7 +245,7 @@
     }
   }
 
-  public static <Raw extends DataConstructorDetailed<Result>, Result> Result createDataFromRaw(@NotNull Raw rawObject,
+  static <Raw extends DataConstructorDetailed<Result>, Result> Result createDataFromRaw(@NotNull Raw rawObject,
                                                                                                @NotNull Class<Result> result)
     throws JsonException {
     try {
