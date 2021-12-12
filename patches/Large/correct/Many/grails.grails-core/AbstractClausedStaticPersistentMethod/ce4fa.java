diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/AbstractClausedStaticPersistentMethod.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/AbstractClausedStaticPersistentMethod.java
index 6a17147..53dca87 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/AbstractClausedStaticPersistentMethod.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/metaclass/AbstractClausedStaticPersistentMethod.java
@@ -102,7 +102,7 @@
 			else if(queryParameter.endsWith( GREATER_THAN_OR_EQUAL )) {
 				return new GrailsMethodExpression( calcPropertyName(queryParameter, GREATER_THAN_OR_EQUAL),GREATER_THAN_OR_EQUAL, 1,isNegation(queryParameter, GREATER_THAN_OR_EQUAL) ) {
 					Criterion createCriterion() {
-						return Expression.gt( this.propertyName, arguments[0] );
+						return Expression.ge( this.propertyName, arguments[0] );
 					}
 					
 				};
