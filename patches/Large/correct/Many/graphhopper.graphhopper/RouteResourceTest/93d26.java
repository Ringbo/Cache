diff --git a/web/src/test/java/com/graphhopper/http/resources/RouteResourceTest.java b/web/src/test/java/com/graphhopper/http/resources/RouteResourceTest.java
index f287215..fb5cd54 100644
--- a/web/src/test/java/com/graphhopper/http/resources/RouteResourceTest.java
+++ b/web/src/test/java/com/graphhopper/http/resources/RouteResourceTest.java
@@ -246,7 +246,7 @@
         int firstLink = edgeIds.get(0).get(2).asInt();
         int lastLink = edgeIds.get(edgeIds.size() - 1).get(2).asInt();
         assertEquals(880, firstLink);
-        assertEquals(1419, lastLink);
+        assertEquals(1420, lastLink);
     }
 
     @Test
