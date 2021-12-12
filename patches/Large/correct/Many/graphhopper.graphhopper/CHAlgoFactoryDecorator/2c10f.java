diff --git a/core/src/main/java/com/graphhopper/routing/ch/CHAlgoFactoryDecorator.java b/core/src/main/java/com/graphhopper/routing/ch/CHAlgoFactoryDecorator.java
index f4898ea..7407fdd 100644
--- a/core/src/main/java/com/graphhopper/routing/ch/CHAlgoFactoryDecorator.java
+++ b/core/src/main/java/com/graphhopper/routing/ch/CHAlgoFactoryDecorator.java
@@ -80,7 +80,7 @@
         // default is enabled & fastest
         String chWeightingsStr = args.get(CH.PREPARE + "weightings", "");
 
-        if ("no".equals(chWeightingsStr)) {
+        if ("no".equals(chWeightingsStr) || "false".equals(chWeightingsStr)) {
             // default is fastest and we need to clear this explicitely
             weightingsAsStrings.clear();
         } else if (!chWeightingsStr.isEmpty()) {
