diff --git a/api/src/main/java/org/openmrs/api/db/hibernate/HibernateConceptDAO.java b/api/src/main/java/org/openmrs/api/db/hibernate/HibernateConceptDAO.java
index 71d4ab5..45b1dfa 100644
--- a/api/src/main/java/org/openmrs/api/db/hibernate/HibernateConceptDAO.java
+++ b/api/src/main/java/org/openmrs/api/db/hibernate/HibernateConceptDAO.java
@@ -1815,12 +1815,12 @@
 	 * @see org.openmrs.api.db.ConceptDAO#getCountOfConceptReferenceTerms(java.lang.String, boolean)
 	 */
 	@Override
-	public Integer getCountOfConceptReferenceTerms(String query, ConceptSource conceptSource, boolean includeRetired)
+	public Long getCountOfConceptReferenceTerms(String query, ConceptSource conceptSource, boolean includeRetired)
 	        throws DAOException {
 		Criteria criteria = createConceptReferenceTermCriteria(query, conceptSource, includeRetired);
 		
 		criteria.setProjection(Projections.rowCount());
-		return (Integer) criteria.uniqueResult();
+		return (Long) criteria.uniqueResult();
 	}
 	
 	/**
