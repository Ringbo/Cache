diff --git a/lucene/join/src/test/org/apache/lucene/search/join/TestJoinUtil.java b/lucene/join/src/test/org/apache/lucene/search/join/TestJoinUtil.java
index c95e144..49dd333 100644
--- a/lucene/join/src/test/org/apache/lucene/search/join/TestJoinUtil.java
+++ b/lucene/join/src/test/org/apache/lucene/search/join/TestJoinUtil.java
@@ -1141,7 +1141,7 @@
                   indexSearcher, scoreMode1)));
         }
 
-        for (int i = 0; i < 13; i++) {
+        for (int i = 14; i < 26; i++) {
           Document doc = new Document();
           doc.add(new TextField("id", "new_id" , Field.Store.NO));
           doc.add(new TextField("name", "name5", Field.Store.NO));
@@ -1159,7 +1159,7 @@
         }
         try (IndexReader r = w.getReader()) {
           IndexSearcher indexSearcher = new IndexSearcher(r);
-          assertFalse("Query shouldn't be equal, because different index readers ",
+          assertFalse("Query shouldn't be equal, because new join values have been indexed",
               x.equals(JoinUtil.createJoinQuery(joinField, multiValued, joinField,
                   Integer.class, new TermQuery(new Term("name", "name5")),
                   indexSearcher, scoreMode1)));
