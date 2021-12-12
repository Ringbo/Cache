diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java
index 80dd9a0..fb01e5f 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java
@@ -57,6 +57,16 @@
 
   private boolean userSuppliedProvider = false;
 
+  /**
+   * Primary entry point for the KeyShell; called via main().
+   *
+   * @param args Command line arguments.
+   * @return 0 on success and 1 on failure.  This value is passed back to
+   * the unix shell, so we must follow shell return code conventions:
+   * the return code is an unsigned character, and 0 means success, and
+   * small positive integers mean failure.
+   * @throws Exception
+   */
   @Override
   public int run(String[] args) throws Exception {
     int exitCode = 0;
@@ -68,11 +78,11 @@
       if (command.validate()) {
           command.execute();
       } else {
-        exitCode = -1;
+        exitCode = 1;
       }
     } catch (Exception e) {
       e.printStackTrace(err);
-      return -1;
+      return 1;
     }
     return exitCode;
   }
@@ -86,8 +96,8 @@
    * % hadoop key list [-provider providerPath]
    * % hadoop key delete keyName [--provider providerPath] [-i]
    * </pre>
-   * @param args
-   * @return
+   * @param args Command line arguments.
+   * @return 0 on success, 1 on failure.
    * @throws IOException
    */
   private int init(String[] args) throws IOException {
@@ -105,7 +115,7 @@
         command = new CreateCommand(keyName, options);
         if ("--help".equals(keyName)) {
           printKeyShellUsage();
-          return -1;
+          return 1;
         }
       } else if (args[i].equals("delete")) {
         String keyName = "--help";
@@ -116,7 +126,7 @@
         command = new DeleteCommand(keyName);
         if ("--help".equals(keyName)) {
           printKeyShellUsage();
-          return -1;
+          return 1;
         }
       } else if (args[i].equals("roll")) {
         String keyName = "--help";
@@ -127,7 +137,7 @@
         command = new RollCommand(keyName);
         if ("--help".equals(keyName)) {
           printKeyShellUsage();
-          return -1;
+          return 1;
         }
       } else if ("list".equals(args[i])) {
         command = new ListCommand();
@@ -145,13 +155,13 @@
           out.println("\nAttributes must be in attribute=value form, " +
                   "or quoted\nlike \"attribute = value\"\n");
           printKeyShellUsage();
-          return -1;
+          return 1;
         }
         if (attributes.containsKey(attr)) {
           out.println("\nEach attribute must correspond to only one value:\n" +
                   "atttribute \"" + attr + "\" was repeated\n" );
           printKeyShellUsage();
-          return -1;
+          return 1;
         }
         attributes.put(attr, val);
       } else if ("--provider".equals(args[i]) && moreTokens) {
@@ -163,17 +173,17 @@
         interactive = true;
       } else if ("--help".equals(args[i])) {
         printKeyShellUsage();
-        return -1;
+        return 1;
       } else {
         printKeyShellUsage();
         ToolRunner.printGenericCommandUsage(System.err);
-        return -1;
+        return 1;
       }
     }
 
     if (command == null) {
       printKeyShellUsage();
-      return -1;
+      return 1;
     }
 
     if (!attributes.isEmpty()) {
@@ -491,10 +501,11 @@
   }
 
   /**
-   * Main program.
+   * main() entry point for the KeyShell.  While strictly speaking the
+   * return is void, it will System.exit() with a return code: 0 is for
+   * success and 1 for failure.
    *
-   * @param args
-   *          Command line arguments
+   * @param args Command line arguments.
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {
