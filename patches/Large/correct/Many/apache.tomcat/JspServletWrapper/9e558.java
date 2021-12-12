diff --git a/java/org/apache/jasper/servlet/JspServletWrapper.java b/java/org/apache/jasper/servlet/JspServletWrapper.java
index be7d227..8f16a57 100644
--- a/java/org/apache/jasper/servlet/JspServletWrapper.java
+++ b/java/org/apache/jasper/servlet/JspServletWrapper.java
@@ -162,7 +162,7 @@
     }
 
     public ServletContext getServletContext() {
-        return config.getServletContext();
+        return ctxt.getServletContext();
     }
 
     /**
