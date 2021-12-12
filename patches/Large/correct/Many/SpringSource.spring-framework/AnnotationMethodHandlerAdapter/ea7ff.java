diff --git a/org.springframework.web.portlet/src/main/java/org/springframework/web/portlet/mvc/annotation/AnnotationMethodHandlerAdapter.java b/org.springframework.web.portlet/src/main/java/org/springframework/web/portlet/mvc/annotation/AnnotationMethodHandlerAdapter.java
index b1af99a..249bc85 100644
--- a/org.springframework.web.portlet/src/main/java/org/springframework/web/portlet/mvc/annotation/AnnotationMethodHandlerAdapter.java
+++ b/org.springframework.web.portlet/src/main/java/org/springframework/web/portlet/mvc/annotation/AnnotationMethodHandlerAdapter.java
@@ -521,7 +521,7 @@
 
 		@Override
 		protected void raiseMissingParameterException(String paramName, Class paramType) throws Exception {
-			throw new MissingPortletRequestParameterException(paramName, paramType.getName());
+			throw new MissingPortletRequestParameterException(paramName, paramType.getSimpleName());
 		}
 
 		@Override
