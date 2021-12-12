diff --git a/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexOrderEnumerationHandler.java b/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexOrderEnumerationHandler.java
index 2c035db..80bca69 100644
--- a/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexOrderEnumerationHandler.java
+++ b/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexOrderEnumerationHandler.java
@@ -186,7 +186,7 @@
     }
 
     final String[] allUrls = sdk.getRootProvider().getUrls(type);
-    if (type == OrderRootType.CLASSES) {
+    if (type != OrderRootType.CLASSES) {
       urls.addAll(Arrays.asList(allUrls));
       return true;
     }
