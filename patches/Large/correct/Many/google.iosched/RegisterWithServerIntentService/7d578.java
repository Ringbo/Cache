diff --git a/lib/src/main/java/com/google/samples/apps/iosched/signin/RegisterWithServerIntentService.java b/lib/src/main/java/com/google/samples/apps/iosched/signin/RegisterWithServerIntentService.java
index ac8c6ec..f191fe9 100644
--- a/lib/src/main/java/com/google/samples/apps/iosched/signin/RegisterWithServerIntentService.java
+++ b/lib/src/main/java/com/google/samples/apps/iosched/signin/RegisterWithServerIntentService.java
@@ -48,8 +48,7 @@
                 ServerUtilities.register(this, FirebaseInstanceId.getInstance().getToken(),
                         accountId);
             } else if (ACTION_UNREGISTER.equals(action)) {
-                ServerUtilities.unregister(this, FirebaseInstanceId.getInstance().getToken(),
-                        accountId);
+                ServerUtilities.unregister(this, FirebaseInstanceId.getInstance().getToken());
             }
         }
     }
