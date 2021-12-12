diff --git a/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java b/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java
index 24289e2..3be6669 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java
@@ -245,7 +245,7 @@
     }
   }
 
-  private void configurePagination(SearchOptions options, SearchRequestBuilder esSearch) {
+  private static void configurePagination(SearchOptions options, SearchRequestBuilder esSearch) {
     esSearch.setFrom(options.getOffset()).setSize(options.getLimit());
   }
 
