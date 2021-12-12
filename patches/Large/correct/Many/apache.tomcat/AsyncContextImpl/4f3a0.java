diff --git a/java/org/apache/catalina/core/AsyncContextImpl.java b/java/org/apache/catalina/core/AsyncContextImpl.java
index 0a39eb0..e15c7d1 100644
--- a/java/org/apache/catalina/core/AsyncContextImpl.java
+++ b/java/org/apache/catalina/core/AsyncContextImpl.java
@@ -64,7 +64,7 @@
 
     private ServletRequest servletRequest = null;
     private ServletResponse servletResponse = null;
-    private List<AsyncListenerWrapper> listeners = new ArrayList<AsyncListenerWrapper>();
+    private final List<AsyncListenerWrapper> listeners = new ArrayList<AsyncListenerWrapper>();
     private boolean hasOriginalRequestAndResponse = true;
     private volatile Runnable dispatch = null;
     private Context context = null;
@@ -122,7 +122,7 @@
         return true;
     }
 
-    public boolean canWrite() throws IOException {
+    public boolean canWrite() {
         if (request.getResponse().getCoyoteResponse().getWriteListener()==null) return false;
         ClassLoader oldCL = Thread.currentThread().getContextClassLoader();
         ClassLoader newCL = request.getContext().getLoader().getClassLoader();
