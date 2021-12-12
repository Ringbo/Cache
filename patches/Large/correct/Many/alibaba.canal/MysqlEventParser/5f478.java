diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
index 2efab0e..6c2b9d4 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/MysqlEventParser.java
@@ -763,7 +763,7 @@
                         }
 
                         if (StringUtils.equals(endPosition.getJournalName(), logfilename)
-                            && endPosition.getPosition() < logfileoffset) {
+                            && endPosition.getPosition() <= logfileoffset) {
                             return false;
                         }
 
