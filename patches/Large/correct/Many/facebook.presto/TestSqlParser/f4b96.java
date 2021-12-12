diff --git a/presto-parser/src/test/java/com/facebook/presto/sql/parser/TestSqlParser.java b/presto-parser/src/test/java/com/facebook/presto/sql/parser/TestSqlParser.java
index 499e6ab..3bf8198 100644
--- a/presto-parser/src/test/java/com/facebook/presto/sql/parser/TestSqlParser.java
+++ b/presto-parser/src/test/java/com/facebook/presto/sql/parser/TestSqlParser.java
@@ -1738,21 +1738,21 @@
                                 new Table(QualifiedName.of("t")),
                                 new Unnest(ImmutableList.of(new Identifier("a")), false),
                                 Optional.empty())));
-        assertStatement("SELECT * FROM t CROSS JOIN UNNEST(a) WITH ORDINALITY",
+        assertStatement("SELECT * FROM t CROSS JOIN UNNEST(a, b) WITH ORDINALITY",
                 simpleQuery(
                         selectList(new AllColumns()),
                         new Join(
                                 Join.Type.CROSS,
                                 new Table(QualifiedName.of("t")),
-                                new Unnest(ImmutableList.of(new Identifier("a")), true),
+                                new Unnest(ImmutableList.of(new Identifier("a"), new Identifier("b")), true),
                                 Optional.empty())));
-        assertStatement("SELECT * FROM t FULL JOIN UNNEST(a) ON true",
+        assertStatement("SELECT * FROM t FULL JOIN UNNEST(a) AS tmp (c) ON true",
                 simpleQuery(
                         selectList(new AllColumns()),
                         new Join(
                                 Join.Type.FULL,
                                 new Table(QualifiedName.of("t")),
-                                new Unnest(ImmutableList.of(new Identifier("a")), true),
+                                new AliasedRelation(new Unnest(ImmutableList.of(new Identifier("a")), false), new Identifier("tmp"), ImmutableList.of(new Identifier("c"))),
                                 Optional.of(new JoinOn(BooleanLiteral.TRUE_LITERAL)))));
     }
 
