diff --git a/src/main/java/org/elasticsearch/river/jdbc/strategy/simple/SimpleRiverSource.java b/src/main/java/org/elasticsearch/river/jdbc/strategy/simple/SimpleRiverSource.java
index eb07135..d9a8cbe 100644
--- a/src/main/java/org/elasticsearch/river/jdbc/strategy/simple/SimpleRiverSource.java
+++ b/src/main/java/org/elasticsearch/river/jdbc/strategy/simple/SimpleRiverSource.java
@@ -1000,7 +1000,7 @@
              */
             case Types.DOUBLE: {
                 String s = result.getString(i);
-                if (result.wasNull()) {
+                if (result.wasNull() || s == null) {
                     return null;
                 }
                 NumberFormat format = NumberFormat.getInstance(locale);
@@ -1027,7 +1027,7 @@
              */
             case Types.FLOAT: {
                 String s = result.getString(i);
-                if (result.wasNull()) {
+                if (result.wasNull() || s == null) {
                     return null;
                 }
                 NumberFormat format = NumberFormat.getInstance(locale);
@@ -1090,7 +1090,7 @@
              */
             case Types.REAL: {
                 String s = result.getString(i);
-                if (result.wasNull()) {
+                if (result.wasNull() || s == null) {
                     return null;
                 }
                 NumberFormat format = NumberFormat.getInstance(locale);
