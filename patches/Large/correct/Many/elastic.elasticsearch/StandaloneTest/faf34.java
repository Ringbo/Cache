diff --git a/src/test/java/org/elasticsearch/plugin/mapper/attachments/test/StandaloneTest.java b/src/test/java/org/elasticsearch/plugin/mapper/attachments/test/StandaloneTest.java
index 9db128b..c7c3c68 100644
--- a/src/test/java/org/elasticsearch/plugin/mapper/attachments/test/StandaloneTest.java
+++ b/src/test/java/org/elasticsearch/plugin/mapper/attachments/test/StandaloneTest.java
@@ -115,7 +115,7 @@
 
             terminal.println("## Extracted text");
             terminal.println("--------------------- BEGIN -----------------------");
-            terminal.println(doc.get(docMapper.mappers().smartName("file").mapper().names().indexName()));
+            terminal.println("%s", doc.get(docMapper.mappers().smartName("file").mapper().names().indexName()));
             terminal.println("---------------------- END ------------------------");
             terminal.println("## Metadata");
             printMetadataContent(doc, AttachmentMapper.FieldNames.AUTHOR);
