diff --git a/api/src/main/java/org/openmrs/ConceptNumeric.java b/api/src/main/java/org/openmrs/ConceptNumeric.java
index e483f60..6450dd8 100644
--- a/api/src/main/java/org/openmrs/ConceptNumeric.java
+++ b/api/src/main/java/org/openmrs/ConceptNumeric.java
@@ -108,7 +108,7 @@
 		
 		this.setConceptSets(new TreeSet<ConceptSet>(c.getConceptSets()));
 		for (ConceptSet cSet : this.getConceptSets()) {
-			cSet.setConcept(this);
+			cSet.setConceptSet(this);
 		}
 		
 		this.setDescriptions(new HashSet<ConceptDescription>(c.getDescriptions()));
