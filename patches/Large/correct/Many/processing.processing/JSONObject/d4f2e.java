diff --git a/core/src/processing/data/JSONObject.java b/core/src/processing/data/JSONObject.java
index 0b1c112..165b099 100644
--- a/core/src/processing/data/JSONObject.java
+++ b/core/src/processing/data/JSONObject.java
@@ -1790,9 +1790,10 @@
         if (actualFactor > 0) {
           writer.write(' ');
         }
-        writeValue(writer, this.map.get(key), actualFactor, indent);
+        //writeValue(writer, this.map.get(key), actualFactor, indent);
+        writeValue(writer, this.map.get(key), indentFactor, indent);
       } else if (length != 0) {
-        final int newindent = indent + actualFactor;
+        final int newIndent = indent + actualFactor;
         while (keys.hasNext()) {
           Object key = keys.next();
           if (commanate) {
@@ -1801,14 +1802,14 @@
           if (indentFactor != -1) {
             writer.write('\n');
           }
-          indent(writer, newindent);
+          indent(writer, newIndent);
           writer.write(quote(key.toString()));
           writer.write(':');
           if (actualFactor > 0) {
             writer.write(' ');
           }
-          writeValue(writer, this.map.get(key), actualFactor,
-                     newindent);
+          //writeValue(writer, this.map.get(key), actualFactor, newIndent);
+          writeValue(writer, this.map.get(key), indentFactor, newIndent);
           commanate = true;
         }
         if (indentFactor != -1) {
