diff --git a/idea/src/org/jetbrains/kotlin/idea/versions/KotlinRuntimeLibraryUtil.java b/idea/src/org/jetbrains/kotlin/idea/versions/KotlinRuntimeLibraryUtil.java
index dd0d96b..20ef703 100644
--- a/idea/src/org/jetbrains/kotlin/idea/versions/KotlinRuntimeLibraryUtil.java
+++ b/idea/src/org/jetbrains/kotlin/idea/versions/KotlinRuntimeLibraryUtil.java
@@ -258,9 +258,9 @@
     public static String bundledRuntimeVersion(@NotNull String pluginVersion) {
         int placeToSplit = -1;
 
-        for (int i = 0; i < pluginVersion.toCharArray().length; i++) {
+        for (int i = 1; i < pluginVersion.length(); i++) {
             char ch = pluginVersion.charAt(i);
-            if (Character.isLetter(ch) && i > 0 && pluginVersion.charAt(i - 1) == '.') {
+            if (Character.isLetter(ch) && pluginVersion.charAt(i - 1) == '.') {
                 placeToSplit = i - 1;
                 break;
             }
