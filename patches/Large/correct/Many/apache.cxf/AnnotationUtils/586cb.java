diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/AnnotationUtils.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/AnnotationUtils.java
index 9e5839b..51d126d 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/AnnotationUtils.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/AnnotationUtils.java
@@ -86,7 +86,7 @@
             classes.add(HttpServletResponse.class);
             classes.add(ServletConfig.class);
             classes.add(ServletContext.class);
-        } catch (Exception ex) {
+        } catch (Throwable ex) {
             // it is not a problem on the client side and the exception will be
             // thrown later on if the injection of one of these contexts will be 
             // attempted on the server side
