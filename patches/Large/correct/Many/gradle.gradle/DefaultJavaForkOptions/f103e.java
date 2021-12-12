diff --git a/subprojects/gradle-core/src/main/groovy/org/gradle/api/internal/tasks/util/DefaultJavaForkOptions.java b/subprojects/gradle-core/src/main/groovy/org/gradle/api/internal/tasks/util/DefaultJavaForkOptions.java
index eb971ff..30b1945 100755
--- a/subprojects/gradle-core/src/main/groovy/org/gradle/api/internal/tasks/util/DefaultJavaForkOptions.java
+++ b/subprojects/gradle-core/src/main/groovy/org/gradle/api/internal/tasks/util/DefaultJavaForkOptions.java
@@ -28,7 +28,7 @@
     private final Pattern noArgSysPropPattern = Pattern.compile("-D([^=]+)");
     private final Pattern maxHeapPattern = Pattern.compile("-Xmx(.+)");
     private final List<Object> extraJvmArgs = new ArrayList<Object>();
-    private final Map<String, Object> systemProperties = new TreeMap<String, Object>();
+    private final Map<String, Object> systemProperties = new HashMap<String, Object>();
     private String maxHeapSize;
 
     public DefaultJavaForkOptions(FileResolver resolver) {
@@ -104,7 +104,7 @@
     }
 
     public Map<String, String> getSystemProperties() {
-        Map<String, String> properties = new HashMap<String, String>();
+        Map<String, String> properties = new TreeMap<String, String>();
         for (Map.Entry<String, Object> entry : systemProperties.entrySet()) {
             Object value = entry.getValue();
             properties.put(entry.getKey(), value == null ? null : value.toString());
