diff --git a/java/org/apache/catalina/connector/ResponseFacade.java b/java/org/apache/catalina/connector/ResponseFacade.java
index 0f5d794..13a7c04 100644
--- a/java/org/apache/catalina/connector/ResponseFacade.java
+++ b/java/org/apache/catalina/connector/ResponseFacade.java
@@ -250,7 +250,7 @@
 
         if (isCommitted())
             throw new IllegalStateException
-                (/*sm.getString("responseBase.reset.ise")*/);
+                (sm.getString("coyoteResponse.setBufferSize.ise"));
 
         response.setBufferSize(size);
 
@@ -311,7 +311,7 @@
 
         if (isCommitted())
             throw new IllegalStateException
-                (/*sm.getString("responseBase.reset.ise")*/);
+                (sm.getString("coyoteResponse.resetBuffer.ise"));
 
         response.resetBuffer();
 
@@ -335,7 +335,7 @@
 
         if (isCommitted())
             throw new IllegalStateException
-                (/*sm.getString("responseBase.reset.ise")*/);
+                (sm.getString("coyoteResponse.reset.ise"));
 
         response.reset();
 
@@ -441,7 +441,7 @@
 
         if (isCommitted())
             throw new IllegalStateException
-                (/*sm.getString("responseBase.reset.ise")*/);
+                (sm.getString("coyoteResponse.sendError.ise"));
 
         response.setAppCommitted(true);
 
@@ -456,7 +456,7 @@
 
         if (isCommitted())
             throw new IllegalStateException
-                (/*sm.getString("responseBase.reset.ise")*/);
+                (sm.getString("coyoteResponse.sendError.ise"));
 
         response.setAppCommitted(true);
 
@@ -471,7 +471,7 @@
 
         if (isCommitted())
             throw new IllegalStateException
-                (/*sm.getString("responseBase.reset.ise")*/);
+                (sm.getString("coyoteResponse.sendRedirect.ise"));
 
         response.setAppCommitted(true);
 
