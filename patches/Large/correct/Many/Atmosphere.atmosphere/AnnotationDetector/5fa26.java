diff --git a/modules/cpr/src/main/java/org/atmosphere/util/annotation/AnnotationDetector.java b/modules/cpr/src/main/java/org/atmosphere/util/annotation/AnnotationDetector.java
index 97dc4b1..950f95e 100644
--- a/modules/cpr/src/main/java/org/atmosphere/util/annotation/AnnotationDetector.java
+++ b/modules/cpr/src/main/java/org/atmosphere/util/annotation/AnnotationDetector.java
@@ -188,7 +188,7 @@
 
     // Only used during development. If set to "true" debug messages are displayed.
     private static final boolean DEBUG = false;
-    private final Logger logger = LoggerFactory.getLogger(AnnotationDetector.class);
+    private final static Logger logger = LoggerFactory.getLogger(AnnotationDetector.class);
 
     // Constant Pool type tags
     private static final int CP_UTF8 = 1;
@@ -795,7 +795,7 @@
                 }
                 logMessage = String.format(message, args);
             }
-            System.out.println(logMessage); // SUPPRESS CHECKSTYLE RegexpSinglelineJavaCheck
+            logger.debug(logMessage); // SUPPRESS CHECKSTYLE RegexpSinglelineJavaCheck
         }
     }
 
