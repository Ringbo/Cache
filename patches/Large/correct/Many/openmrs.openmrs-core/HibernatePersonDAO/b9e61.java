diff --git a/src/api/org/openmrs/api/db/hibernate/HibernatePersonDAO.java b/src/api/org/openmrs/api/db/hibernate/HibernatePersonDAO.java
index bb087c2..d34479e 100644
--- a/src/api/org/openmrs/api/db/hibernate/HibernatePersonDAO.java
+++ b/src/api/org/openmrs/api/db/hibernate/HibernatePersonDAO.java
@@ -355,7 +355,7 @@
 			criteria.add(Expression.eq("foreignKey", foreignKey));
 		
 		if (searchable != null)
-			criteria.add(Expression.eq("searchable", format));
+			criteria.add(Expression.eq("searchable", searchable));
 		
 		return criteria.list();
 	}
