diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindWherePersistentMethod.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindWherePersistentMethod.java
index acbcd75..e5c4129 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindWherePersistentMethod.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindWherePersistentMethod.java
@@ -67,7 +67,7 @@
 		// is a valid property of the GrailsDomainClass thus hiding the Hibernate
 		// exception that will be thrown if it is not
 		
-		return super.getHibernateTemplate().executeFind( new HibernateCallback() {
+		return super.getHibernateTemplate().execute( new HibernateCallback() {
 
 			public Object doInHibernate(Session session) throws HibernateException, SQLException {
 				
