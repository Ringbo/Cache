diff --git a/src/main/java/org/docx4j/openpackaging/io3/Load3.java b/src/main/java/org/docx4j/openpackaging/io3/Load3.java
index 00cca40..47799e9 100644
--- a/src/main/java/org/docx4j/openpackaging/io3/Load3.java
+++ b/src/main/java/org/docx4j/openpackaging/io3/Load3.java
@@ -166,7 +166,7 @@
 		// 6.
 		registerCustomXmlDataStorageParts(p);
 		
-		partStore.finishLoad();
+		partStore.finishSave();
 		
 		long endTime = System.currentTimeMillis();
 		log.info("package read;  elapsed time: " + Math.round((endTime-startTime)) + " ms" );
