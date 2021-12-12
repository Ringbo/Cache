diff --git a/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java b/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java
index 4fe0d16..6e76612 100644
--- a/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java
+++ b/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java
@@ -3401,7 +3401,7 @@
 			Selection selection,
 			QueryOptions queryOptions) {
 		try {
-			final QueryImplementor query = createQuery( jpaqlString, resultClass );
+			final QueryImplementor query = createQuery( jpaqlString );
 
 			if ( queryOptions.getValueHandlers() == null ) {
 				if ( queryOptions.getResultMetadataValidator() != null ) {
