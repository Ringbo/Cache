diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindPersistentMethod.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindPersistentMethod.java
index 94b6cd9..06bfabf 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindPersistentMethod.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindPersistentMethod.java
@@ -111,7 +111,7 @@
 			});						
 		}
 		if(clazz.isAssignableFrom( arg.getClass() )) {			
-			return super.getHibernateTemplate().executeFind( new HibernateCallback() {
+			return super.getHibernateTemplate().execute( new HibernateCallback() {
 
 				public Object doInHibernate(Session session) throws HibernateException, SQLException {
 					
