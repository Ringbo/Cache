diff --git a/src/test/java/org/elasticsearch/test/unit/index/mapper/all/SimpleAllMapperTests.java b/src/test/java/org/elasticsearch/test/unit/index/mapper/all/SimpleAllMapperTests.java
index 36b8a41..c8d9ad0 100644
--- a/src/test/java/org/elasticsearch/test/unit/index/mapper/all/SimpleAllMapperTests.java
+++ b/src/test/java/org/elasticsearch/test/unit/index/mapper/all/SimpleAllMapperTests.java
@@ -51,7 +51,7 @@
         byte[] json = copyToBytesFromClasspath("/org/elasticsearch/test/unit/index/mapper/all/test1.json");
         Document doc = docMapper.parse(new BytesArray(json)).rootDoc();
         AllField field = (AllField) doc.getField("_all");
-        AllEntries allEntries = ((AllTokenStream) field.tokenStreamValue()).allEntries();
+        AllEntries allEntries = ((AllTokenStream) field.tokenStream(docMapper.mappers().indexAnalyzer())).allEntries();
         assertThat(allEntries.fields().size(), equalTo(3));
         assertThat(allEntries.fields().contains("address.last.location"), equalTo(true));
         assertThat(allEntries.fields().contains("name.last"), equalTo(true));
@@ -67,7 +67,7 @@
         byte[] json = copyToBytesFromClasspath("/org/elasticsearch/test/unit/index/mapper/all/test1.json");
         Document doc = docMapper.parse(new BytesArray(json)).rootDoc();
         AllField field = (AllField) doc.getField("_all");
-        AllEntries allEntries = ((AllTokenStream) field.tokenStreamValue()).allEntries();
+        AllEntries allEntries = ((AllTokenStream) field.tokenStream(docMapper.mappers().indexAnalyzer())).allEntries();
         assertThat(allEntries.fields().size(), equalTo(3));
         assertThat(allEntries.fields().contains("address.last.location"), equalTo(true));
         assertThat(allEntries.fields().contains("name.last"), equalTo(true));
@@ -83,7 +83,7 @@
         byte[] json = copyToBytesFromClasspath("/org/elasticsearch/test/unit/index/mapper/all/test1.json");
         Document doc = docMapper.parse(new BytesArray(json)).rootDoc();
         AllField field = (AllField) doc.getField("_all");
-        AllEntries allEntries = ((AllTokenStream) field.tokenStreamValue()).allEntries();
+        AllEntries allEntries = ((AllTokenStream) field.tokenStream(docMapper.mappers().indexAnalyzer())).allEntries();
         assertThat(allEntries.fields().size(), equalTo(3));
         assertThat(allEntries.fields().contains("address.last.location"), equalTo(true));
         assertThat(allEntries.fields().contains("name.last"), equalTo(true));
@@ -106,7 +106,7 @@
         Document doc = builtDocMapper.parse(new BytesArray(json)).rootDoc();
 
         AllField field = (AllField) doc.getField("_all");
-        AllEntries allEntries = ((AllTokenStream) field.tokenStreamValue()).allEntries();
+        AllEntries allEntries = ((AllTokenStream) field.tokenStream(docMapper.mappers().indexAnalyzer())).allEntries();
         assertThat(allEntries.fields().size(), equalTo(3));
         assertThat(allEntries.fields().contains("address.last.location"), equalTo(true));
         assertThat(allEntries.fields().contains("name.last"), equalTo(true));
@@ -120,7 +120,7 @@
         byte[] json = copyToBytesFromClasspath("/org/elasticsearch/test/unit/index/mapper/all/test1.json");
         Document doc = docMapper.parse(new BytesArray(json)).rootDoc();
         AllField field = (AllField) doc.getField("_all");
-        AllEntries allEntries = ((AllTokenStream) field.tokenStreamValue()).allEntries();
+        AllEntries allEntries = ((AllTokenStream) field.tokenStream(docMapper.mappers().indexAnalyzer())).allEntries();
         assertThat(allEntries.fields().size(), equalTo(2));
         assertThat(allEntries.fields().contains("name.last"), equalTo(true));
         assertThat(allEntries.fields().contains("simple1"), equalTo(true));
@@ -141,7 +141,7 @@
         Document doc = builtDocMapper.parse(new BytesArray(json)).rootDoc();
 
         AllField field = (AllField) doc.getField("_all");
-        AllEntries allEntries = ((AllTokenStream) field.tokenStreamValue()).allEntries();
+        AllEntries allEntries = ((AllTokenStream) field.tokenStream(docMapper.mappers().indexAnalyzer())).allEntries();
         assertThat(allEntries.fields().size(), equalTo(2));
         assertThat(allEntries.fields().contains("name.last"), equalTo(true));
         assertThat(allEntries.fields().contains("simple1"), equalTo(true));
