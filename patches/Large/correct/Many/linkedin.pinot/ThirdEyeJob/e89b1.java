diff --git a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/ThirdEyeJob.java b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/ThirdEyeJob.java
index a1d239b..e0ab0a1 100644
--- a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/ThirdEyeJob.java
+++ b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/ThirdEyeJob.java
@@ -1039,7 +1039,7 @@
                 }
               } catch (AccessControlException e) {
                 missingInputs.add(input);
-                LOGGER.info("No access to path {}", input);
+                LOGGER.warn("No access to path {}", input, e);
               }
             }
           }
