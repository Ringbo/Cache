diff --git a/app/src/processing/app/SerialPlotter.java b/app/src/processing/app/SerialPlotter.java
index 93dc5b6..ffe15ae 100644
--- a/app/src/processing/app/SerialPlotter.java
+++ b/app/src/processing/app/SerialPlotter.java
@@ -241,7 +241,7 @@
       for(int i = 0; i < parts.length; ++i) {
         try {          
           double value = Double.valueOf(parts[i]);
-          if(i >= graphs.size()) {
+          if(validParts >= graphs.size()) {
             graphs.add(new Graph(validParts));
           }
           graphs.get(validParts).buffer.add(value);
