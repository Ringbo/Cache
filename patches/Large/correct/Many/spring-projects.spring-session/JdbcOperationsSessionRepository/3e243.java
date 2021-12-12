diff --git a/spring-session/src/main/java/org/springframework/session/jdbc/JdbcOperationsSessionRepository.java b/spring-session/src/main/java/org/springframework/session/jdbc/JdbcOperationsSessionRepository.java
index cf5f348..28b2e8b 100644
--- a/spring-session/src/main/java/org/springframework/session/jdbc/JdbcOperationsSessionRepository.java
+++ b/spring-session/src/main/java/org/springframework/session/jdbc/JdbcOperationsSessionRepository.java
@@ -658,7 +658,7 @@
 		}
 
 		JdbcSession(ExpiringSession delegate) {
-			Assert.notNull("ExpiringSession cannot be null");
+			Assert.notNull(delegate, "ExpiringSession cannot be null");
 			this.delegate = delegate;
 		}
 
