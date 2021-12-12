diff --git a/src/main/java/org/docx4j/openpackaging/parts/WordprocessingML/MainDocumentPartMceIgnorableHelper.java b/src/main/java/org/docx4j/openpackaging/parts/WordprocessingML/MainDocumentPartMceIgnorableHelper.java
index 98e9dbc..61d11ac 100644
--- a/src/main/java/org/docx4j/openpackaging/parts/WordprocessingML/MainDocumentPartMceIgnorableHelper.java
+++ b/src/main/java/org/docx4j/openpackaging/parts/WordprocessingML/MainDocumentPartMceIgnorableHelper.java
@@ -92,7 +92,11 @@
 				
 				String uuid = java.util.UUID.randomUUID().toString();
 				// That's 32 digits, but 8'll do nicely
-				uuid = uuid.replace("-", "").substring(0, 8);
+				/*
+				* 8 can create a number too large - using 7
+				* Bob Fleischman - July 24, 2014
+				*/
+				uuid = uuid.replace("-", "").substring(0, 7);
 				
 				p.setParaId(uuid);
 				p.setTextId(uuid);
