diff --git a/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/helper/OptionsHelper.java b/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/helper/OptionsHelper.java
index 871c12a..d02fdc8 100644
--- a/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/helper/OptionsHelper.java
+++ b/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/helper/OptionsHelper.java
@@ -81,7 +81,7 @@
 			String trace = options.get(key);
 			return !"false".equals(trace);
 		} else {
-			return true;
+			return false;
 		}
 	}
 
