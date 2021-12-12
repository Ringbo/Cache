diff --git a/api/src/main/java/org/openmrs/api/db/ConceptDAO.java b/api/src/main/java/org/openmrs/api/db/ConceptDAO.java
index 2a13184..308c6ee 100644
--- a/api/src/main/java/org/openmrs/api/db/ConceptDAO.java
+++ b/api/src/main/java/org/openmrs/api/db/ConceptDAO.java
@@ -601,7 +601,7 @@
 	/**
 	 * @see ConceptService#getCountOfConceptReferenceTerms(String, ConceptSource, boolean)
 	 */
-	public Integer getCountOfConceptReferenceTerms(String query, ConceptSource conceptSource, boolean includeRetired)
+	public Long getCountOfConceptReferenceTerms(String query, ConceptSource conceptSource, boolean includeRetired)
 	        throws DAOException;
 	
 	/**
