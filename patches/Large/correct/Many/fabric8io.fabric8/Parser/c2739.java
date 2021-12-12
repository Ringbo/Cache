diff --git a/fabric/fabric-agent/src/main/java/io/fabric8/agent/mvn/Parser.java b/fabric/fabric-agent/src/main/java/io/fabric8/agent/mvn/Parser.java
index d985230..6529707 100644
--- a/fabric/fabric-agent/src/main/java/io/fabric8/agent/mvn/Parser.java
+++ b/fabric/fabric-agent/src/main/java/io/fabric8/agent/mvn/Parser.java
@@ -120,7 +120,7 @@
                 withoutMvnPrefix = withoutMvnPrefix.substring(idx + 1);
             }
             // there may be a inlined maven repo location (assuming http), so we are done if we find that
-            if (withoutMvnPrefix.startsWith("http:")) {
+            if (withoutMvnPrefix.startsWith("http:") || withoutMvnPrefix.startsWith("https:")) {
                 done = true;
             } else if (withoutMvnPrefix.indexOf(':') < 0) {
                 done = true;
