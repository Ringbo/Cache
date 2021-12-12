diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java b/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java
index 7a57d72..1309fd5 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java
@@ -403,12 +403,12 @@
         final Map<String, Object> antProps = this.getProject().getProperties();
         for (Map.Entry<String, Object> entry : antProps.entrySet()) {
             final String value = String.valueOf(entry.getValue());
-            retVal.put(entry.getKey(), value);
+            retVal.setProperty(entry.getKey(), value);
         }
 
         // override with properties specified in subelements
         for (Property p : overrideProps) {
-            retVal.put(p.getKey(), p.getValue());
+            retVal.setProperty(p.getKey(), p.getValue());
         }
 
         return retVal;
