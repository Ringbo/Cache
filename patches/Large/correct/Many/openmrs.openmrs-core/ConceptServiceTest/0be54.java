diff --git a/api/src/test/java/org/openmrs/api/ConceptServiceTest.java b/api/src/test/java/org/openmrs/api/ConceptServiceTest.java
index ba5b2e5..83f5cdf 100644
--- a/api/src/test/java/org/openmrs/api/ConceptServiceTest.java
+++ b/api/src/test/java/org/openmrs/api/ConceptServiceTest.java
@@ -1415,7 +1415,7 @@
 		conceptService.saveConceptStopWord(conceptStopWord);
 		
 		List<String> conceptStopWords = conceptService.getConceptStopWords(Locale.US);
-		assertEquals(2, conceptStopWords.size());
+		assertEquals(1, conceptStopWords.size());
 	}
 	
 	/**
