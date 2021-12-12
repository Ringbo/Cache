diff --git a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/jclouds/BlobStoreBlueprintRouteTest.java b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/jclouds/BlobStoreBlueprintRouteTest.java
index 4811156..6e161a2 100644
--- a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/jclouds/BlobStoreBlueprintRouteTest.java
+++ b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/jclouds/BlobStoreBlueprintRouteTest.java
@@ -94,10 +94,7 @@
                 // using the features to install the camel components
                 loadCamelFeatures(
                         "camel-blueprint", "camel-jclouds"),
-                workingDirectory("target/paxrunner/"),
-                felix());
-
-        // TODO: equinox fails for some reason
+                workingDirectory("target/paxrunner/"));
 
         return options;
     }
