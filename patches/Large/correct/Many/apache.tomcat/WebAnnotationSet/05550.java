diff --git a/java/org/apache/catalina/startup/WebAnnotationSet.java b/java/org/apache/catalina/startup/WebAnnotationSet.java
index 4b4a33d..8297681 100644
--- a/java/org/apache/catalina/startup/WebAnnotationSet.java
+++ b/java/org/apache/catalina/startup/WebAnnotationSet.java
@@ -366,11 +366,10 @@
             resource.setName(name);
             resource.setType(type);
 
-            if (annotation.authenticationType()
+            if (annotation.authentication()
                     == Resource.AuthenticationType.CONTAINER) {
                 resource.setAuth("Container");
-            }
-            else if (annotation.authenticationType()
+            } else if (annotation.authentication()
                     == Resource.AuthenticationType.APPLICATION) {
                 resource.setAuth("Application");
             }
