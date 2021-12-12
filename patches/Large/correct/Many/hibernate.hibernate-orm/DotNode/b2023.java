diff --git a/hibernate-core/src/main/java/org/hibernate/hql/internal/ast/tree/DotNode.java b/hibernate-core/src/main/java/org/hibernate/hql/internal/ast/tree/DotNode.java
index 1f7a4b2..289bcae 100644
--- a/hibernate-core/src/main/java/org/hibernate/hql/internal/ast/tree/DotNode.java
+++ b/hibernate-core/src/main/java/org/hibernate/hql/internal/ast/tree/DotNode.java
@@ -683,7 +683,7 @@
 				return null;
 			}
 			// If the lhs is a collection, use CollectionPropertyMapping
-			Type propertyType = fromElement.getPropertyType( propertyName, propertyPath );
+			Type propertyType = fromElement.getPropertyType( propertyPath, propertyPath );
 			LOG.debugf( "getDataType() : %s -> %s", propertyPath, propertyType );
 			super.setDataType( propertyType );
 		}
