diff --git a/moco-runner/src/main/java/com/github/dreamhead/moco/bootstrap/ShutdownPortOption.java b/moco-runner/src/main/java/com/github/dreamhead/moco/bootstrap/ShutdownPortOption.java
index 9c8574d..f4cbc0a 100644
--- a/moco-runner/src/main/java/com/github/dreamhead/moco/bootstrap/ShutdownPortOption.java
+++ b/moco-runner/src/main/java/com/github/dreamhead/moco/bootstrap/ShutdownPortOption.java
@@ -20,7 +20,7 @@
 
     public static Option shutdownPortOption() {
         Option opt = new Option("s", true, "shutdown port");
-        opt.setType(Integer.class);
+        opt.setType(String.class);
         opt.setRequired(false);
         return opt;
     }
