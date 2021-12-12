diff --git a/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java b/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java
index b71e7c1..b551da2 100644
--- a/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java
+++ b/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java
@@ -381,7 +381,7 @@
 
       FastIDSet result = new FastIDSet();
       while (rs.next()) {
-        result.add(rs.getLong(1));
+        result.add(rs.getLong(2));
       }
 
       if (result.isEmpty()) {
