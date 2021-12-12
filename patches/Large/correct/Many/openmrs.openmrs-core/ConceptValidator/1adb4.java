diff --git a/api/src/main/java/org/openmrs/validator/ConceptValidator.java b/api/src/main/java/org/openmrs/validator/ConceptValidator.java
index 8aa2da4..4002573 100644
--- a/api/src/main/java/org/openmrs/validator/ConceptValidator.java
+++ b/api/src/main/java/org/openmrs/validator/ConceptValidator.java
@@ -177,8 +177,8 @@
 									continue;
 								
 								//skip same
-								if (conceptToValidate.getConceptId() != null
-								        && conceptToValidate.getConceptId().equals(concept.getConceptId()))
+								if (conceptToValidate.getUuid() != null
+								        && conceptToValidate.getUuid().equals(concept.getUuid()))
 									continue;
 								
 								//should be a unique name amongst all preferred and fully specified names in its locale system wide
