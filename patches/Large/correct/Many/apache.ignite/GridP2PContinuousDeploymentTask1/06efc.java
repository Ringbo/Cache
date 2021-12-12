diff --git a/modules/extdata/p2p/src/main/java/org/apache/ignite/tests/p2p/GridP2PContinuousDeploymentTask1.java b/modules/extdata/p2p/src/main/java/org/apache/ignite/tests/p2p/GridP2PContinuousDeploymentTask1.java
index 02f4786..6f8aa87 100644
--- a/modules/extdata/p2p/src/main/java/org/apache/ignite/tests/p2p/GridP2PContinuousDeploymentTask1.java
+++ b/modules/extdata/p2p/src/main/java/org/apache/ignite/tests/p2p/GridP2PContinuousDeploymentTask1.java
@@ -38,7 +38,7 @@
             @Override public Object execute() throws IgniteCheckedException {
                 X.println(">>> Executing GridP2PContinuousDeploymentTask1 job.");
 
-                ignite.cache(null).putx("key", new GridTestUserResource());
+                ignite.cache(null).putx("key", new TestUserResource());
 
                 return null;
             }
