diff --git a/core/src/main/java/org/elasticsearch/bootstrap/Elasticsearch.java b/core/src/main/java/org/elasticsearch/bootstrap/Elasticsearch.java
index 21910e5..68c6051 100644
--- a/core/src/main/java/org/elasticsearch/bootstrap/Elasticsearch.java
+++ b/core/src/main/java/org/elasticsearch/bootstrap/Elasticsearch.java
@@ -24,7 +24,7 @@
  */
 public class Elasticsearch extends Bootstrap {
 
-    public static void main(String[] args) throws Throwable {
+    public static void main(String[] args) throws StartupError {
         Bootstrap.main(args);
     }
 }
\ No newline at end of file
