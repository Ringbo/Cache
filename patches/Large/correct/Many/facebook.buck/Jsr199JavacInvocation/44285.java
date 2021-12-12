diff --git a/src/com/facebook/buck/jvm/java/Jsr199JavacInvocation.java b/src/com/facebook/buck/jvm/java/Jsr199JavacInvocation.java
index b21f8c5..c5fba49 100644
--- a/src/com/facebook/buck/jvm/java/Jsr199JavacInvocation.java
+++ b/src/com/facebook/buck/jvm/java/Jsr199JavacInvocation.java
@@ -420,7 +420,8 @@
                     try {
                       success = javacTask.call();
                     } catch (IllegalStateException ex) {
-                      if (ex.getLocalizedMessage().equals("no source files")) {
+                      if (ex.getLocalizedMessage().equals("no source files")
+                          || ex.getLocalizedMessage().equals("error: no source files")) {
                         success = true;
                       }
                     }
