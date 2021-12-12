diff --git a/src/org/nutz/conf/NutConf.java b/src/org/nutz/conf/NutConf.java
index e725685..f15b1ee 100644
--- a/src/org/nutz/conf/NutConf.java
+++ b/src/org/nutz/conf/NutConf.java
@@ -188,6 +188,6 @@
         Object re = me().map.get(key);
         if (re == null)
             return defaultValue;
-        return key;
+        return re;
     }
 }
