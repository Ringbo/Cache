diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
index a5dfcdf..f220add 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
@@ -776,7 +776,7 @@
                 String startQuote = quotePair[0];
                 String endQuote = quotePair[1];
                 if (!CommonUtils.isEmpty(startQuote) && !CommonUtils.isEmpty(endQuote) && name.startsWith(startQuote)) {
-                    int endPos = name.indexOf(endQuote);
+                    int endPos = name.indexOf(endQuote, startQuote.length());
                     if (endPos != -1) {
                         // Quoted part
                         nameList.add(name.substring(startQuote.length(), endPos));
