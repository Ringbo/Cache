diff --git a/python/edu/interactive-learning-python/src/com/jetbrains/edu/learning/PyStudyInitialConfigurator.java b/python/edu/interactive-learning-python/src/com/jetbrains/edu/learning/PyStudyInitialConfigurator.java
index de932d1..a97dd83 100644
--- a/python/edu/interactive-learning-python/src/com/jetbrains/edu/learning/PyStudyInitialConfigurator.java
+++ b/python/edu/interactive-learning-python/src/com/jetbrains/edu/learning/PyStudyInitialConfigurator.java
@@ -64,7 +64,7 @@
           }
         }
         copyCourse(file, newCourses);
-        propertiesComponent.setValue(CONFIGURED_V11, "true");
+        propertiesComponent.setValue(CONFIGURED_V2, "true");
       }
       catch (IOException e) {
         LOG.warn("Couldn't copy bundled courses " + e);
