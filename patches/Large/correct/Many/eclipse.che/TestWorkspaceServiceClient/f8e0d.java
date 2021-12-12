diff --git a/selenium/che-selenium-core/src/main/java/org/eclipse/che/selenium/core/client/TestWorkspaceServiceClient.java b/selenium/che-selenium-core/src/main/java/org/eclipse/che/selenium/core/client/TestWorkspaceServiceClient.java
index f0201ee..023fce5 100644
--- a/selenium/che-selenium-core/src/main/java/org/eclipse/che/selenium/core/client/TestWorkspaceServiceClient.java
+++ b/selenium/che-selenium-core/src/main/java/org/eclipse/che/selenium/core/client/TestWorkspaceServiceClient.java
@@ -219,7 +219,7 @@
       waitStatus(workspaceName, workspaceOwner.getName(), RUNNING);
     } catch (IllegalStateException ex) {
       // Remove try-catch block after issue has been resolved
-      Assert.fail("Known issue https://github.com/eclipse/che/issues/8031");
+      Assert.fail("Known issue https://github.com/eclipse/che/issues/8031", ex);
     }
   }
 
