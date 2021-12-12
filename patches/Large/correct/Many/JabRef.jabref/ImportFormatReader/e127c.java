diff --git a/src/java/net/sf/jabref/imports/ImportFormatReader.java b/src/java/net/sf/jabref/imports/ImportFormatReader.java
index cbda655..6463a84 100644
--- a/src/java/net/sf/jabref/imports/ImportFormatReader.java
+++ b/src/java/net/sf/jabref/imports/ImportFormatReader.java
@@ -254,7 +254,7 @@
       // Check if we have cached this particular name string before: 
       Object old = nameCacheLastFirst.get(in); if (old != null) return (String)old;
 
-      if (in.indexOf("{") > 0) {
+      if (in.indexOf("{") >= 0) {
 	  StringBuffer tmp = new StringBuffer();
 	  int start = -1, end = 0;
 	  while ((start = in.indexOf("{", end)) > -1) {
@@ -264,7 +264,7 @@
 		  tmp.append(in.substring(start, end).replaceAll(" ", SPACE_MARKER));
 	      }
 	  }
-	  if ((end > 0) && (end < in.length()-1))
+	  if ((end > 0) && (end < in.length()))
 	      tmp.append(in.substring(end));
 
 	  in = tmp.toString();
@@ -278,7 +278,7 @@
     for (int i = 0; i < authors.length; i++) {
       authors[i] = authors[i].trim();
 
-      int comma = authors[i].indexOf(',');
+      int comma = authors[i].indexOf(", ");
 test: 
       if (comma >= 0)
         // There is a comma, so we assume it's ok.
