diff --git a/src/main/java/org/nlpcn/es4sql/domain/Paramer.java b/src/main/java/org/nlpcn/es4sql/domain/Paramer.java
index dab9c03..cd69573 100644
--- a/src/main/java/org/nlpcn/es4sql/domain/Paramer.java
+++ b/src/main/java/org/nlpcn/es4sql/domain/Paramer.java
@@ -58,7 +58,7 @@
 
                     case "fields":
                         int index;
-                        for (String f : Strings.split(Util.expr2Object(sqlExpr.getRight()).toString(), ",")) {
+                        for (String f : Strings.splitStringByCommaToArray(Util.expr2Object(sqlExpr.getRight()).toString())) {
                             index = f.lastIndexOf('^');
                             if (-1 < index) {
                                 instance.fieldsBoosts.put(f.substring(0, index), Float.parseFloat(f.substring(index + 1)));
