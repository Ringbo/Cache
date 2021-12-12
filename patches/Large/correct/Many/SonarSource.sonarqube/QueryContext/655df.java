diff --git a/server/sonar-server/src/main/java/org/sonar/server/search/QueryContext.java b/server/sonar-server/src/main/java/org/sonar/server/search/QueryContext.java
index 6dada64..233a8cd 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/search/QueryContext.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/search/QueryContext.java
@@ -127,7 +127,7 @@
    * Limit on the number of results to return. Defaults to {@link #DEFAULT_LIMIT}.
    */
   public int getLimit() {
-    return showFullResult ? 999999 : limit;
+    return showFullResult ? 999_999 : limit;
   }
 
   /**
