diff --git a/src/test/org/apache/lucene/index/TestFieldInfos.java b/src/test/org/apache/lucene/index/TestFieldInfos.java
index ebad5d2..22ffe9c 100644
--- a/src/test/org/apache/lucene/index/TestFieldInfos.java
+++ b/src/test/org/apache/lucene/index/TestFieldInfos.java
@@ -31,7 +31,7 @@
     FieldInfos fieldInfos = new FieldInfos();
     fieldInfos.add(testDoc);
     //Since the complement is stored as well in the fields map
-    assertTrue(fieldInfos.size() == 7); //this is 7 b/c we are using the no-arg constructor
+    assertTrue(fieldInfos.size() == 6); //this is 6 b/c we are using the no-arg constructor
     RAMDirectory dir = new RAMDirectory();
     String name = "testFile";
     IndexOutput output = dir.createOutput(name);
