diff --git a/hibernate-core/src/main/java/org/hibernate/internal/AbstractQueryImpl.java b/hibernate-core/src/main/java/org/hibernate/internal/AbstractQueryImpl.java
index 8b76fc3..2b8b29b 100644
--- a/hibernate-core/src/main/java/org/hibernate/internal/AbstractQueryImpl.java
+++ b/hibernate-core/src/main/java/org/hibernate/internal/AbstractQueryImpl.java
@@ -222,8 +222,8 @@
 
 	@Override
 	public Query setMaxResults(int maxResults) {
-		if ( maxResults < 0 ) {
-			// treat negatives specically as meaning no limit...
+		if ( maxResults <= 0 ) {
+			// treat zero and negatives specically as meaning no limit...
 			selection.setMaxRows( null );
 		}
 		else {
