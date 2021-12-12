diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nfi/HotSpotNativeFunctionHandle.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nfi/HotSpotNativeFunctionHandle.java
index 66e134a..2fcea5b 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nfi/HotSpotNativeFunctionHandle.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nfi/HotSpotNativeFunctionHandle.java
@@ -63,7 +63,7 @@
         assert checkArgs(args);
         try {
             traceCall(args);
-            Object res = code.executeVarargs(args);
+            Object res = code.executeVarargs(args, null, null);
             traceResult(res);
             return res;
         } catch (InvalidInstalledCodeException e) {
