diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnboxNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnboxNode.java
index 925c7ca..1dcae42 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnboxNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/UnboxNode.java
@@ -79,9 +79,9 @@
                     case Long:
                         return ConstantNode.forLong((Long) o, graph());
                     case Float:
-                        return ConstantNode.forFloat((Long) o, graph());
+                        return ConstantNode.forFloat((Float) o, graph());
                     case Double:
-                        return ConstantNode.forDouble((Long) o, graph());
+                        return ConstantNode.forDouble((Double) o, graph());
                     default:
                         ValueNodeUtil.shouldNotReachHere();
                 }
