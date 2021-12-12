diff --git a/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java b/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java
index 29de152..6dcc264 100644
--- a/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java
+++ b/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java
@@ -304,7 +304,7 @@
                 resourceCollector.addResource(RType.STYLEABLE, IdType.INT, String.format("%s_%s", resourceName, attrName), Integer.toString(count++));
 
                 if (!rawAttrName.startsWith("android:")) {
-                    resourceCollector.addIntResourceIfNotPresent(RType.ATTR, attrName);
+                    resourceCollector.addIntResourceIfNotPresent(RType.ATTR, rawAttrName);
                     resourceCollector.addRTypeResourceName(RType.ATTR, rawAttrName, nodeToString(attrNode, true), resourceDirectory);
                 }
             }
