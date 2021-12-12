diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/ExceptionsHelper.java b/modules/elasticsearch/src/main/java/org/elasticsearch/ExceptionsHelper.java
index 1bc8ebd..4d69c57 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/ExceptionsHelper.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/ExceptionsHelper.java
@@ -33,10 +33,10 @@
         int counter = 0;
         Throwable result = t;
         while (result instanceof ElasticSearchWrapperException) {
-            if (t.getCause() == null) {
+            if (result.getCause() == null) {
                 return result;
             }
-            if (t.getCause() == t) {
+            if (result.getCause() == result) {
                 return result;
             }
             if (counter++ > 10) {
