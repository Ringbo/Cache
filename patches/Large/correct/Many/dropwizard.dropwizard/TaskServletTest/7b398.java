diff --git a/dropwizard-core/src/test/java/com/yammer/dropwizard/tasks/tests/TaskServletTest.java b/dropwizard-core/src/test/java/com/yammer/dropwizard/tasks/tests/TaskServletTest.java
index 3c6ad40..9a6d8c1 100644
--- a/dropwizard-core/src/test/java/com/yammer/dropwizard/tasks/tests/TaskServletTest.java
+++ b/dropwizard-core/src/test/java/com/yammer/dropwizard/tasks/tests/TaskServletTest.java
@@ -35,7 +35,7 @@
     @Test
     public void returnsA404WhenNotFound() throws Exception {
         when(request.getMethod()).thenReturn("POST");
-        when(request.getServletPath()).thenReturn("/tasks/test");
+        when(request.getPathInfo()).thenReturn("/test");
 
         servlet.service(request, response);
 
@@ -47,7 +47,7 @@
         final PrintWriter output = mock(PrintWriter.class);
 
         when(request.getMethod()).thenReturn("POST");
-        when(request.getServletPath()).thenReturn("/tasks/gc");
+        when(request.getPathInfo()).thenReturn("/gc");
         when(request.getParameterNames()).thenReturn(Collections.enumeration(ImmutableList.<String>of()));
         when(response.getWriter()).thenReturn(output);
 
@@ -61,7 +61,7 @@
         final PrintWriter output = mock(PrintWriter.class);
 
         when(request.getMethod()).thenReturn("POST");
-        when(request.getServletPath()).thenReturn("/tasks/gc");
+        when(request.getPathInfo()).thenReturn("/gc");
         when(request.getParameterNames()).thenReturn(Collections.enumeration(ImmutableList.of("runs")));
         when(request.getParameterValues("runs")).thenReturn(new String[]{"1"});
         when(response.getWriter()).thenReturn(output);
@@ -75,7 +75,7 @@
     @SuppressWarnings("unchecked")
     public void returnsA500OnExceptions() throws Exception {
         when(request.getMethod()).thenReturn("POST");
-        when(request.getServletPath()).thenReturn("/tasks/gc");
+        when(request.getPathInfo()).thenReturn("/gc");
         when(request.getParameterNames()).thenReturn(Collections.enumeration(ImmutableList.<String>of()));
 
         final RuntimeException ex = new RuntimeException("whoops");
