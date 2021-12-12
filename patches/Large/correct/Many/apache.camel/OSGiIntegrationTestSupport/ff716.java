diff --git a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/OSGiIntegrationTestSupport.java b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/OSGiIntegrationTestSupport.java
index 3527b8f..b3b2ded 100644
--- a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/OSGiIntegrationTestSupport.java
+++ b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/OSGiIntegrationTestSupport.java
@@ -131,7 +131,7 @@
 
             // using the features to install the camel components             
             scanFeatures(getCamelKarafFeatureUrl(),                         
-                "camel-core", "camel-spring", "camel-test"),
+                "xml-specs-api", "camel-core", "camel-spring", "camel-test"),
                                    
             workingDirectory("target/paxrunner/"));
 
