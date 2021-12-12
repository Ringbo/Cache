diff --git a/community/kernel/src/main/java/org/neo4j/kernel/Version.java b/community/kernel/src/main/java/org/neo4j/kernel/Version.java
index a3bbc13..a330cfe 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/Version.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/Version.java
@@ -62,7 +62,7 @@
      */
     public String getVersion()
     {
-        if ( version == null )
+        if ( version == null || version.equals( "" ) )
         {
             return "<unknown>";
         }
