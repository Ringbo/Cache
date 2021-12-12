diff --git a/ninja-servlet/src/test/java/ninja/servlet/ContextImplTest.java b/ninja-servlet/src/test/java/ninja/servlet/ContextImplTest.java
index 28e9fc9..a8c87cb 100644
--- a/ninja-servlet/src/test/java/ninja/servlet/ContextImplTest.java
+++ b/ninja-servlet/src/test/java/ninja/servlet/ContextImplTest.java
@@ -143,7 +143,7 @@
         when(httpServletRequest.getHeader(Context.X_FORWARD_HEADER)).thenReturn("x-forwarded-for-mockedRemoteAddr");
 
         //init the context from a (mocked) servlet
-        context.init(httpServletRequest, httpServletResponse);
+        context.init(servletContext, httpServletRequest, httpServletResponse);
 
         //make sure this is correct
         assertEquals("mockedRemoteAddr", context.getRemoteAddr());
@@ -160,7 +160,7 @@
                 .thenReturn(Boolean.TRUE);
 
         //init the context from a (mocked) servlet
-        context.init(httpServletRequest, httpServletResponse);
+        context.init(servletContext, httpServletRequest, httpServletResponse);
 
         //make sure this is correct
         assertEquals("192.168.1.44", context.getRemoteAddr());
@@ -177,7 +177,7 @@
                 .thenReturn(Boolean.TRUE);
 
         //init the context from a (mocked) servlet
-        context.init(httpServletRequest, httpServletResponse);
+        context.init(servletContext, httpServletRequest, httpServletResponse);
 
         //make sure this is correct
         assertEquals("192.168.1.1", context.getRemoteAddr());
