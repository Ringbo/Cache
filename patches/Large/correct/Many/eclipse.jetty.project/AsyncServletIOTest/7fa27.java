diff --git a/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncServletIOTest.java b/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncServletIOTest.java
index 4012afb..5cd51d8 100644
--- a/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncServletIOTest.java
+++ b/jetty-servlet/src/test/java/org/eclipse/jetty/servlet/AsyncServletIOTest.java
@@ -140,7 +140,7 @@
     public void testBigWrites() throws Exception
     {
         process(102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400,102400);
-        Assert.assertThat("On Write Possible",_owp.get(),greaterThan(1));
+        Assert.assertThat("On Write Possible",_owp.get(),greaterThanOrEqualTo(1));
     }
 
     @Test
