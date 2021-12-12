diff --git a/src/java/org/jivesoftware/util/JiveGlobals.java b/src/java/org/jivesoftware/util/JiveGlobals.java
index f2129c1..5a08d00 100644
--- a/src/java/org/jivesoftware/util/JiveGlobals.java
+++ b/src/java/org/jivesoftware/util/JiveGlobals.java
@@ -435,7 +435,7 @@
         String[] propNames = xmlProperties.getChildrenProperties(parent);
         List<String> values = new ArrayList<String>();
         for (String propName : propNames) {
-            String value = getProperty(parent + "." + propName);
+            String value = getXMLProperty(parent + "." + propName);
             if (value != null) {
                 values.add(value);
             }
