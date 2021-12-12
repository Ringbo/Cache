diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindAllPersistentMethod.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindAllPersistentMethod.java
index 5dd5ec6..4db387e 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindAllPersistentMethod.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/FindAllPersistentMethod.java
@@ -233,7 +233,7 @@
 					Criteria crit = session.createCriteria(clazz);
 					crit.add(example);
 
-                    if(arguments.length > 1 && arguments[0] instanceof Map) {
+                    if(arguments.length > 1 && arguments[1] instanceof Map) {
                         GrailsHibernateUtil.populateArgumentsForCriteria(crit, (Map)arguments[1] );
                     }
 
