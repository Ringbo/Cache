diff --git a/src/org/traccar/web/CsvBuilder.java b/src/org/traccar/web/CsvBuilder.java
index a25b839..f59aabc 100644
--- a/src/org/traccar/web/CsvBuilder.java
+++ b/src/org/traccar/web/CsvBuilder.java
@@ -37,10 +37,10 @@
         SortedSet<Method> methods = new TreeSet<Method>(new Comparator<Method>() {
             @Override
             public int compare(Method m1, Method m2) {
-                if (m1.getName().equals("getAttributes") & !m1.getName().equals(m2.getName())) {
+                if (m1.getName().equals("getAttributes") && !m1.getName().equals(m2.getName())) {
                     return 1;
                 }
-                if (m2.getName().equals("getAttributes") & !m1.getName().equals(m2.getName())) {
+                if (m2.getName().equals("getAttributes") && !m1.getName().equals(m2.getName())) {
                     return -1;
                 }
                 return m1.getName().compareTo(m2.getName());
