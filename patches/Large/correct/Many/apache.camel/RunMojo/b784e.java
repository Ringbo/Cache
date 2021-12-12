diff --git a/tooling/maven/camel-maven-plugin/src/main/java/org/apache/camel/maven/RunMojo.java b/tooling/maven/camel-maven-plugin/src/main/java/org/apache/camel/maven/RunMojo.java
index 48d7839..0b0100c 100644
--- a/tooling/maven/camel-maven-plugin/src/main/java/org/apache/camel/maven/RunMojo.java
+++ b/tooling/maven/camel-maven-plugin/src/main/java/org/apache/camel/maven/RunMojo.java
@@ -524,7 +524,7 @@
     class IsolatedThreadGroup extends ThreadGroup {
         Throwable uncaughtException; // synchronize access to this
 
-        public IsolatedThreadGroup(String name) {
+        IsolatedThreadGroup(String name) {
             super(name);
         }
 
