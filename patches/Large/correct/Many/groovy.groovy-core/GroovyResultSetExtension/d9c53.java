diff --git a/subprojects/groovy-sql/src/main/java/groovy/sql/GroovyResultSetExtension.java b/subprojects/groovy-sql/src/main/java/groovy/sql/GroovyResultSetExtension.java
index e2254f2..91c82ff 100644
--- a/subprojects/groovy-sql/src/main/java/groovy/sql/GroovyResultSetExtension.java
+++ b/subprojects/groovy-sql/src/main/java/groovy/sql/GroovyResultSetExtension.java
@@ -69,7 +69,7 @@
 
     public String toString() {
         try {
-            StringBuffer sb = new StringBuffer("[");
+            StringBuilder sb = new StringBuilder("[");
             ResultSetMetaData metaData = resultSet.getMetaData();
             int count = metaData.getColumnCount();
             for (int i = 1; i <= count; i++) {
