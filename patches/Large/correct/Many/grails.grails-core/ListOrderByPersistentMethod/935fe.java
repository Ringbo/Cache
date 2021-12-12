diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ListOrderByPersistentMethod.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ListOrderByPersistentMethod.java
index 27a0cd2..002b01d 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ListOrderByPersistentMethod.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/ListOrderByPersistentMethod.java
@@ -55,7 +55,7 @@
 				
 				Criteria crit = session.createCriteria(clazz);
 				
-				if(arguments.length > 0) {
+				if(arguments != null && arguments.length > 0) {
 					if(arguments[0] instanceof Map) {
 						Map argMap = (Map)arguments[0];
 						argMap.put(ARGUMENT_SORT,propertyName);
