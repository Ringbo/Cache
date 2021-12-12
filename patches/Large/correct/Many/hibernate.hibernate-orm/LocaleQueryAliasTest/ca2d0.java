diff --git a/hibernate-core/src/test/java/org/hibernate/test/locale/LocaleQueryAliasTest.java b/hibernate-core/src/test/java/org/hibernate/test/locale/LocaleQueryAliasTest.java
index f9d5f04..0a22eea 100644
--- a/hibernate-core/src/test/java/org/hibernate/test/locale/LocaleQueryAliasTest.java
+++ b/hibernate-core/src/test/java/org/hibernate/test/locale/LocaleQueryAliasTest.java
@@ -51,7 +51,7 @@
 		
 		QueryTranslatorFactory ast = new ASTQueryTranslatorFactory();
 		QueryTranslator queryTranslator = ast.createQueryTranslator(
-				hql, hql, Collections.EMPTY_MAP, sessionFactory() );
+				hql, hql, Collections.EMPTY_MAP, sessionFactory(), null );
 		queryTranslator.compile( Collections.EMPTY_MAP, false );
 		String sql = queryTranslator.getSQLString();
 		
