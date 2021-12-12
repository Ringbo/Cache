diff --git a/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/eclipse/model/Project.java b/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/eclipse/model/Project.java
index 9bbbf12..dd27d0d 100644
--- a/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/eclipse/model/Project.java
+++ b/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/eclipse/model/Project.java
@@ -178,7 +178,7 @@
                 nameNode != null ? nameNode.text() : null,
                 typeNode != null ? typeNode.text() : null,
                 locationNode != null ? locationNode.text() : null,
-                locationUriNode != null ? locationNode.text() : null
+                locationUriNode != null ? locationUriNode.text() : null
             ));
         }
     }
