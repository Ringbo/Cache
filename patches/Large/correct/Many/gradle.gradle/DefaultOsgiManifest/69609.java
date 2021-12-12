diff --git a/src/main/groovy/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java b/src/main/groovy/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java
index 9e9fce2..c80c9bf 100644
--- a/src/main/groovy/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java
+++ b/src/main/groovy/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java
@@ -59,7 +59,7 @@
             setAnalyzerProperties(analyzer);
             return analyzer.calcManifest();
         } catch (IOException e) {
-            throw new RuntimeException();
+            throw new RuntimeException(e);
         }
     }
 
