diff --git a/app/src/main/java/org/isoron/uhabits/utils/DateFormats.java b/app/src/main/java/org/isoron/uhabits/utils/DateFormats.java
index fac0d63..e5325ab 100644
--- a/app/src/main/java/org/isoron/uhabits/utils/DateFormats.java
+++ b/app/src/main/java/org/isoron/uhabits/utils/DateFormats.java
@@ -44,7 +44,7 @@
     {
         Locale locale = Locale.getDefault();
 
-        if (SDK_INT >= JELLY_BEAN)
+        if (SDK_INT >= JELLY_BEAN_MR2)
             skeleton = getBestDateTimePattern(locale, skeleton);
 
         return fromSkeleton(skeleton, locale);
