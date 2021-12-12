diff --git a/hibernate-core/src/main/java/org/hibernate/cfg/annotations/CollectionBinder.java b/hibernate-core/src/main/java/org/hibernate/cfg/annotations/CollectionBinder.java
index b62e923..0d1ca34 100644
--- a/hibernate-core/src/main/java/org/hibernate/cfg/annotations/CollectionBinder.java
+++ b/hibernate-core/src/main/java/org/hibernate/cfg/annotations/CollectionBinder.java
@@ -823,7 +823,7 @@
 					collection.addManyToManyFilter( filter.name(), getTableName(simpleFilter), getCondition( filter ) );
 				}
 				else {
-					collection.addFilter( filter.name(), getTableName(simpleFilter), getCondition( filter ) );
+					collection.addFilter( filter.name(), getTableName(filter), getCondition( filter ) );
 				}
 			}
 		}
