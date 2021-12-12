diff --git a/components/camel-http/src/test/java/org/apache/camel/component/http/HttpProducerSelectMethodTest.java b/components/camel-http/src/test/java/org/apache/camel/component/http/HttpProducerSelectMethodTest.java
index 886e9c8..0551ead 100644
--- a/components/camel-http/src/test/java/org/apache/camel/component/http/HttpProducerSelectMethodTest.java
+++ b/components/camel-http/src/test/java/org/apache/camel/component/http/HttpProducerSelectMethodTest.java
@@ -169,7 +169,7 @@
         private String name;
         private String queryString;
 
-        public MyHttpProducer(HttpEndpoint endpoint, String name, String queryString) {
+        MyHttpProducer(HttpEndpoint endpoint, String name, String queryString) {
             super(endpoint);
             this.name = name;
             this.queryString = queryString;
