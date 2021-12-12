diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index c183799..aa9fd37 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -1376,7 +1376,7 @@
 
   /** Map of registered methods, stored by name. */
   HashMap<String, RegisteredMethods> registerMap =
-    new HashMap<String, PApplet.RegisteredMethods>();
+    new HashMap<>();
 
 
   class RegisteredMethods {
@@ -9063,7 +9063,7 @@
 
 
   static public String[] split(String value, String delim) {
-    ArrayList<String> items = new ArrayList<String>();
+    List<String> items = new ArrayList<>();
     int index;
     int offset = 0;
     while ((index = value.indexOf(delim, offset)) != -1) {
@@ -9188,7 +9188,7 @@
   static public String[][] matchAll(String str, String regexp) {
     Pattern p = matchPattern(regexp);
     Matcher m = p.matcher(str);
-    ArrayList<String[]> results = new ArrayList<String[]>();
+    List<String[]> results = new ArrayList<>();
     int count = m.groupCount() + 1;
     while (m.find()) {
       String[] groups = new String[count];
