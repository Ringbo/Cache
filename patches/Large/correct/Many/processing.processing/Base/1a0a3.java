diff --git a/app/src/processing/app/Base.java b/app/src/processing/app/Base.java
index cb12b98..cf0eb73 100644
--- a/app/src/processing/app/Base.java
+++ b/app/src/processing/app/Base.java
@@ -803,7 +803,8 @@
                                                   null,
                                                   options,
                                                   options[0]);
-        if (result == JOptionPane.NO_OPTION) {
+        if (result == JOptionPane.NO_OPTION || 
+            result == JOptionPane.CLOSED_OPTION) {
           return false;
         }
       }
