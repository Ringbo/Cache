diff --git a/python/src/com/jetbrains/python/sdk/PythonEnvUtil.java b/python/src/com/jetbrains/python/sdk/PythonEnvUtil.java
index 938fd52..228de82 100644
--- a/python/src/com/jetbrains/python/sdk/PythonEnvUtil.java
+++ b/python/src/com/jetbrains/python/sdk/PythonEnvUtil.java
@@ -58,7 +58,7 @@
    */
   @NotNull
   public static String appendToPathEnvVar(@Nullable String source, @NotNull String value) {
-    if (StringUtil.isEmpty(source)) {
+    if (StringUtil.isNotEmpty(source)) {
       assert source != null;
       Set<String> vals = Sets.newHashSet(source.split(File.pathSeparator));
       if (!vals.contains(value)) {
