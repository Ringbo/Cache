diff --git a/src/edu/stanford/nlp/trees/international/spanish/SpanishTreeNormalizer.java b/src/edu/stanford/nlp/trees/international/spanish/SpanishTreeNormalizer.java
index d6caf3c..107369c 100644
--- a/src/edu/stanford/nlp/trees/international/spanish/SpanishTreeNormalizer.java
+++ b/src/edu/stanford/nlp/trees/international/spanish/SpanishTreeNormalizer.java
@@ -179,7 +179,7 @@
     }
   }
 
-  private static final Pattern pQuoted = Pattern.compile("\".+\"");
+  private static final Pattern pQuoted = Pattern.compile("\"(.+)\"");
 
   /**
    * Return the (single or multiple) words which make up the given
@@ -190,7 +190,7 @@
     if (quoteMatcher.matches()) {
       String[] ret = new String[3];
       ret[0] = "\"";
-      ret[1] = quoteMatcher.group(0);
+      ret[1] = quoteMatcher.group(1);
       ret[2] = "\"";
 
       return ret;
