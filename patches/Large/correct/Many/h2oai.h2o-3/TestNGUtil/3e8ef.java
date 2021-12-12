diff --git a/h2o-testng/src/test/java/water/TestNGUtil.java b/h2o-testng/src/test/java/water/TestNGUtil.java
index 189c17a..4b7f1fc 100644
--- a/h2o-testng/src/test/java/water/TestNGUtil.java
+++ b/h2o-testng/src/test/java/water/TestNGUtil.java
@@ -33,7 +33,7 @@
                 // Leader node, where the tests execute from.
                 String cloudName = UUID.randomUUID().toString();
                 String[] args = new String[]{"-name",cloudName,"-ice_root",find_test_file_static("h2o-testng/" +
-                        "build/test-results").toString()};
+                        "build").toString()};
                 H2O.main(args);
 
                 // Secondary nodes, skip if expected to be pre-built
@@ -41,7 +41,7 @@
                     for( int i = 0; i < x-1; i++ )
                         new NodeContainer(args).start();
 
-                H2O.waitForCloudSize(x, 10000);
+                H2O.waitForCloudSize(x, 30000);
 
                 _stall_called_before = true;
             }
