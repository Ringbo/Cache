diff --git a/src/org/nutz/lang/Xmls.java b/src/org/nutz/lang/Xmls.java
index fbb04ba..6456776 100644
--- a/src/org/nutz/lang/Xmls.java
+++ b/src/org/nutz/lang/Xmls.java
@@ -503,7 +503,7 @@
                 Map<String, Object> tmp = asMap(_ele, lowerFirst, dupAsList, alwaysAsList);
                 if (!tmp.isEmpty()) {
                     if (alwaysAsList != null && alwaysAsList.contains(key)) {
-                        map.addv2(key, map);
+                        map.addv2(key, tmp);
                     }
                     else if (dupAsList) {
                         map.addv(key, tmp);
