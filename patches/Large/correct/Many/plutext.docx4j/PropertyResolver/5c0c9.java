diff --git a/src/main/java/org/docx4j/model/PropertyResolver.java b/src/main/java/org/docx4j/model/PropertyResolver.java
index 51d7806..653ec27 100644
--- a/src/main/java/org/docx4j/model/PropertyResolver.java
+++ b/src/main/java/org/docx4j/model/PropertyResolver.java
@@ -1474,7 +1474,7 @@
     		result1 = true;
     	} else {
     		
-    		log.error("Expected " + s.getStyleId() + " to have <w:basedOn ??");
+    		log.warn("Expected " + s.getStyleId() + " to have <w:basedOn ??");
     		// Not properly activated
     		result1 = false;
     	}
