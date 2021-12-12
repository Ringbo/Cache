diff --git a/src/main/java/com/alibaba/druid/stat/TableStat.java b/src/main/java/com/alibaba/druid/stat/TableStat.java
index 190a8ad..97229f1 100644
--- a/src/main/java/com/alibaba/druid/stat/TableStat.java
+++ b/src/main/java/com/alibaba/druid/stat/TableStat.java
@@ -453,7 +453,7 @@
 
         public String getFullName() {
             if (fullName == null) {
-                if (table != null) {
+                if (table == null) {
                     fullName = name;
                 } else {
                     fullName = table + '.' + name;
