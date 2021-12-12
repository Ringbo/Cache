diff --git a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java
index 1b7f53e..9450a22 100644
--- a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java
+++ b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java
@@ -386,7 +386,7 @@
 
         int numColumns = meta.getColumnCount();
         for (int i = 1; i <= numColumns; i++) {
-            sb.append(meta.getColumnName(i));
+            sb.append(meta.getColumnLabel(i));
             if (i==numColumns){
                 sb.append('\n');
             } else {
@@ -414,7 +414,7 @@
                         row = new HashMap<String, Object>(numColumns);
                         results.add(row);
                     }
-                    row.put(meta.getColumnName(i), o);
+                    row.put(meta.getColumnLabel(i), o);
                 }
                 if (o instanceof byte[]) {
                     o = new String((byte[]) o, ENCODING);
