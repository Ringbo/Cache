diff --git a/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileBackuper.java b/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileBackuper.java
index 6a35664..73c4599 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileBackuper.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileBackuper.java
@@ -201,7 +201,7 @@
     }
   }
 
-  private SMInputFactory initStax() {
+  private static SMInputFactory initStax() {
     XMLInputFactory xmlFactory = XMLInputFactory.newInstance();
     xmlFactory.setProperty(XMLInputFactory.IS_COALESCING, Boolean.TRUE);
     xmlFactory.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, Boolean.FALSE);
