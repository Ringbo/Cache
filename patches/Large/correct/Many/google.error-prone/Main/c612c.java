diff --git a/examples/maven/error_prone_should_flag/src/main/java/Main.java b/examples/maven/error_prone_should_flag/src/main/java/Main.java
index c227314..2a42606 100644
--- a/examples/maven/error_prone_should_flag/src/main/java/Main.java
+++ b/examples/maven/error_prone_should_flag/src/main/java/Main.java
@@ -17,6 +17,6 @@
 public class Main {
   public static void main(String[] args) {
     // Dead exception
-    new Exception();
+    new RuntimeException();
   }
 }
