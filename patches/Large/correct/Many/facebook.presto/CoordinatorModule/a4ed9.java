diff --git a/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java b/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java
index a462e19..20b2f57 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java
@@ -144,8 +144,8 @@
         // query execution visualizer
         jaxrsBinder(binder).bind(QueryExecutionResource.class);
 
-        // main webapp entry point
-        jaxrsBinder(binder).bind(WebAppResource.class);
+        // resource for serving static content
+        jaxrsBinder(binder).bind(WebUiResource.class);
 
         // query manager
         jaxrsBinder(binder).bind(QueryResource.class);
