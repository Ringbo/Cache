diff --git a/common/buildcraft/lib/misc/LocaleUtil.java b/common/buildcraft/lib/misc/LocaleUtil.java
index f7ed32a..cdac3ae 100644
--- a/common/buildcraft/lib/misc/LocaleUtil.java
+++ b/common/buildcraft/lib/misc/LocaleUtil.java
@@ -56,7 +56,7 @@
         localeKeyFluidStaticEmpty = "buildcraft.fluid.empty." + (bucketFlow ? "bucket." : "milli.") + longName;
         localeKeyFluidStaticFull = "buildcraft.fluid.full." + (bucketFlow ? "bucket." : "milli.") + longName;
         localeKeyMjStatic = "buildcraft.mj.static." + longName;
-        localeKeyFluidFlow = "buildcraft.mj.flow." + timeGap + longName;
+        localeKeyMjFlow = "buildcraft.mj.flow." + timeGap + longName;
     }
 
     /** Localizes the give key to the current locale.
