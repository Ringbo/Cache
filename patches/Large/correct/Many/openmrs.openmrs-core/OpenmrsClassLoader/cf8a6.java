diff --git a/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java b/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java
index f574bb6..4ef2e41 100644
--- a/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java
+++ b/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java
@@ -363,7 +363,7 @@
 				field.setAccessible(true);
 				field.set(cacheManager, null);
 			}
-			catch (Throwable ex) {
+			catch (Exception ex) {
 				log.error(ex.getMessage(), ex);
 			}
 		}
@@ -470,7 +470,7 @@
 					log.info("onShutdown Stopping thread: " + thread.getName());
 					thread.stop();
 				}
-				catch (Throwable ex) {
+				catch (Exception ex) {
 					log.error(ex.getMessage(), ex);
 				}
 			}
