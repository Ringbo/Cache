diff --git a/drools-core/src/main/java/org/drools/core/rule/SlidingTimeWindow.java b/drools-core/src/main/java/org/drools/core/rule/SlidingTimeWindow.java
index 6e9d275..a88aaf3 100644
--- a/drools-core/src/main/java/org/drools/core/rule/SlidingTimeWindow.java
+++ b/drools-core/src/main/java/org/drools/core/rule/SlidingTimeWindow.java
@@ -192,7 +192,7 @@
                                                                                        null,
                                                                                        handle );
                     ObjectTypeNode.doRetractObject(handle, expiresPctx, workingMemory);
-                    pctx.evaluateActionQueue( workingMemory );
+                    expiresPctx.evaluateActionQueue( workingMemory );
                 }
                 queue.expiringHandle = null;
                 handle = queue.queue.peek();
