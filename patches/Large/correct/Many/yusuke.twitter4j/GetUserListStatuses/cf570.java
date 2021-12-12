diff --git a/twitter4j-examples/src/main/java/twitter4j/examples/list/GetUserListStatuses.java b/twitter4j-examples/src/main/java/twitter4j/examples/list/GetUserListStatuses.java
index 4c82087..8e32dd4 100644
--- a/twitter4j-examples/src/main/java/twitter4j/examples/list/GetUserListStatuses.java
+++ b/twitter4j-examples/src/main/java/twitter4j/examples/list/GetUserListStatuses.java
@@ -45,7 +45,7 @@
      * @param args message
      */
     public static void main(String[] args) {
-        if (args.length < 1) {
+        if (args.length < 2) {
             System.out.println("Usage: java twitter4j.examples.list.GetUserListStatuses [list owner screen name] [list id]");
             System.exit(-1);
         }
