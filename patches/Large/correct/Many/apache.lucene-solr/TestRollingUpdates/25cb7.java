diff --git a/lucene/src/test/org/apache/lucene/index/TestRollingUpdates.java b/lucene/src/test/org/apache/lucene/index/TestRollingUpdates.java
index ba2b5fb..3dd1a41 100644
--- a/lucene/src/test/org/apache/lucene/index/TestRollingUpdates.java
+++ b/lucene/src/test/org/apache/lucene/index/TestRollingUpdates.java
@@ -128,7 +128,7 @@
 
     public void run() {
       try {
-        IndexReader open = null;
+        DirectoryReader open = null;
         for (int i = 0; i < num; i++) {
           Document doc = new Document();// docs.nextDoc();
           doc.add(newField("id", "test", StringField.TYPE_UNSTORED));
@@ -137,7 +137,7 @@
             if (open == null) {
               open = IndexReader.open(writer, true);
             }
-            IndexReader reader = IndexReader.openIfChanged(open);
+            DirectoryReader reader = DirectoryReader.openIfChanged(open);
             if (reader != null) {
               open.close();
               open = reader;
