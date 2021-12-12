diff --git a/community/cypher/src/test/java/org/neo4j/cypher/javacompat/IntroExamplesTest.java b/community/cypher/src/test/java/org/neo4j/cypher/javacompat/IntroExamplesTest.java
index b1a4bf9..dc200c9 100644
--- a/community/cypher/src/test/java/org/neo4j/cypher/javacompat/IntroExamplesTest.java
+++ b/community/cypher/src/test/java/org/neo4j/cypher/javacompat/IntroExamplesTest.java
@@ -67,7 +67,7 @@
                 createCypherSnippet( query ) ) );
         fw.append( "\nResulting in:\n\n" );
         fw.append( AsciiDocGenerator.dumpToSeparateFileWithType( new File("target/docs/dev/"), "intro.result",
-                createQueryResultSnippet( engine.execute( query  ).toString() ) ) );
+                createQueryResultSnippet( engine.execute( query  ).dumpToString() ) ) );
 
         fw.append( "\nNext up we will add filtering to set more parts "
                    + "in motion:\n\nIn this next example, we take a list of users "
@@ -90,7 +90,7 @@
                 createCypherSnippet( query ) ) );
         fw.append( "\nResulting in:\n\n" );
         fw.append( AsciiDocGenerator.dumpToSeparateFileWithType( new File("target/docs/dev/"), "intro.result",
-                createQueryResultSnippet( engine.execute( query ).toString() ) ) );
+                createQueryResultSnippet( engine.execute( query ).dumpToString() ) ) );
         fw.close();
     }
 
