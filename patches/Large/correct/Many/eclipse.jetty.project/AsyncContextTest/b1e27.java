diff --git a/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncContextTest.java b/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncContextTest.java
index e707884..e8b3289 100644
--- a/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncContextTest.java
+++ b/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncContextTest.java
@@ -135,7 +135,7 @@
 
         Assert.assertEquals("error servlet","ERROR: /error",br.readLine());
         Assert.assertEquals("error servlet","PathInfo= /IOE",br.readLine());
-        Assert.assertEquals("error servlet","EXCEPTION: java.io.IOException: Test",br.readLine());
+        Assert.assertEquals("error servlet","EXCEPTION: org.eclipse.jetty.server.QuietServletException: java.io.IOException: Test",br.readLine());
     }
     
     @Test
@@ -350,7 +350,7 @@
 
         Assert.assertEquals("error servlet","ERROR: /error",br.readLine());
         Assert.assertEquals("error servlet","PathInfo= /500",br.readLine());
-        Assert.assertEquals("error servlet","EXCEPTION: java.io.IOException: TEST",br.readLine());
+        Assert.assertEquals("error servlet","EXCEPTION: java.lang.RuntimeException: TEST",br.readLine());
     }
 
     private class DispatchingRunnable implements Runnable
@@ -424,7 +424,7 @@
                     @Override
                     public void onTimeout(AsyncEvent event) throws IOException
                     {
-                        throw new IOException("TEST");
+                        throw new RuntimeException("TEST");
                     }
                     
                     @Override
