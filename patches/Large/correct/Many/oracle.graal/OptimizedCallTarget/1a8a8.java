diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallTarget.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallTarget.java
index affd8a7..cd573f3 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallTarget.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallTarget.java
@@ -226,7 +226,7 @@
                 args1 = castArguments(args1);
             }
         }
-        VirtualFrame frame = createFrame(getRootNode().getFrameDescriptor(), args);
+        VirtualFrame frame = createFrame(getRootNode().getFrameDescriptor(), args1);
         Object result = callProxy(frame);
 
         // Profile call return type
