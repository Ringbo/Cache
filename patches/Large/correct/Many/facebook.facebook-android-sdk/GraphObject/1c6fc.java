diff --git a/facebook/src/com/facebook/model/GraphObject.java b/facebook/src/com/facebook/model/GraphObject.java
index 935c39f..43fce37 100644
--- a/facebook/src/com/facebook/model/GraphObject.java
+++ b/facebook/src/com/facebook/model/GraphObject.java
@@ -364,7 +364,7 @@
 
         static String convertCamelCaseToLowercaseWithUnderscores(String string) {
             string = string.replaceAll("([a-z])([A-Z])", "$1_$2");
-            return string.toLowerCase();
+            return string.toLowerCase(Locale.US);
         }
 
         private static Object getUnderlyingJSONObject(Object obj) {
