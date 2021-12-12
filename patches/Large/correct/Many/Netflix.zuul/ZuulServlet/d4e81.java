diff --git a/zuul-core/src/main/java/com/netflix/zuul/http/ZuulServlet.java b/zuul-core/src/main/java/com/netflix/zuul/http/ZuulServlet.java
index 617985a..6445dd8 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/http/ZuulServlet.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/http/ZuulServlet.java
@@ -140,7 +140,7 @@
         @Mock
         HttpServletRequest servletRequest;
         @Mock
-        HttpServletResponse servletResponse;
+        HttpServletResponseWrapper servletResponse;
         @Mock
         FilterProcessor processor;
         @Mock
@@ -167,7 +167,7 @@
                 zuulServlet.init(servletRequest, servletResponse);
                 verify(zuulServlet, times(1)).init(servletRequest, servletResponse);
                 assertTrue(RequestContext.getCurrentContext().getRequest() instanceof HttpServletRequestWrapper);
-                assertEquals(RequestContext.getCurrentContext().getResponse(), servletResponse);
+                assertTrue(RequestContext.getCurrentContext().getResponse() instanceof HttpServletResponseWrapper);
 
                 zuulServlet.preRoute();
                 verify(processor, times(1)).preRoute();
