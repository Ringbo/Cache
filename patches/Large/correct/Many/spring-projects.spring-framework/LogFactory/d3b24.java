diff --git a/spring-jcl/src/main/java/org/apache/commons/logging/LogFactory.java b/spring-jcl/src/main/java/org/apache/commons/logging/LogFactory.java
index 0484350..468ba56 100644
--- a/spring-jcl/src/main/java/org/apache/commons/logging/LogFactory.java
+++ b/spring-jcl/src/main/java/org/apache/commons/logging/LogFactory.java
@@ -64,7 +64,7 @@
 	 * @param name logical name of the <code>Log</code> instance to be returned
 	 */
 	public static Log getLog(String name) {
-		return LogDelegate.createLog(name);
+		return LogAdapter.createLog(name);
 	}
 
 
