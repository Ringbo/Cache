diff --git a/core-cube/src/main/java/org/apache/kylin/cube/CubeDescManager.java b/core-cube/src/main/java/org/apache/kylin/cube/CubeDescManager.java
index 1db66e1..78c71b7 100644
--- a/core-cube/src/main/java/org/apache/kylin/cube/CubeDescManager.java
+++ b/core-cube/src/main/java/org/apache/kylin/cube/CubeDescManager.java
@@ -98,7 +98,7 @@
                     cubeDesc.init(config);
                 } catch (Exception e) {
                     logger.warn("Broken cube desc " + cubeDesc.resourceName(), e);
-                    cubeDesc.addError(e.getMessage());
+                    cubeDesc.addError(e.toString());
                 }
                 return cubeDesc;
             }
@@ -193,7 +193,7 @@
                 cubeDesc.init(config);
             } catch (Exception e) {
                 logger.warn("Broken cube desc " + cubeDesc, e);
-                cubeDesc.addError(e.getMessage());
+                cubeDesc.addError(e.toString());
             }
             
             postProcessCubeDesc(cubeDesc);
@@ -239,7 +239,7 @@
                 desc.init(config);
             } catch (Exception e) {
                 logger.warn("Broken cube desc " + desc, e);
-                desc.addError(e.getMessage());
+                desc.addError(e.toString());
                 return desc;
             }
 
