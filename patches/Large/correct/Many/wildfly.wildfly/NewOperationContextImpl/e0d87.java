diff --git a/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java b/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java
index 0defde8..fa37df4 100644
--- a/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java
+++ b/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java
@@ -193,12 +193,12 @@
         if (flags.contains(Flag.CANCELLED)) {
             response.get(OUTCOME).set(CANCELLED);
             response.get(FAILURE_DESCRIPTION).set("Operation cancelled");
-            response.set(ROLLED_BACK).set(true);
+            response.get(ROLLED_BACK).set(true);
             return ResultAction.ROLLBACK;
         }
         if (response.hasDefined(FAILURE_DESCRIPTION) && (contextFlags.contains(ContextFlag.ROLLBACK_ON_FAIL) || currentStage == Stage.MODEL)) {
             response.get(OUTCOME).set(FAILED);
-            response.set(ROLLED_BACK).set(true);
+            response.get(ROLLED_BACK).set(true);
             return ResultAction.ROLLBACK;
         }
         do {
@@ -218,7 +218,7 @@
                         flags.add(Flag.CANCELLED);
                         response.get(OUTCOME).set(CANCELLED);
                         response.get(FAILURE_DESCRIPTION).set("Operation cancelled");
-                        response.set(ROLLED_BACK).set(true);
+                        response.get(ROLLED_BACK).set(true);
                         return ResultAction.ROLLBACK;
                     }
                 }
@@ -229,7 +229,7 @@
                 ModelNode oldResponse = response;
                 try {
                     flags = EnumSet.noneOf(Flag.class);
-                    response = step.response;
+                    response = this.response = step.response;
                     ModelNode newOperation = operation = step.operation;
                     modelAddress = PathAddress.pathAddress(newOperation.get(ADDRESS));
                     step.handler.execute(this, newOperation);
@@ -243,12 +243,12 @@
                             response.get(FAILURE_DESCRIPTION).set("Operation handler failed: " + t);
                         }
                         response.get(OUTCOME).set(FAILED);
-                        response.set(ROLLED_BACK).set(true);
+                        response.get(ROLLED_BACK).set(true);
                         // this result action will be overwritten in finally, but whatever
                         return resultAction = ResultAction.ROLLBACK;
                     } else {
                         if (resultAction == ResultAction.ROLLBACK) {
-                            response.set(ROLLED_BACK).set(true);
+                            response.get(ROLLED_BACK).set(true);
                         }
                         response.get(OUTCOME).set(response.hasDefined(FAILURE_DESCRIPTION) ? FAILED : SUCCESS);
                         // It failed after!  Just return, ignore the failure
@@ -268,7 +268,7 @@
                                 response.get(FAILURE_DESCRIPTION).set("Operation handler failed to complete");
                             }
                             response.get(OUTCOME).set(FAILED);
-                            response.set(ROLLED_BACK).set(true);
+                            response.get(ROLLED_BACK).set(true);
                             // We deliberately override the result to always roll back in this case!
                             //noinspection ReturnInsideFinallyBlock
                             return resultAction = ResultAction.ROLLBACK;
