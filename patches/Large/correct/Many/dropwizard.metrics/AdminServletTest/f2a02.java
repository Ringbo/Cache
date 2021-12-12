diff --git a/metrics-servlet/src/test/java/com/yammer/metrics/reporting/tests/AdminServletTest.java b/metrics-servlet/src/test/java/com/yammer/metrics/reporting/tests/AdminServletTest.java
old mode 100644
new mode 100755
index e9d1b4e..4f8601e
--- a/metrics-servlet/src/test/java/com/yammer/metrics/reporting/tests/AdminServletTest.java
+++ b/metrics-servlet/src/test/java/com/yammer/metrics/reporting/tests/AdminServletTest.java
@@ -42,7 +42,7 @@
 
     @Before
     public void setUp() throws Exception {
-        when(context.getContextPath()).thenReturn("/context");
+        when(request.getContextPath()).thenReturn("/context");
 
         when(config.getServletContext()).thenReturn(context);
 
