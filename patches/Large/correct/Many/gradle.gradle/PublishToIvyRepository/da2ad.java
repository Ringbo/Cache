diff --git a/subprojects/ivy/src/main/java/org/gradle/api/publish/ivy/tasks/PublishToIvyRepository.java b/subprojects/ivy/src/main/java/org/gradle/api/publish/ivy/tasks/PublishToIvyRepository.java
index cafd99d..783567f 100644
--- a/subprojects/ivy/src/main/java/org/gradle/api/publish/ivy/tasks/PublishToIvyRepository.java
+++ b/subprojects/ivy/src/main/java/org/gradle/api/publish/ivy/tasks/PublishToIvyRepository.java
@@ -48,7 +48,7 @@
     public PublishToIvyRepository() {
 
         // Allow the publication to participate in incremental build
-        getInputs().file(new Callable<FileCollection>() {
+        getInputs().files(new Callable<FileCollection>() {
             public FileCollection call() throws Exception {
                 IvyPublicationInternal publicationInternal = getPublicationInternal();
                 return publicationInternal == null ? null : publicationInternal.getPublishableFiles();
