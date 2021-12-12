diff --git a/samples/showcase/src/main/java/com/facebook/fresco/samples/showcase/ShowcaseApplication.java b/samples/showcase/src/main/java/com/facebook/fresco/samples/showcase/ShowcaseApplication.java
index 2b603fc..b0babe5 100644
--- a/samples/showcase/src/main/java/com/facebook/fresco/samples/showcase/ShowcaseApplication.java
+++ b/samples/showcase/src/main/java/com/facebook/fresco/samples/showcase/ShowcaseApplication.java
@@ -63,7 +63,7 @@
                   }
                 })
             .experiment()
-            .setBitmapPrepareToDraw(true, 0, Integer.MAX_VALUE)
+            .setBitmapPrepareToDraw(true, 0, Integer.MAX_VALUE, true)
             .experiment()
             .setSmartResizingEnabled(Suppliers.BOOLEAN_TRUE)
             .build();
