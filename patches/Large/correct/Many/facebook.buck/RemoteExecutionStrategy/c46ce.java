diff --git a/src/com/facebook/buck/rules/modern/builders/RemoteExecutionStrategy.java b/src/com/facebook/buck/rules/modern/builders/RemoteExecutionStrategy.java
index 900c6fd..8814ba4 100644
--- a/src/com/facebook/buck/rules/modern/builders/RemoteExecutionStrategy.java
+++ b/src/com/facebook/buck/rules/modern/builders/RemoteExecutionStrategy.java
@@ -221,7 +221,9 @@
             service,
             () -> Futures.immediateFuture(getRemoteExecutionActionInfo(rule, strategyContext)));
     return Futures.transformAsync(
-        actionInfoFuture, actionInfo -> uploadInputs(rule.getBuildTarget(), actionInfo));
+        actionInfoFuture,
+        actionInfo -> uploadInputs(rule.getBuildTarget(), actionInfo),
+        MoreExecutors.directExecutor());
   }
 
   private ListenableFuture<RemoteExecutionActionInfo> uploadInputs(
@@ -242,7 +244,8 @@
           // actionInfo.getRequiredData() in particular may be very, very large and is unneeded once
           // uploading has completed.
           return actionInfo.withRequiredData(ImmutableMap.of());
-        });
+        },
+        MoreExecutors.directExecutor());
   }
 
   private ListenableFuture<Optional<BuildResult>> handleActionInfo(
@@ -322,7 +325,8 @@
                   result -> {
                     executingScope.close();
                     return result;
-                  });
+                  },
+                  MoreExecutors.directExecutor());
             });
 
     return Futures.transformAsync(
