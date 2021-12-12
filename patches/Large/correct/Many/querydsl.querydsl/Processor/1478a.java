diff --git a/querydsl-apt/src/main/java/com/mysema/query/apt/Processor.java b/querydsl-apt/src/main/java/com/mysema/query/apt/Processor.java
index c0ba693..ab73aa0 100644
--- a/querydsl-apt/src/main/java/com/mysema/query/apt/Processor.java
+++ b/querydsl-apt/src/main/java/com/mysema/query/apt/Processor.java
@@ -476,7 +476,7 @@
             return true;
         }
                 
-        if (configuration.getSupertypeSerializer() != null && element.getAnnotation(configuration.getSuperTypeAnnotation()) != null) {
+        if (configuration.getSuperTypeAnnotation() != null && element.getAnnotation(configuration.getSuperTypeAnnotation()) != null) {
             return true;
         }
         
