diff --git a/app/controllers/IndicesController.java b/app/controllers/IndicesController.java
index ec9fff8..bc9fa7c 100644
--- a/app/controllers/IndicesController.java
+++ b/app/controllers/IndicesController.java
@@ -99,7 +99,7 @@
             return ok(views.html.system.indices.failures.render(
                     currentUser(),
                     bc,
-                    clusterService.getIndexerFailures(0,0).total,
+                    clusterService.getIndexerFailures(1,0).total,
                     page
             ));
         } catch (APIException e) {
