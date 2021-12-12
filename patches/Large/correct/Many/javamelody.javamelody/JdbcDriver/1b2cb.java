diff --git a/javamelody-core/src/main/java/net/bull/javamelody/JdbcDriver.java b/javamelody-core/src/main/java/net/bull/javamelody/JdbcDriver.java
index 81fae00..f65187c 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/JdbcDriver.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/JdbcDriver.java
@@ -70,7 +70,10 @@
 			return null;
 		}
 		try {
-			Class.forName(proxiedDriver);
+			// on utilise Thread.currentThread().getContextClassLoader() car le driver peut ne pas être
+			// dans le même classLoader que les classes de javamelody
+			Class.forName(proxiedDriver, true, Thread.currentThread().getContextClassLoader());
+			// et non Class.forName(proxiedDriver);
 		} catch (final ClassNotFoundException e) {
 			// Rq: le constructeur de SQLException avec message et cause n'existe qu'en jdk 1.6
 			final SQLException ex = new SQLException(e.getMessage());
