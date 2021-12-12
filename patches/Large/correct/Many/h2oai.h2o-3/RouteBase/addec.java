diff --git a/h2o-core/src/main/java/water/api/RouteBase.java b/h2o-core/src/main/java/water/api/RouteBase.java
index 62c642e..48330ea 100644
--- a/h2o-core/src/main/java/water/api/RouteBase.java
+++ b/h2o-core/src/main/java/water/api/RouteBase.java
@@ -38,7 +38,7 @@
     PojoUtils.copyProperties(this, impl, PojoUtils.FieldNaming.ORIGIN_HAS_UNDERSCORES, new String[] {"url_pattern", "handler_class", "handler_method", "doc_method"} );
     this.url_pattern = impl._url_pattern.namedPattern();
     this.handler_class = impl._handler_class.toString();
-    this.handler_method = impl._handler_method.toString();
+    this.handler_method = impl._handler_method.getName();
     this.input_schema = Handler.getHandlerMethodInputSchema(impl._handler_method).getSimpleName();
     this.output_schema = Handler.getHandlerMethodOutputSchema(impl._handler_method).getSimpleName();
     this.doc_method = (impl._doc_method == null ? "" : impl._doc_method.toString());
