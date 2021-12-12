diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnsafeArrayCastNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnsafeArrayCastNode.java
index c8f775e..936d346 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnsafeArrayCastNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnsafeArrayCastNode.java
@@ -51,5 +51,5 @@
     }
 
     @NodeIntrinsic
-    public static native <T> T unsafeArrayCast(Object object, int length, @ConstantNodeParameter Stamp stamp, ValueNode anchor);
+    public static native <T> T unsafeArrayCast(Object object, int length, @ConstantNodeParameter Stamp stamp, Object anchor);
 }
