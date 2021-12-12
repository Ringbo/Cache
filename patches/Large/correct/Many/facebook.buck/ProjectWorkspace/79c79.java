diff --git a/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java b/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java
index 574bd81..5b54e42 100644
--- a/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java
+++ b/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java
@@ -252,7 +252,7 @@
           new BuildId(),
           destPath,
           context,
-          ImmutableMap.<String, String>of(),
+          ImmutableMap.copyOf(System.getenv()),
           args);
     } catch (InterruptedException e) {
       e.printStackTrace(stderr);
