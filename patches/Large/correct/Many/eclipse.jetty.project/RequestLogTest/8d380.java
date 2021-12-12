diff --git a/jetty-server/src/test/java/org/eclipse/jetty/server/handler/RequestLogTest.java b/jetty-server/src/test/java/org/eclipse/jetty/server/handler/RequestLogTest.java
index 4e575e8..bc6b8cc 100644
--- a/jetty-server/src/test/java/org/eclipse/jetty/server/handler/RequestLogTest.java
+++ b/jetty-server/src/test/java/org/eclipse/jetty/server/handler/RequestLogTest.java
@@ -70,7 +70,7 @@
     @Test
     public void testNotHandled() throws Exception
     {
-        _connector.getResponses("GET /foo HTTP/1.0\n\n");
+        _connector.getResponse("GET /foo HTTP/1.0\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET /foo HTTP/1.0\" 404 "));
     }
@@ -78,17 +78,17 @@
     @Test
     public void testRequestLine() throws Exception
     {
-        _connector.getResponses("GET /foo?data=1 HTTP/1.0\nhost: host:80\n\n");
+        _connector.getResponse("GET /foo?data=1 HTTP/1.0\nhost: host:80\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         // TODO should be without host (https://bugs.eclipse.org/bugs/show_bug.cgi?id=480276)
         // assertThat(log,containsString("GET /foo?data=1 HTTP/1.0\" 200 "));
         assertThat(log,containsString("GET //host:80/foo?data=1 HTTP/1.0\" 200 "));
         
-        _connector.getResponses("GET //bad/foo?data=1 HTTP/1.0\n\n");
+        _connector.getResponse("GET //bad/foo?data=1 HTTP/1.0\n\n");
         log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET //bad/foo?data=1 HTTP/1.0\" 200 "));
                 
-        _connector.getResponses("GET http://host:80/foo?data=1 HTTP/1.0\n\n");
+        _connector.getResponse("GET http://host:80/foo?data=1 HTTP/1.0\n\n");
         log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET http://host:80/foo?data=1 HTTP/1.0\" 200 "));   
     }
@@ -96,7 +96,7 @@
     @Test
     public void testSmallData() throws Exception
     {
-        _connector.getResponses("GET /foo?data=42 HTTP/1.0\n\n");
+        _connector.getResponse("GET /foo?data=42 HTTP/1.0\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET /foo?"));
         assertThat(log,containsString(" 200 42 "));
@@ -105,7 +105,7 @@
     @Test
     public void testBigData() throws Exception
     {
-        _connector.getResponses("GET /foo?data=102400 HTTP/1.0\n\n");
+        _connector.getResponse("GET /foo?data=102400 HTTP/1.0\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET /foo?"));
         assertThat(log,containsString(" 200 102400 "));
@@ -114,7 +114,7 @@
     @Test
     public void testStatus() throws Exception
     {
-        _connector.getResponses("GET /foo?status=206 HTTP/1.0\n\n");
+        _connector.getResponse("GET /foo?status=206 HTTP/1.0\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET /foo?"));
         assertThat(log,containsString(" 206 0 "));
@@ -123,7 +123,7 @@
     @Test
     public void testStatusData() throws Exception
     {
-        _connector.getResponses("GET /foo?status=206&data=42 HTTP/1.0\n\n");
+        _connector.getResponse("GET /foo?status=206&data=42 HTTP/1.0\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET /foo?"));
         assertThat(log,containsString(" 206 42 "));
@@ -132,7 +132,7 @@
     @Test
     public void testBadRequest() throws Exception
     {
-        _connector.getResponses("XXXXXXXXXXXX\n\n");
+        _connector.getResponse("XXXXXXXXXXXX\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("\"- - -\""));
         assertThat(log,containsString(" 400 0 "));
@@ -141,7 +141,7 @@
     @Test
     public void testBadCharacter() throws Exception
     {
-        _connector.getResponses("METHOD /f\00o HTTP/1.0\n\n");
+        _connector.getResponse("METHOD /f\00o HTTP/1.0\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("\"- - -\""));
         assertThat(log,containsString(" 400 0 "));
@@ -150,7 +150,7 @@
     @Test
     public void testBadVersion() throws Exception
     {
-        _connector.getResponses("METHOD /foo HTTP/9\n\n");
+        _connector.getResponse("METHOD /foo HTTP/9\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("\"- - -\""));
         assertThat(log,containsString(" 400 0 "));
@@ -162,7 +162,7 @@
         char[] chars = new char[10000];
         Arrays.fill(chars,'o');
         String ooo = new String(chars);
-        _connector.getResponses("METHOD /f"+ooo+" HTTP/1.0\n\n");
+        _connector.getResponse("METHOD /f"+ooo+" HTTP/1.0\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("\"- - -\""));
         assertThat(log,containsString(" 414 0 "));
@@ -174,7 +174,7 @@
         char[] chars = new char[10000];
         Arrays.fill(chars,'o');
         String ooo = new String(chars);
-        _connector.getResponses("METHOD /foo HTTP/1.0\name: f+"+ooo+"\n\n");
+        _connector.getResponse("METHOD /foo HTTP/1.0\name: f+"+ooo+"\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("\"METHOD /foo HTTP/1.0\""));
         assertThat(log,containsString(" 431 0 "));
@@ -183,7 +183,7 @@
     @Test
     public void testBadRequestNoHost() throws Exception
     {
-        _connector.getResponses("GET /foo HTTP/1.1\n\n");
+        _connector.getResponse("GET /foo HTTP/1.1\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET /foo "));
         assertThat(log,containsString(" 400 0 "));
@@ -192,7 +192,7 @@
     @Test
     public void testUseragentWithout() throws Exception
     {
-        _connector.getResponses("GET http://[:1]/foo HTTP/1.1\nReferer: http://other.site\n\n");
+        _connector.getResponse("GET http://[:1]/foo HTTP/1.1\nReferer: http://other.site\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET http://[:1]/foo "));
         assertThat(log,containsString(" 400 0 \"http://other.site\" \"-\" - "));
@@ -201,7 +201,7 @@
     @Test
     public void testUseragentWith() throws Exception
     {
-        _connector.getResponses("GET http://[:1]/foo HTTP/1.1\nReferer: http://other.site\nUser-Agent: Mozilla/5.0 (test)\n\n");
+        _connector.getResponse("GET http://[:1]/foo HTTP/1.1\nReferer: http://other.site\nUser-Agent: Mozilla/5.0 (test)\n\n");
         String log = _log.exchange(null,5,TimeUnit.SECONDS);
         assertThat(log,containsString("GET http://[:1]/foo "));
         assertThat(log,containsString(" 400 0 \"http://other.site\" \"Mozilla/5.0 (test)\" - "));
