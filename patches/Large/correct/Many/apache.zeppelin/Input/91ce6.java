diff --git a/zeppelin-interpreter/src/main/java/org/apache/zeppelin/display/Input.java b/zeppelin-interpreter/src/main/java/org/apache/zeppelin/display/Input.java
index 5294f8b..9736230 100644
--- a/zeppelin-interpreter/src/main/java/org/apache/zeppelin/display/Input.java
+++ b/zeppelin-interpreter/src/main/java/org/apache/zeppelin/display/Input.java
@@ -389,7 +389,7 @@
 
     List<String> splits = new ArrayList<>();
 
-    String curString = "";
+    StringBuilder curString = new StringBuilder();
 
     boolean escape = false; // true when escape char is found
     int lastEscapeOffset = -1;
@@ -408,16 +408,16 @@
       // escaped char comes
       if (escape == true) {
         if (escapeSeq.indexOf(c) < 0) {
-          curString += escapeChar;
+          curString.append(escapeChar);
         }
-        curString += c;
+        curString.append(c);
         escape = false;
         lastEscapeOffset = curString.length();
         continue;
       }
 
       if (blockStack.size() > 0) { // inside of block
-        curString += c;
+        curString.append(c);
         // check multichar block
         boolean multicharBlockDetected = false;
         for (int b = 0; b < blockStart.length; b++) {
@@ -453,11 +453,11 @@
           if (isNestedBlock(blockEnd[blockStack.get(0)]) == false) {
             for (String splitter : splitters) {
               if (splitter.compareTo(getBlockStr(blockEnd[blockStack.get(0)])) == 0) {
-                splits.add(curString);
+                splits.add(curString.toString());
                 if (includeSplitter == true) {
                   splits.add(splitter);
                 }
-                curString = "";
+                curString.setLength(0);
                 lastEscapeOffset = -1;
 
                 break;
@@ -475,11 +475,11 @@
           // forward check for splitter
           int curentLenght = i + splitter.length();
           if (splitter.compareTo(str.substring(i, Math.min(curentLenght, str.length()))) == 0) {
-            splits.add(curString);
+            splits.add(curString.toString());
             if (includeSplitter == true) {
               splits.add(splitter);
             }
-            curString = "";
+            curString.setLength(0);
             lastEscapeOffset = -1;
             i += splitter.length() - 1;
             splitted = true;
@@ -491,7 +491,7 @@
         }
 
         // add char to current string
-        curString += c;
+        curString.append(c);
 
         // check if block is started
         for (int b = 0; b < blockStart.length; b++) {
@@ -505,7 +505,7 @@
       }
     }
     if (curString.length() > 0) {
-      splits.add(curString.trim());
+      splits.add(curString.toString().trim());
     }
     return splits.toArray(new String[] {});
 
