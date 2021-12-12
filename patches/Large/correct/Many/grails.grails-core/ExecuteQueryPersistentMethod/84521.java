diff --git a/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/metaclass/ExecuteQueryPersistentMethod.java b/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/metaclass/ExecuteQueryPersistentMethod.java
index c46bb78..bd9f9ed 100644
--- a/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/metaclass/ExecuteQueryPersistentMethod.java
+++ b/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/metaclass/ExecuteQueryPersistentMethod.java
@@ -99,7 +99,7 @@
                 }
                 if (queryMetaParams.containsKey(GrailsHibernateUtil.ARGUMENT_TIMEOUT)) {
                     Integer timeoutParam = converter.convertIfNecessary(queryMetaParams.get(GrailsHibernateUtil.ARGUMENT_TIMEOUT), Integer.class);
-                    q.setFetchSize(timeoutParam.intValue());
+                    q.setTimeout(timeoutParam.intValue());
                 }
                 if (queryMetaParams.containsKey(GrailsHibernateUtil.ARGUMENT_READ_ONLY)) {
                     q.setReadOnly(((Boolean) queryMetaParams.get(GrailsHibernateUtil.ARGUMENT_READ_ONLY)).booleanValue());
