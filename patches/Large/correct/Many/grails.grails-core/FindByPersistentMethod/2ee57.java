diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindByPersistentMethod.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindByPersistentMethod.java
index 11f8fb0..ce6af7b 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindByPersistentMethod.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindByPersistentMethod.java
@@ -51,7 +51,7 @@
 	}
 
 	protected Object doInvokeInternalWithExpressions(final Class clazz, String methodName, Object[] arguments, final List expressions) {
-		return super.getHibernateTemplate().executeFind( new HibernateCallback() {
+		return super.getHibernateTemplate().execute( new HibernateCallback() {
 
 			public Object doInHibernate(Session session) throws HibernateException, SQLException {
 				Criteria crit = session.createCriteria(clazz);
