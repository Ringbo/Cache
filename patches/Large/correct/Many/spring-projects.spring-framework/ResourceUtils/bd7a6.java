diff --git a/spring-core/src/main/java/org/springframework/util/ResourceUtils.java b/spring-core/src/main/java/org/springframework/util/ResourceUtils.java
index b9dc3bd..b2041a9 100644
--- a/spring-core/src/main/java/org/springframework/util/ResourceUtils.java
+++ b/spring-core/src/main/java/org/springframework/util/ResourceUtils.java
@@ -336,7 +336,7 @@
 	 * @param con the URLConnection to set the flag on
 	 */
 	public static void useCachesIfNecessary(URLConnection con) {
-		con.setUseCaches(con.getClass().getName().startsWith("JNLP"));
+		con.setUseCaches(con.getClass().getSimpleName().startsWith("JNLP"));
 	}
 
 }
