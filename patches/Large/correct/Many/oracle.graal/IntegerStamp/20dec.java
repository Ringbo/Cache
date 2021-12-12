diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/type/IntegerStamp.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/type/IntegerStamp.java
index fcac095..09c4fcc 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/type/IntegerStamp.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/type/IntegerStamp.java
@@ -200,8 +200,13 @@
         }
     }
 
+    /**
+     * Checks if the 2 stamps represent values of the same sign.
+     * Returns true if the two stamps are both positive of null or if they are both strictly negative
+     * @return true if the two stamps are both positive of null or if they are both strictly negative
+     */
     public static boolean sameSign(IntegerStamp s1, IntegerStamp s2) {
-        return s1.isPositive() && s2.isPositive() || s1.isNegative() && s2.isNegative();
+        return s1.isPositive() && s2.isPositive() || s1.isStrictlyNegative() && s2.isStrictlyNegative();
     }
 
 }
