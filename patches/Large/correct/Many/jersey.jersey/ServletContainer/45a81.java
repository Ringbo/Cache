diff --git a/containers/jersey-servlet-core/src/main/java/org/glassfish/jersey/servlet/ServletContainer.java b/containers/jersey-servlet-core/src/main/java/org/glassfish/jersey/servlet/ServletContainer.java
index 1d0a6b0..03273c3 100644
--- a/containers/jersey-servlet-core/src/main/java/org/glassfish/jersey/servlet/ServletContainer.java
+++ b/containers/jersey-servlet-core/src/main/java/org/glassfish/jersey/servlet/ServletContainer.java
@@ -409,7 +409,7 @@
         try {
             doFilter((HttpServletRequest) servletRequest, (HttpServletResponse) servletResponse, filterChain);
         } catch (ClassCastException e) {
-            throw new ServletException("non-HTTP request or response");
+            throw new ServletException("non-HTTP request or response", e);
         }
     }
 
