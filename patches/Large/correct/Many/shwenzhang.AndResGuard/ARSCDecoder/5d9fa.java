diff --git a/AndResGuard-core/src/main/java/com/tencent/mm/androlib/res/decoder/ARSCDecoder.java b/AndResGuard-core/src/main/java/com/tencent/mm/androlib/res/decoder/ARSCDecoder.java
index 347675a..2340051 100644
--- a/AndResGuard-core/src/main/java/com/tencent/mm/androlib/res/decoder/ARSCDecoder.java
+++ b/AndResGuard-core/src/main/java/com/tencent/mm/androlib/res/decoder/ARSCDecoder.java
@@ -630,7 +630,7 @@
         if (mPkg.isCanProguard() && flags && type == TypedValue.TYPE_STRING && mShouldProguardForType && mShouldProguardTypeSet.contains(mType.getName())) {
             if (mTableStringsProguard.get(data) == null) {
                 String raw = mTableStrings.get(data).toString();
-                if (StringUtil.isBlank(raw)) return;
+                if (StringUtil.isBlank(raw) || raw.equalsIgnoreCase("null")) return;
 
                 String proguard = mPkg.getSpecRepplace(mResId);
                 //这个要写死这个，因为resources.arsc里面就是用这个
