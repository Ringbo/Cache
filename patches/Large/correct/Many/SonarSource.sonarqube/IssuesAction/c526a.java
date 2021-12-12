diff --git a/server/sonar-server/src/main/java/org/sonar/server/batch/IssuesAction.java b/server/sonar-server/src/main/java/org/sonar/server/batch/IssuesAction.java
index d53b87e..d7f79bf 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/batch/IssuesAction.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/batch/IssuesAction.java
@@ -102,7 +102,7 @@
           break;
         default:
           // only projects, modules and files are supported. Other types of components are not allowed.
-          throw new IllegalStateException(format("Component of scope '%s' is not allowed", component.scope()));
+          throw new IllegalArgumentException(format("Component of scope '%s' is not allowed", component.scope()));
       }
     }
   }
