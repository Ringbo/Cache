diff --git a/samples/AllMethodsLevels.java b/samples/AllMethodsLevels.java
index 22cfe71..9e41e8c 100644
--- a/samples/AllMethodsLevels.java
+++ b/samples/AllMethodsLevels.java
@@ -64,7 +64,7 @@
      */
     @OnEvent("l0")
     public static void setL0() {
-        BTraceUtils.setInstrLevel(0);
+        BTraceUtils.setIntrusionLevel(0);
     }
 
     /**
@@ -72,6 +72,6 @@
      */
     @OnEvent("l1")
     public static void setL1() {
-        BTraceUtils.setInstrLevel(1);
+        BTraceUtils.setIntrusionLevel(1);
     }
 }
\ No newline at end of file
