diff --git a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/DownloadedIvyModuleDescriptorParser.java b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/DownloadedIvyModuleDescriptorParser.java
index 33b926d..cb5c3aa 100644
--- a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/DownloadedIvyModuleDescriptorParser.java
+++ b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/DownloadedIvyModuleDescriptorParser.java
@@ -28,7 +28,7 @@
 
 public class DownloadedIvyModuleDescriptorParser extends XmlModuleDescriptorParser {
     @Override
-    public ModuleDescriptor parseDescriptor(ParserSettings ivySettings, URL xmlURL, Resource res, boolean validate) throws ParseException, IOException {
+    synchronized public ModuleDescriptor parseDescriptor(ParserSettings ivySettings, URL xmlURL, Resource res, boolean validate) throws ParseException, IOException {
         DefaultModuleDescriptor descriptor = (DefaultModuleDescriptor) super.parseDescriptor(ivySettings, xmlURL, res, validate);
         descriptor.setDefault(false);
         return descriptor;
