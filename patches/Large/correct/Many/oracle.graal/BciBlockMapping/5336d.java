diff --git a/graal/com.oracle.graal.java/src/com/oracle/graal/java/BciBlockMapping.java b/graal/com.oracle.graal.java/src/com/oracle/graal/java/BciBlockMapping.java
index ca26e1f..0e84ee4 100644
--- a/graal/com.oracle.graal.java/src/com/oracle/graal/java/BciBlockMapping.java
+++ b/graal/com.oracle.graal.java/src/com/oracle/graal/java/BciBlockMapping.java
@@ -758,7 +758,7 @@
                 if (blockChanged) {
                     block.localsLiveIn.clear();
                     block.localsLiveIn.or(block.localsLiveOut);
-                    block.localsLiveIn.xor(block.localsLiveKill);
+                    block.localsLiveIn.andNot(block.localsLiveKill);
                     block.localsLiveIn.or(block.localsLiveGen);
                     Debug.log("  end   B%d  [%d, %d]  in: %s  out: %s  gen: %s  kill: %s", block.blockID, block.startBci, block.endBci, block.localsLiveIn, block.localsLiveOut, block.localsLiveGen,
                                     block.localsLiveKill);
