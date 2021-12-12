diff --git a/src/test/java/net/sf/jabref/logic/search/DatabaseSearcherTest.java b/src/test/java/net/sf/jabref/logic/search/DatabaseSearcherTest.java
index 7f1b7c8..0152471 100644
--- a/src/test/java/net/sf/jabref/logic/search/DatabaseSearcherTest.java
+++ b/src/test/java/net/sf/jabref/logic/search/DatabaseSearcherTest.java
@@ -98,7 +98,7 @@
         SearchQuery query = new SearchQuery("tonho", true, true);
         DatabaseSearcher databaseSearcher = new DatabaseSearcher(query, database);
 
-        assertEquals(Collections.emptyList(), databaseSearcher.getMatches());
+        assertEquals(Collections.singletonList(entry), databaseSearcher.getMatches());
     }
 
     @Test
