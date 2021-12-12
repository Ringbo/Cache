diff --git a/src/main/java/org/jabref/gui/SidePaneManager.java b/src/main/java/org/jabref/gui/SidePaneManager.java
index a7136da..500c78a 100644
--- a/src/main/java/org/jabref/gui/SidePaneManager.java
+++ b/src/main/java/org/jabref/gui/SidePaneManager.java
@@ -167,11 +167,11 @@
                 Class<? extends SidePaneComponent> componentClass = (Class<? extends SidePaneComponent>) Class.forName(componentName);
                 preferredPositions.put(componentClass, Integer.parseInt(componentPositions.get(i)));
             } catch (ClassNotFoundException e) {
-                LOGGER.error("Following side pane could not be found: " + componentName, e);
+                LOGGER.debug("Following side pane could not be found: " + componentName, e);
             } catch (ClassCastException e) {
-                LOGGER.error("Following Class is no side pane: '" + componentName, e);
+                LOGGER.debug("Following Class is no side pane: '" + componentName, e);
             } catch (NumberFormatException e) {
-                LOGGER.info("Invalid number format for side pane component '" + componentName + "'.", e);
+                LOGGER.debug("Invalid number format for side pane component '" + componentName + "'.", e);
             }
         }
 
