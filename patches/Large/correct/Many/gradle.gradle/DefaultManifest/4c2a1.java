diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/java/archives/internal/DefaultManifest.java b/subprojects/plugins/src/main/groovy/org/gradle/api/java/archives/internal/DefaultManifest.java
index b583ffc..bcc6f5e 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/java/archives/internal/DefaultManifest.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/java/archives/internal/DefaultManifest.java
@@ -214,7 +214,7 @@
         } catch (ManifestException e) {
             throw new org.gradle.api.java.archives.ManifestException(e.getMessage(), e);
         } catch (IOException e) {
-            throw new UncheckedIOException(e.getMessage(), e);
+            throw new UncheckedIOException(e);
         }
     }
 
