diff --git a/src/test/java/org/elasticsearch/test/ElasticsearchTestCase.java b/src/test/java/org/elasticsearch/test/ElasticsearchTestCase.java
index 61f2106..d63e321 100644
--- a/src/test/java/org/elasticsearch/test/ElasticsearchTestCase.java
+++ b/src/test/java/org/elasticsearch/test/ElasticsearchTestCase.java
@@ -166,7 +166,7 @@
                 if (!w.successfullyClosed()) {
                     if (w.closeException() == null) {
                         w.close();
-                        if (w.closeException() == null) {
+                        if (w.closeException() != null) {
                             throw w.closeException();
                         }
                     } else {
