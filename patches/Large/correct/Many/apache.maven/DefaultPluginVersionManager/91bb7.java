diff --git a/maven-core/src/main/java/org/apache/maven/plugin/version/DefaultPluginVersionManager.java b/maven-core/src/main/java/org/apache/maven/plugin/version/DefaultPluginVersionManager.java
index 041291b..b6a5b9e 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/version/DefaultPluginVersionManager.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/version/DefaultPluginVersionManager.java
@@ -289,7 +289,7 @@
                 message.append( "Registered Version: " ).append( version ).append( "\n" );
             }
 
-            message.append( "Detected (NEW) Version: " ).append( updatedVersion ).append( "\n" );
+            message.append( "Detected plugin version: " ).append( updatedVersion ).append( "\n" );
             message.append( "\n" );
             message.append( "Would you like to use this new version from now on? ( [Y]es, [n]o, [a]ll, n[o]ne ) " );
 
@@ -299,7 +299,7 @@
 
             String persistAnswer = inputHandler.readLine();
 
-            boolean shouldPersist = false;
+            boolean shouldPersist = true;
 
             if ( !StringUtils.isEmpty( persistAnswer ) )
             {
