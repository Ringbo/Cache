diff --git a/components/camel-restlet/src/main/java/org/apache/camel/component/restlet/DefaultRestletBinding.java b/components/camel-restlet/src/main/java/org/apache/camel/component/restlet/DefaultRestletBinding.java
index 57037e4..b95ef7a 100644
--- a/components/camel-restlet/src/main/java/org/apache/camel/component/restlet/DefaultRestletBinding.java
+++ b/components/camel-restlet/src/main/java/org/apache/camel/component/restlet/DefaultRestletBinding.java
@@ -119,7 +119,7 @@
         }
 
         // only deal with the form if the content type is "application/x-www-form-urlencoded"
-        if (request.getEntity().getMediaType() != null && request.getEntity().getMediaType().equals(MediaType.APPLICATION_WWW_FORM)) {
+        if (request.getEntity().getMediaType() != null && request.getEntity().getMediaType().equals(MediaType.APPLICATION_WWW_FORM, true)) {
             Form form = new Form(request.getEntity());
             for (String paramName : form.getValuesMap().keySet()) {
                 String[] values = form.getValuesArray(paramName);
@@ -161,7 +161,7 @@
 
         Form form = null;
         // Use forms only for PUT, POST and x-www-form-urlencoded
-        if ((Method.PUT == method || Method.POST == method) && mediaType == MediaType.APPLICATION_WWW_FORM) {
+        if ((Method.PUT == method || Method.POST == method) && MediaType.APPLICATION_WWW_FORM.equals(mediaType, true)) {
             form = new Form();
             // must use string based for forms
             String body = exchange.getIn().getBody(String.class);
