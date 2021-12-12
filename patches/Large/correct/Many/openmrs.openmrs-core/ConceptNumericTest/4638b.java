diff --git a/api/src/test/java/org/openmrs/ConceptNumericTest.java b/api/src/test/java/org/openmrs/ConceptNumericTest.java
index 7342857..5e1e47b 100644
--- a/api/src/test/java/org/openmrs/ConceptNumericTest.java
+++ b/api/src/test/java/org/openmrs/ConceptNumericTest.java
@@ -75,7 +75,7 @@
 		ConceptNumeric cn = new ConceptNumeric(c);
 		
 		for (ConceptSet cSet : cn.getConceptSets()) {
-			Assert.assertSame(cn, cSet.getConcept());
+			Assert.assertSame(cn, cSet.getConceptSet());
 		}
 	}
 	
