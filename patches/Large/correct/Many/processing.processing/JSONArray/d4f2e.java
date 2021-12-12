diff --git a/core/src/processing/data/JSONArray.java b/core/src/processing/data/JSONArray.java
index c25ac93..0e665c8 100644
--- a/core/src/processing/data/JSONArray.java
+++ b/core/src/processing/data/JSONArray.java
@@ -1182,9 +1182,10 @@
 
       if (length == 1) {
         JSONObject.writeValue(writer, this.myArrayList.get(0),
-                              thisFactor, indent);
+                              indentFactor, indent);
+//                              thisFactor, indent);
       } else if (length != 0) {
-        final int newindent = indent + thisFactor;
+        final int newIndent = indent + thisFactor;
 
         for (int i = 0; i < length; i += 1) {
           if (commanate) {
@@ -1193,9 +1194,11 @@
           if (indentFactor != -1) {
             writer.write('\n');
           }
-          JSONObject.indent(writer, newindent);
+          JSONObject.indent(writer, newIndent);
+//          JSONObject.writeValue(writer, this.myArrayList.get(i),
+//                                thisFactor, newIndent);
           JSONObject.writeValue(writer, this.myArrayList.get(i),
-                                thisFactor, newindent);
+                                indentFactor, newIndent);
           commanate = true;
         }
         if (indentFactor != -1) {
