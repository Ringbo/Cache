diff --git a/python/src/com/jetbrains/python/sdk/PythonSdkType.java b/python/src/com/jetbrains/python/sdk/PythonSdkType.java
index de51cfc..6ab79db 100644
--- a/python/src/com/jetbrains/python/sdk/PythonSdkType.java
+++ b/python/src/com/jetbrains/python/sdk/PythonSdkType.java
@@ -756,7 +756,7 @@
   }
 
   public static LanguageLevel getLanguageLevelForSdk(@Nullable Sdk sdk) {
-    if (sdk != null) {
+    if (sdk != null && sdk.getSdkType() instanceof PythonSdkType) {
       final PythonSdkFlavor flavor = PythonSdkFlavor.getFlavor(sdk);
       if (flavor != null) {
         return flavor.getLanguageLevel(sdk);
