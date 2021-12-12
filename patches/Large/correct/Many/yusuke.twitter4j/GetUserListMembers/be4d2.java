diff --git a/twitter4j-examples/src/main/java/twitter4j/examples/listmembers/GetUserListMembers.java b/twitter4j-examples/src/main/java/twitter4j/examples/listmembers/GetUserListMembers.java
index 5570dba..ffd092f 100644
--- a/twitter4j-examples/src/main/java/twitter4j/examples/listmembers/GetUserListMembers.java
+++ b/twitter4j-examples/src/main/java/twitter4j/examples/listmembers/GetUserListMembers.java
@@ -44,7 +44,7 @@
      * @param args message
      */
     public static void main(String[] args) {
-        if (args.length < 1) {
+        if (args.length < 2) {
             System.out.println("Usage: java twitter4j.examples.listmembers.GetUserListMembers [list owner screen name] [list id]");
             System.exit(-1);
         }
