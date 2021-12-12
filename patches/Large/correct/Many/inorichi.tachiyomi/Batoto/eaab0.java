diff --git a/app/src/main/java/eu/kanade/mangafeed/data/source/online/english/Batoto.java b/app/src/main/java/eu/kanade/mangafeed/data/source/online/english/Batoto.java
index 7acbf1a..02ee94d 100644
--- a/app/src/main/java/eu/kanade/mangafeed/data/source/online/english/Batoto.java
+++ b/app/src/main/java/eu/kanade/mangafeed/data/source/online/english/Batoto.java
@@ -52,7 +52,7 @@
     public Batoto(Context context) {
         super(context);
 
-        datePattern = Pattern.compile("(\\d+|A)\\s+(.*?)s? ago.*");
+        datePattern = Pattern.compile("(\\d+|A|An)\\s+(.*?)s? ago.*");
         dateFields = new HashMap<String, Integer>() {{
             put("second", Calendar.SECOND);
             put("minute", Calendar.MINUTE);
@@ -352,7 +352,7 @@
 
             if (m.matches()) {
                 String number = m.group(1);
-                int amount = number.equals("A") ? 1 : Integer.parseInt(m.group(1));
+                int amount = number.contains("A") ? 1 : Integer.parseInt(m.group(1));
                 String unit = m.group(2);
 
                 Calendar cal = Calendar.getInstance();
