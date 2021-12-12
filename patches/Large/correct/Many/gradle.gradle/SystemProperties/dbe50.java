diff --git a/subprojects/base-services/src/main/java/org/gradle/internal/SystemProperties.java b/subprojects/base-services/src/main/java/org/gradle/internal/SystemProperties.java
index 55dbbd8..4400676 100644
--- a/subprojects/base-services/src/main/java/org/gradle/internal/SystemProperties.java
+++ b/subprojects/base-services/src/main/java/org/gradle/internal/SystemProperties.java
@@ -73,35 +73,35 @@
     }
 
     @SuppressWarnings("unchecked")
-    public Map<String, String> asMap() {
+    public synchronized Map<String, String> asMap() {
         return (Map) System.getProperties();
     }
 
-    public String getLineSeparator() {
+    public synchronized String getLineSeparator() {
         return System.getProperty("line.separator");
     }
 
-    public String getJavaIoTmpDir() {
+    public synchronized String getJavaIoTmpDir() {
         return System.getProperty("java.io.tmpdir");
     }
 
-    public String getUserHome() {
+    public synchronized String getUserHome() {
         return System.getProperty("user.home");
     }
 
-    public String getUserName() {
+    public synchronized String getUserName() {
         return System.getProperty("user.name");
     }
 
-    public String getJavaVersion() {
+    public synchronized String getJavaVersion() {
         return System.getProperty("java.version");
     }
 
-    public File getCurrentDir() {
+    public synchronized File getCurrentDir() {
         return new File(System.getProperty("user.dir"));
     }
 
-    public File getJavaHomeDir() {
+    public synchronized File getJavaHomeDir() {
         return new File(System.getProperty("java.home"));
     }
 
