diff --git a/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java b/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java
index 0db77c0..6b73488 100644
--- a/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java
+++ b/hibernate-core/src/main/java/org/hibernate/internal/SessionImpl.java
@@ -2346,7 +2346,7 @@
 		log.tracef( "SessionImpl#afterTransactionCompletion(successful=%s, delayed=%s)", successful, delayed );
 
 		if ( !isClosed() ) {
-			if ( autoClear ) {
+			if ( autoClear ||!successful ) {
 				internalClear();
 			}
 		}
