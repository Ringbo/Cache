diff --git a/src/edu/stanford/nlp/tagger/io/TSVTaggedFileReader.java b/src/edu/stanford/nlp/tagger/io/TSVTaggedFileReader.java
index 961a0a6..5c68fcc 100644
--- a/src/edu/stanford/nlp/tagger/io/TSVTaggedFileReader.java
+++ b/src/edu/stanford/nlp/tagger/io/TSVTaggedFileReader.java
@@ -73,7 +73,7 @@
     next = new ArrayList<TaggedWord>();
     while (line != null && !line.trim().equals("")) {
       String[] pieces = line.split("\t");
-      if (pieces.length <= wordColumn || pieces.length <= wordColumn) {
+      if (pieces.length <= wordColumn || pieces.length <= tagColumn) {
         throw new IllegalArgumentException("File " + filename + " line #" + 
                                            linesRead + " too short");
       }
