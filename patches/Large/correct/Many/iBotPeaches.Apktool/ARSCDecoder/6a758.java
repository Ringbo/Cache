diff --git a/src/brut/androlib/res/decoder/ARSCDecoder.java b/src/brut/androlib/res/decoder/ARSCDecoder.java
index 4a14222..2719ab3 100644
--- a/src/brut/androlib/res/decoder/ARSCDecoder.java
+++ b/src/brut/androlib/res/decoder/ARSCDecoder.java
@@ -302,7 +302,7 @@
 
             ResValue value = new ResBoolValue(false);
             ResResource res = new ResResource(
-                mPkg.getConfig(new ResConfigFlags()), spec, value);
+                mPkg.getOrCreateConfig(new ResConfigFlags()), spec, value);
             mPkg.addResource(res);
             mConfig.addResource(res);
             spec.addResource(res);
