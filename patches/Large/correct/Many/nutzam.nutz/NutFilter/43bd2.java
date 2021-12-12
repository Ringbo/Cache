diff --git a/src/org/nutz/mvc/NutFilter.java b/src/org/nutz/mvc/NutFilter.java
index 243b3be..ac8947c 100644
--- a/src/org/nutz/mvc/NutFilter.java
+++ b/src/org/nutz/mvc/NutFilter.java
@@ -90,10 +90,10 @@
         		tmp = tmp.trim().intern();
         		if (tmp.length() > 1) {
         			if (tmp.startsWith("*")) {
-    					prefix.add(tmp.substring(1));
+        			    suffix.add(tmp.substring(1));
     					continue;
     				} else if (tmp.endsWith("*")) {
-    					suffix.add(tmp.substring(0, tmp.length() - 1));
+    					prefix.add(tmp.substring(0, tmp.length() - 1));
     					continue;
     				}
         		}
