diff --git a/src/test/org/apache/lucene/search/TestDateFilter.java b/src/test/org/apache/lucene/search/TestDateFilter.java
index 3a65559..fdc31bc 100644
--- a/src/test/org/apache/lucene/search/TestDateFilter.java
+++ b/src/test/org/apache/lucene/search/TestDateFilter.java
@@ -155,7 +155,7 @@
 
  	Document doc = new Document();
  	// add time that is in the future
- 	doc.add(Field.Keyword("datefield", DateField.timeToString(now - 888888)));
+ 	doc.add(Field.Keyword("datefield", DateField.timeToString(now + 888888)));
  	doc.add(Field.Text("body", "Today is a very sunny day in New York City"));
   	writer.addDocument(doc);
  	writer.optimize();
