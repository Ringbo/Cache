diff --git a/server-base/src/main/java/org/apache/kylin/rest/service/JobService.java b/server-base/src/main/java/org/apache/kylin/rest/service/JobService.java
index d2180a7..e84bc8d 100644
--- a/server-base/src/main/java/org/apache/kylin/rest/service/JobService.java
+++ b/server-base/src/main/java/org/apache/kylin/rest/service/JobService.java
@@ -438,7 +438,7 @@
                             if (executableCubeName == null)
                                 return true;
                             if (nameExactMatch)
-                                return executableCubeName.toLowerCase().equals(cubeName);
+                                return executableCubeName.equalsIgnoreCase(cubeName);
                             else
                                 return executableCubeName.toLowerCase().contains(cubeName.toLowerCase());
                         } else {
@@ -456,7 +456,7 @@
                         if (null == projectName || null == getProjectManager().getProject(projectName)) {
                             return true;
                         } else {
-                            return projectName.equals(executable.getProjectName());
+                            return projectName.equalsIgnoreCase(executable.getProjectName());
                         }
                     }
                 }, new Predicate<CubingJob>() {
@@ -487,9 +487,9 @@
                         }
 
                         if (nameExactMatch) {
-                            return cubeJob.getName().toLowerCase().equals(jobName);
+                            return cubeJob.getName().equalsIgnoreCase(jobName);
                         } else {
-                            return cubeJob.getName().toLowerCase().contains(jobName);
+                            return cubeJob.getName().toLowerCase().contains(jobName.toLowerCase());
                         }
                     }
                 })));
