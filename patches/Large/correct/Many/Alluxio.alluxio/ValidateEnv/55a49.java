diff --git a/core/server/common/src/main/java/alluxio/cli/ValidateEnv.java b/core/server/common/src/main/java/alluxio/cli/ValidateEnv.java
index 521803c..4c9a21f 100644
--- a/core/server/common/src/main/java/alluxio/cli/ValidateEnv.java
+++ b/core/server/common/src/main/java/alluxio/cli/ValidateEnv.java
@@ -247,7 +247,7 @@
     }
 
     System.out.println("Validation succeeded.");
-    return false;
+    return true;
   }
 
   private static boolean validateWorkers(String name) throws InterruptedException {
@@ -330,6 +330,17 @@
     System.exit(validate(args));
   }
 
+  /**
+   * Parses the command line arguments and options in {@code args}.
+   *
+   * After successful execution of this method, command line arguments can be
+   * retrieved by invoking {@link CommandLine#getArgs()}, and options can be
+   * retrieved by calling {@link CommandLine#getOptions()}.
+   *
+   * @param args
+   * @return
+   * @throws InvalidArgumentException
+   */
   private static CommandLine parseArgsAndOptions(String... args) throws InvalidArgumentException {
     Options opts = new Options().addOption(HADOOP_CONF_DIR_OPTION);
     CommandLineParser parser = new DefaultParser();
