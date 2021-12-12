diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/HotSpotReplacementsUtil.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/HotSpotReplacementsUtil.java
index 92770a3..848bed2 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/HotSpotReplacementsUtil.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/HotSpotReplacementsUtil.java
@@ -354,7 +354,7 @@
 
     @Fold
     public static int instanceHeaderSize() {
-        return config().useCompressedKlassPointers ? (2 * wordSize()) - 4 : 2 * wordSize();
+        return config().useCompressedClassPointers ? (2 * wordSize()) - 4 : 2 * wordSize();
     }
 
     @Fold
