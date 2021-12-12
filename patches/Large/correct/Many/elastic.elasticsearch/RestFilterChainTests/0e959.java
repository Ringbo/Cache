diff --git a/src/test/java/org/elasticsearch/rest/RestFilterChainTests.java b/src/test/java/org/elasticsearch/rest/RestFilterChainTests.java
index 3e84600..334a978 100644
--- a/src/test/java/org/elasticsearch/rest/RestFilterChainTests.java
+++ b/src/test/java/org/elasticsearch/rest/RestFilterChainTests.java
@@ -60,7 +60,7 @@
         Collections.sort(restFiltersByOrder, new Comparator<RestFilter>() {
             @Override
             public int compare(RestFilter o1, RestFilter o2) {
-                return Integer.compare(o2.order(), o1.order());
+                return Integer.compare(o1.order(), o2.order());
             }
         });
 
