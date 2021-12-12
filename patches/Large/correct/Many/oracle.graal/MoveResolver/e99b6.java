diff --git a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/alloc/util/MoveResolver.java b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/alloc/util/MoveResolver.java
index fb19f6b..d8722b3 100644
--- a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/alloc/util/MoveResolver.java
+++ b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/alloc/util/MoveResolver.java
@@ -257,7 +257,7 @@
         return count == 0 || (count == 1 && isLocation(from) && asLocation(from).location == to.location);
     }
 
-    private void insertExchange(Location from, Location to) {
+    private static void insertExchange(Location from, Location to) {
         trace(3, "mr      XCHG %s, %s", from, to);
         throw Util.unimplemented();
         // TODO create XCHG instruction and use it here
