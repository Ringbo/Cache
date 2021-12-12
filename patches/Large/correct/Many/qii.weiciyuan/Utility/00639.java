diff --git a/src/org/qii/weiciyuan/support/utils/Utility.java b/src/org/qii/weiciyuan/support/utils/Utility.java
index 9e0a731..05a0b9b 100644
--- a/src/org/qii/weiciyuan/support/utils/Utility.java
+++ b/src/org/qii/weiciyuan/support/utils/Utility.java
@@ -427,7 +427,7 @@
             String result = content.substring(start + 1, end);
             value = Integer.valueOf(result);
         }
-        if (value < count) {
+        if (value <= count) {
             tab.setText(tabStrRes + "(" + count + ")");
         }
     }
