diff --git a/community/server/src/test/java/org/neo4j/server/rest/repr/PathRepresentationTest.java b/community/server/src/test/java/org/neo4j/server/rest/repr/PathRepresentationTest.java
index c1092f9..1288cb3 100644
--- a/community/server/src/test/java/org/neo4j/server/rest/repr/PathRepresentationTest.java
+++ b/community/server/src/test/java/org/neo4j/server/rest/repr/PathRepresentationTest.java
@@ -122,7 +122,7 @@
 
         Relationship ab = relationship( 17, a, "LOVES", b );
         Relationship cb = relationship( 18, c, "HATES", b );
-        Relationship cd = relationship( 18, c, "KNOWS", d );
+        Relationship cd = relationship( 19, c, "KNOWS", d );
 
         return new PathRepresentation<Path>(
                 path( a, link( ab, b ), link( cb, c ), link( cd, d ) ));
