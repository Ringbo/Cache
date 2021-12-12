diff --git a/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/IsolatedDaemonHomeTmpDirectoryProvider.java b/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/IsolatedDaemonHomeTmpDirectoryProvider.java
index 1475e42..935a30f 100644
--- a/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/IsolatedDaemonHomeTmpDirectoryProvider.java
+++ b/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/IsolatedDaemonHomeTmpDirectoryProvider.java
@@ -26,7 +26,7 @@
     private final File parentDir;
 
     public IsolatedDaemonHomeTmpDirectoryProvider() {
-        this(new File(SystemProperties.getInstance().getJavaIoTmpDir()));
+        this(new File(SystemProperties.getInstance().getUserHome()));
     }
 
     IsolatedDaemonHomeTmpDirectoryProvider(File parentDir) {
