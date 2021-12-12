diff --git a/hibernate-envers/src/main/java/org/hibernate/envers/internal/synchronization/AuditProcess.java b/hibernate-envers/src/main/java/org/hibernate/envers/internal/synchronization/AuditProcess.java
index 52a7dc1..5954244 100644
--- a/hibernate-envers/src/main/java/org/hibernate/envers/internal/synchronization/AuditProcess.java
+++ b/hibernate-envers/src/main/java/org/hibernate/envers/internal/synchronization/AuditProcess.java
@@ -134,7 +134,7 @@
 		}
 
 		// see: http://www.jboss.com/index.html?module=bb&op=viewtopic&p=4178431
-		if ( FlushModeType.COMMIT.equals( session.getFlushMode() ) ) {
+		if ( FlushModeType.COMMIT.equals( session.getFlushMode() ) || session.isClosed() ) {
 			Session temporarySession = null;
 			try {
 				temporarySession = session.sessionWithOptions()
