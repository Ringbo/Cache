diff --git a/javamelody-core/src/main/java/net/bull/javamelody/JpaOverridePersistenceXmlClassLoader.java b/javamelody-core/src/main/java/net/bull/javamelody/JpaOverridePersistenceXmlClassLoader.java
index 0e35030..cdeccb1 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/JpaOverridePersistenceXmlClassLoader.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/JpaOverridePersistenceXmlClassLoader.java
@@ -45,8 +45,7 @@
 	 * @param parent ClassLoader parent
 	 * @param replacement Nom de la classe du persistence provider qui doit remplacer notre persistence provider.
 	 */
-	public JpaOverridePersistenceXmlClassLoader(final ClassLoader parent,
-			final String replacement) {
+	JpaOverridePersistenceXmlClassLoader(final ClassLoader parent, final String replacement) {
 		super(parent);
 		this.replacement = replacement;
 	}
