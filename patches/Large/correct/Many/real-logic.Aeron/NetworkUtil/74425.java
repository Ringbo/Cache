diff --git a/aeron-common/src/main/java/uk/co/real_logic/aeron/common/NetworkUtil.java b/aeron-common/src/main/java/uk/co/real_logic/aeron/common/NetworkUtil.java
index 45f87a7..41cf7b3 100644
--- a/aeron-common/src/main/java/uk/co/real_logic/aeron/common/NetworkUtil.java
+++ b/aeron-common/src/main/java/uk/co/real_logic/aeron/common/NetworkUtil.java
@@ -133,7 +133,7 @@
 
             return
                 (upperMask & toLong(a, 0)) == (upperMask & toLong(b, 0)) &&
-                (lowerMask & toLong(b, 8)) == (lowerMask & toLong(b, 8));
+                (lowerMask & toLong(a, 8)) == (lowerMask & toLong(b, 8));
         }
 
         throw new IllegalArgumentException("How many bytes does an IP address have again?");
