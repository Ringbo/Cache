diff --git a/community/embedded-examples/src/test/java/org/neo4j/examples/AclExampleTest.java b/community/embedded-examples/src/test/java/org/neo4j/examples/AclExampleTest.java
index 605b4dc..803178d 100644
--- a/community/embedded-examples/src/test/java/org/neo4j/examples/AclExampleTest.java
+++ b/community/embedded-examples/src/test/java/org/neo4j/examples/AclExampleTest.java
@@ -186,7 +186,7 @@
         String query = "start root=node:node_auto_index(name = 'FileRoot') match root-[:contains*0..]->(parentDir)-[:leaf]->file return file";
         gen.get().addSnippet( "query1", createCypherSnippet( query ) );
         String result = engine.execute( query )
-                .toString();
+                .dumpToString();
         assertTrue( result.contains("File1") );
         gen.get()
                 .addSnippet( "result1", createQueryResultSnippet( result ) );
@@ -195,7 +195,7 @@
         query = "start root=node:node_auto_index(name = 'FileRoot') match root-[:contains*0..]->()-[:leaf]->file<-[:owns]-user return file, user";
         gen.get().addSnippet( "query2", createCypherSnippet( query ) );
         result = engine.execute( query )
-                .toString();
+                .dumpToString();
         assertTrue( result.contains("File1") );
         assertTrue( result.contains("User1") );
         assertTrue( result.contains("User2") );
@@ -212,7 +212,7 @@
         		"RETURN file.name, dir.name, role.name, readUser.name";
         gen.get().addSnippet( "query3", createCypherSnippet( query ) );
         result = engine.execute( query )
-                .toString();
+                .dumpToString();
         assertTrue( result.contains("File1") );
         assertTrue( result.contains("File2") );
         assertTrue( result.contains("Admin1") );
