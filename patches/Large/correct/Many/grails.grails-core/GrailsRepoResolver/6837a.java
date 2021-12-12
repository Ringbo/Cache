diff --git a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsRepoResolver.java b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsRepoResolver.java
index 5435dbb..a1c94c5 100644
--- a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsRepoResolver.java
+++ b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsRepoResolver.java
@@ -74,7 +74,7 @@
     public String transformGrailsRepositoryPattern(ModuleRevisionId mrid, String pattern) {
         final String revision = mrid.getRevision();
         String versionTag;
-        if (revision.equals("latest.integration") || revision.equals("latest")) {
+        if (revision.equals("latest.integration") || revision.equals("latest")|| revision.equals("latest.release")) {
             versionTag = "LATEST_RELEASE";
         }
         else {
