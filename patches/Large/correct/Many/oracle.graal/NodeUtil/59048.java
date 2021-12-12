diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java
index 6eb51af..b45c2e1 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java
@@ -317,7 +317,8 @@
                 }
             }
         }
-        return false;
+        // if a child was not found the replacement can be considered safe.
+        return true;
     }
 
     /**
