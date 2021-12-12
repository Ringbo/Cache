diff --git a/components/camel-http-common/src/test/java/org/apache/camel/http/common/HttpSendDynamicAwareTest.java b/components/camel-http-common/src/test/java/org/apache/camel/http/common/HttpSendDynamicAwareTest.java
index 4872957..141056a 100644
--- a/components/camel-http-common/src/test/java/org/apache/camel/http/common/HttpSendDynamicAwareTest.java
+++ b/components/camel-http-common/src/test/java/org/apache/camel/http/common/HttpSendDynamicAwareTest.java
@@ -35,7 +35,7 @@
     @Test
     public void testHttpUndefinedPortWithPathParseUri() {
         this.httpSendDynamicAware.setScheme("http");
-        DynamicAwareEntry entry = new DynamicAwareEntry("http://localhost/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("http://localhost/test", null, null, null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should not add port if http and not specified", "localhost", result[0]);
     }
@@ -43,7 +43,7 @@
     @Test
     public void testHttpsUndefinedPortParseUri() {
         this.httpSendDynamicAware.setScheme("https");
-        DynamicAwareEntry entry = new DynamicAwareEntry("https://localhost/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("https://localhost/test", null, null, null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should not add port if https and not specified", "localhost", result[0]);
     }
@@ -51,7 +51,7 @@
     @Test
     public void testHttp4UndefinedPortWithPathParseUri() {
         this.httpSendDynamicAware.setScheme("http4");
-        DynamicAwareEntry entry = new DynamicAwareEntry("http4://localhost/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("http4://localhost/test", null, null, null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should not add port if http4 and not specified", "localhost", result[0]);
     }
@@ -59,7 +59,7 @@
     @Test
     public void testHttps4UndefinedPortParseUri() {
         this.httpSendDynamicAware.setScheme("https4");
-        DynamicAwareEntry entry = new DynamicAwareEntry("https4://localhost/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("https4://localhost/test", null, null, null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should not add port if https4 and not specified", "localhost", result[0]);
     }
@@ -67,7 +67,7 @@
     @Test
     public void testHttpPort80ParseUri() {
         this.httpSendDynamicAware.setScheme("http");
-        DynamicAwareEntry entry = new DynamicAwareEntry("http://localhost:80/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("http://localhost:80/test", null, null, null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should not port if http and port 80 specified", "localhost", result[0]);
     }
@@ -75,7 +75,7 @@
     @Test
     public void testHttpsPort443ParseUri() {
         this.httpSendDynamicAware.setScheme("https");
-        DynamicAwareEntry entry = new DynamicAwareEntry("https://localhost:443/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("https://localhost:443/test", null, null,null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should not port if https and port 443 specified", "localhost", result[0]);
     }
@@ -83,7 +83,7 @@
     @Test
     public void testHttpPort8080ParseUri() {
         this.httpSendDynamicAware.setScheme("http");
-        DynamicAwareEntry entry = new DynamicAwareEntry("http://localhost:8080/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("http://localhost:8080/test", null, null, null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should add port if http and port other than 80 specified", "localhost:8080", result[0]);
     }
@@ -91,7 +91,7 @@
     @Test
     public void testHttpsPort8443ParseUri() {
         this.httpSendDynamicAware.setScheme("https");
-        DynamicAwareEntry entry = new DynamicAwareEntry("https://localhost:8443/test", null, null);
+        DynamicAwareEntry entry = new DynamicAwareEntry("https://localhost:8443/test", null, null, null);
         String[] result = httpSendDynamicAware.parseUri(entry);
         assertEquals("Parse should add port if https and port other than 443 specified", "localhost:8443", result[0]);
     }
