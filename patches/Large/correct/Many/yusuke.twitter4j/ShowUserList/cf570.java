diff --git a/twitter4j-examples/src/main/java/twitter4j/examples/list/ShowUserList.java b/twitter4j-examples/src/main/java/twitter4j/examples/list/ShowUserList.java
index ec2942b..c4c1b28 100644
--- a/twitter4j-examples/src/main/java/twitter4j/examples/list/ShowUserList.java
+++ b/twitter4j-examples/src/main/java/twitter4j/examples/list/ShowUserList.java
@@ -43,7 +43,7 @@
      * @param args message
      */
     public static void main(String[] args) {
-        if (args.length < 1) {
+        if (args.length < 2) {
             System.out.println("Usage: java twitter4j.examples.list.ShowUserList [screen name] [list id]");
             System.exit(-1);
         }
