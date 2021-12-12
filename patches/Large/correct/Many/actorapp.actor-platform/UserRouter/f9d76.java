diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/users/router/UserRouter.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/users/router/UserRouter.java
index 26d678d..2085594 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/users/router/UserRouter.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/users/router/UserRouter.java
@@ -507,7 +507,7 @@
             UpdateUserUnblocked unblocked = (UpdateUserUnblocked) update;
             return onUserBlockedChanged(
                     unblocked.getUid(),
-                    true);
+                    false);
         }
         return Promise.success(null);
     }
