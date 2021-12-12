diff --git a/api/src/main/java/org/openmrs/module/ModuleFactory.java b/api/src/main/java/org/openmrs/module/ModuleFactory.java
index 177b4c1..efe40d4 100644
--- a/api/src/main/java/org/openmrs/module/ModuleFactory.java
+++ b/api/src/main/java/org/openmrs/module/ModuleFactory.java
@@ -1093,7 +1093,7 @@
 				if (mod.getModuleActivator() != null)// if extends BaseModuleActivator
 					mod.getModuleActivator().willStop();
 			}
-			catch (Throwable t) {
+			catch (Exception t) {
 				log.warn("Unable to call module's Activator.willStop() method", t);
 			}
 			
@@ -1154,12 +1154,12 @@
 								Context.removeAdvice(cls, (Advice) aopObject);
 							}
 						}
-						catch (Throwable t) {
+						catch (Exception t) {
 							log.warn("Could not remove advice point: " + advice.getPoint(), t);
 						}
 					}
 				}
-				catch (Throwable t) {
+				catch (Exception t) {
 					log.warn("Error while getting advicePoints from module: " + moduleId, t);
 				}
 				
@@ -1180,7 +1180,7 @@
 						}
 					}
 				}
-				catch (Throwable t) {
+				catch (Exception t) {
 					log.warn("Error while getting extensions from module: " + moduleId, t);
 				}
 			}
@@ -1199,7 +1199,7 @@
 				else
 					mod.getActivator().shutdown();//implements old  Activator interface
 			}
-			catch (Throwable t) {
+			catch (Exception t) {
 				log.warn("Unable to call module's Activator.shutdown() method", t);
 			}
 			
