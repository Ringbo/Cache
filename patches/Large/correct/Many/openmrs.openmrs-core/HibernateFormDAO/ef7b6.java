diff --git a/api/src/main/java/org/openmrs/api/db/hibernate/HibernateFormDAO.java b/api/src/main/java/org/openmrs/api/db/hibernate/HibernateFormDAO.java
index 2bd1dd0..9da2255 100644
--- a/api/src/main/java/org/openmrs/api/db/hibernate/HibernateFormDAO.java
+++ b/api/src/main/java/org/openmrs/api/db/hibernate/HibernateFormDAO.java
@@ -446,7 +446,7 @@
 			subquery.add(Restrictions.eqProperty("ff.form", "form"));
 			subquery.add(Restrictions.in("ff.formFieldId", anyFormFieldIds));
 			
-			crit.add(Subqueries.gt(0L, subquery));
+			crit.add(Subqueries.lt(0L, subquery));
 		}
 		
 		//select * from form where len(containingallformfields) = (select count(*) from form_field ff where ff.form_id = form_id and form_field_id in (containingallformfields);
