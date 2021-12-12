diff --git a/src/main/java/org/docx4j/samples/AbstractSample.java b/src/main/java/org/docx4j/samples/AbstractSample.java
index 91bdf21..941c3de 100644
--- a/src/main/java/org/docx4j/samples/AbstractSample.java
+++ b/src/main/java/org/docx4j/samples/AbstractSample.java
@@ -16,7 +16,7 @@
 
 		if (args.length<2) throw new IllegalArgumentException("Output file arg missing");
 
-		outputfilepath = args[0];
+		outputfilepath = args[1];
 	}
 	
 
