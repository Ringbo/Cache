diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/CheckStyleTask.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/CheckStyleTask.java
index 065da61..530ed0e 100644
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/CheckStyleTask.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/CheckStyleTask.java
@@ -76,18 +76,18 @@
     /**
      * Sets a properties file for use instead
      * of individually setting them
-     * @param props the properties File to use
+     * @param aProps the properties File to use
      */
-    public void setProperties(File props)
+    public void setProperties(File aProps)
     {
         Properties mProperties = new Properties();
         try {
-            mProperties.load(new FileInputStream(props));
+            mProperties.load(new FileInputStream(aProps));
             mConfig = new Configuration(mProperties, System.out);
         }
         catch (Exception e) {
             throw new BuildException(
-                "Could not find Properties file '" + props + "'", location);
+                "Could not find Properties file '" + aProps + "'", location);
         }
     }
 
