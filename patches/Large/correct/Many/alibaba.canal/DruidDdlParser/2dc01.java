diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/ddl/DruidDdlParser.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/ddl/DruidDdlParser.java
index 958dc73..64ddc72 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/ddl/DruidDdlParser.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/ddl/DruidDdlParser.java
@@ -187,7 +187,7 @@
     }
 
     public static String unescapeName(String name) {
-        if (name.length() > 2) {
+        if (name != null && name.length() > 2) {
             char c0 = name.charAt(0);
             char x0 = name.charAt(name.length() - 1);
             if ((c0 == '"' && x0 == '"') || (c0 == '`' && x0 == '`')) {
@@ -199,7 +199,7 @@
     }
 
     public static String unescapeQuotaName(String name) {
-        if (name.length() > 2) {
+        if (name != null && name.length() > 2) {
             char c0 = name.charAt(0);
             char x0 = name.charAt(name.length() - 1);
             if (c0 == '\'' && x0 == '\'') {
