diff --git a/community/embedded-examples/src/test/java/org/neo4j/examples/RolesTest.java b/community/embedded-examples/src/test/java/org/neo4j/examples/RolesTest.java
index e3b0364..ca3fc92 100644
--- a/community/embedded-examples/src/test/java/org/neo4j/examples/RolesTest.java
+++ b/community/embedded-examples/src/test/java/org/neo4j/examples/RolesTest.java
@@ -192,7 +192,7 @@
                        + ") match admins<-[:PART_OF*0..]-group<-[:MEMBER_OF]-user return user.name, group.name";
         gen.get().addSnippet( "query-get-admins", createCypherSnippet( query ) );
         String result = engine.execute( query )
-                .toString();
+                .dumpToString();
         assertTrue( result.contains("Engin") );
         gen.get().addSnippet( "o-query-get-admins", createQueryResultSnippet( result ) );
         
@@ -212,7 +212,7 @@
                 + ") match jale-[:MEMBER_OF]->()-[:PART_OF*0..]->group return group.name";
         gen.get().addSnippet( "query-get-user-memberships", createCypherSnippet( query ) );
         result = engine.execute( query )
-                .toString();
+                .dumpToString();
         assertTrue( result.contains("Users") );
         gen.get()
                 .addSnippet( "o-query-get-user-memberships",
@@ -234,7 +234,7 @@
                 + ") match refNode<-[:ROOT]->()<-[:PART_OF*0..]-group return group.name";
         gen.get().addSnippet( "query-get-groups", createCypherSnippet( query ) );
         result = engine.execute( query )
-                .toString();
+                .dumpToString();
         assertTrue( result.contains("Users") );
         gen.get()
                 .addSnippet( "o-query-get-groups",
@@ -270,7 +270,7 @@
         		"order by min(length(p)), user.name";
         gen.get().addSnippet( "query-get-members", createCypherSnippet( query ) );
         result = engine.execute( query )
-                .toString();
+                .dumpToString();
         assertTrue( result.contains("Engin") );
         gen.get()
                 .addSnippet( "o-query-get-members",
