diff --git a/src/main/java/io/vertx/core/impl/DeploymentManager.java b/src/main/java/io/vertx/core/impl/DeploymentManager.java
index 44c8ebd..26f1a18 100644
--- a/src/main/java/io/vertx/core/impl/DeploymentManager.java
+++ b/src/main/java/io/vertx/core/impl/DeploymentManager.java
@@ -669,7 +669,7 @@
           undeployed = false;
           log.trace("Redeployed ok");
         } else {
-          log.trace("Failed to deploy!!");
+          log.trace("Failed to deploy!!", res2.cause());
           broken = true;
           doStartRedeployTimer();
         }
