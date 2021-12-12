diff --git a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/SnapshotAwareM2Resolver.java b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/SnapshotAwareM2Resolver.java
index 43e0ffb..e05f60e 100644
--- a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/SnapshotAwareM2Resolver.java
+++ b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/SnapshotAwareM2Resolver.java
@@ -162,16 +162,16 @@
                 if (metadata.exists()) {
                     metadataStream = metadata.openStream();
                     final StringBuilder timestamp = new StringBuilder();
-                    final StringBuilder buildNumer = new StringBuilder();
+                    final StringBuilder buildNumber = new StringBuilder();
                     XMLHelper.parse(metadataStream, null, new ContextualSAXHandler() {
                         @Override
                         public void endElement(String uri, String localName, String qName)
                                 throws SAXException {
-                            if ("metadata/versioning/lastUpdated".equals(getContext())) {
+                            if ("metadata/versioning/snapshot/timestamp".equals(getContext())) {
                                 timestamp.append(getText());
                             }
                             if ("metadata/versioning/snapshot/buildNumber".equals(getContext())) {
-                                buildNumer.append(getText());
+                                buildNumber.append(getText());
                             }
                             super.endElement(uri, localName, qName);
                         }
@@ -181,8 +181,8 @@
                         String rev = mrid.getRevision();
                         rev = rev.substring(0, rev.length() - "-SNAPSHOT".length());
 
-                        return new SnapshotRevision(rev, Long.parseLong(timestamp.toString()),
-                             Long.parseLong(buildNumer.toString()));
+                        return new SnapshotRevision(rev, timestamp.toString(),
+                             Long.parseLong(buildNumber.toString()));
                     }
                 } else {
                     Message.verbose("\tmaven-metadata not available: " + metadata);
@@ -215,10 +215,10 @@
         public final String uniqueRevision;
         public final long lastModified;
 
-        private SnapshotRevision(String revision, long timestamp, long buildNumber) {
+        private SnapshotRevision(String revision, String timestamp, long buildNumber) {        
             this.revision = revision + "-SNAPSHOT";
             this.uniqueRevision = revision + "-" + timestamp + "-" + buildNumber;
-            this.lastModified = calculateLastModified(timestamp);
+            this.lastModified = calculateLastModified(Long.parseLong(timestamp.replaceAll("\\.", "")));
         }
 
         static public long calculateLastModified(long timestamp) {
@@ -233,7 +233,7 @@
 
         @Override
         public String toString() {
-            return uniqueRevision;
+            return revision;
         }
     }
 
